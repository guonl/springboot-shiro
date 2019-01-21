package com.guonl.service;

import com.alibaba.fastjson.JSONObject;
import com.guonl.po.SysUser;
import com.guonl.vo.FrontResult;

/**
 * Created by guonl
 * Date 2018/12/22 10:46 AM
 * Description:
 */
public interface LoginService {

    FrontResult authLogin(JSONObject requestJson);

    SysUser getUserByName(String loginName);

    FrontResult getInfo();

    FrontResult logout();
}
