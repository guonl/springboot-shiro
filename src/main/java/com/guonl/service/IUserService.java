package com.guonl.service;

import com.guonl.po.SysUser;
import com.guonl.vo.FrontResult;
import com.guonl.vo.UserVo;

import java.util.Map;

/**
 * Created by guonl
 * Date 2018/12/19 11:47 PM
 * Description:
 */
public interface IUserService {

    FrontResult getAllUsers();

    UserVo getUserById(Long id);

    SysUser getSysUserByName(String userName);

    SysUser addUser(Map<String, Object> map);

}
