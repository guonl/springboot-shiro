package com.guonl.service.impl;

import com.guonl.dao.SysRoleMapper;
import com.guonl.dao.SysRolePermissionMapper;
import com.guonl.dao.SysUserMapper;
import com.guonl.po.SysUser;
import com.guonl.po.SysUserExample;
import com.guonl.service.UserService;
import com.guonl.vo.FrontResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

/**
 * Created by guonl
 * Date 2018/12/19 9:21 PM
 * Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserMapper userMapper;
    @Autowired
    private SysRoleMapper roleMapper;
    @Autowired
    private SysRolePermissionMapper permissionMapper;


    public FrontResult getAllUsers() {
        SysUserExample example = new SysUserExample();
        List<SysUser> sysUsers = userMapper.selectByExample(example);
        return FrontResult.success(sysUsers);
    }

    @Override
    public SysUser getSysUserByName(String userName) {
        return null;
    }


    @Override
    public SysUser addUser(Map<String, Object> map) {
        return null;
    }

}
