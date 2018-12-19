package com.guonl.service;

import com.guonl.dao.SysUserMapper;
import com.guonl.po.SysUser;
import com.guonl.po.SysUserExample;
import com.guonl.vo.FrontResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by guonl
 * Date 2018/12/19 9:21 PM
 * Description:
 */
@Service
public class UserService {

    @Autowired
    private SysUserMapper userMapper;

    public FrontResult getAllUsers() {
        SysUserExample example = new SysUserExample();
        List<SysUser> sysUsers = userMapper.selectByExample(example);
        return FrontResult.success(sysUsers);
    }
}
