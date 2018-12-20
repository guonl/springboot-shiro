package com.guonl.service.impl;

import com.google.common.collect.Lists;
import com.guonl.dao.*;
import com.guonl.po.*;
import com.guonl.service.IUserService;
import com.guonl.vo.FrontResult;
import com.guonl.vo.RoleVo;
import com.guonl.vo.UserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by guonl
 * Date 2018/12/19 9:21 PM
 * Description:
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private SysUserMapper userMapper;
    @Autowired
    private SysRoleMapper roleMapper;
    @Autowired
    private SysUserRoleMapper userRoleMapper;
    @Autowired
    private SysRolePermissionMapper permissionMapper;


    public FrontResult getAllUsers() {
        SysUserExample example = new SysUserExample();
        List<SysUser> sysUsers = userMapper.selectByExample(example);
        return FrontResult.success(sysUsers);
    }

    @Override
    public UserVo getUserById(Long id) {
        SysUser sysUser = userMapper.selectByPrimaryKey(id);


        return null;
    }

    @Override
    public SysUser getSysUserByName(String userName) {
        SysUser sysUser = null;
        SysUserExample example = new SysUserExample();
        example.createCriteria().andLoginAccountEqualTo(userName);
        List<SysUser> sysUsers = userMapper.selectByExample(example);
        if(!sysUsers.isEmpty()){
            sysUser = sysUsers.get(0);
        }
        return sysUser;
    }

    @Override
    public SysUser addUser(Map<String, Object> map) {
        return null;
    }

    private List<RoleVo> getUserRole(Long userId){
        //1.先查询用户角色关系表 sys_user_role
        SysUserRoleExample example = new SysUserRoleExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<SysUserRole> userRoles = userRoleMapper.selectByExample(example);
        List<Integer> roleIdList = userRoles.stream().map(x -> x.getRoleId()).collect(Collectors.toList());
        //2.查询用户有所多少角色  sys_role
        SysRoleExample roleExample = new SysRoleExample();
        roleExample.createCriteria().andRoleIdIn(roleIdList);
        List<SysRole> sysRoles = roleMapper.selectByExample(roleExample);
        List<RoleVo> list = Lists.newArrayList();
        sysRoles.forEach(x->{
            //3.根据roleId查询 sys_role_permission
            RoleVo roleVo = new RoleVo();
            BeanUtils.copyProperties(x,roleVo);
            Integer roleId = x.getRoleId();
            SysRolePermissionExample permissionExample = new SysRolePermissionExample();
            permissionExample.createCriteria().andRoleIdEqualTo(roleId);
            List<SysRolePermission> sysRolePermissions = permissionMapper.selectByExample(permissionExample);
            List<String> permissionList = sysRolePermissions.stream().map(y -> y.getPermissions()).collect(Collectors.toList());
            roleVo.setPermissions(permissionList);
            list.add(roleVo);
        });
        return list;
    }
}
