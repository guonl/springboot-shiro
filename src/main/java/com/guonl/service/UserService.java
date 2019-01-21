package com.guonl.service;

import com.guonl.po.SysUser;
import com.guonl.vo.FrontResult;
import java.util.Map;

/**
 * Created by guonl
 * Date 2018/12/19 11:47 PM
 * Description:
 */
public interface UserService {

    FrontResult getAllUsers();

    SysUser getSysUserByName(String userName);

    SysUser addUser(Map<String, Object> map);

}
