package com.guonl.controller;

import com.alibaba.fastjson.JSONObject;
import com.guonl.service.LoginService;
import com.guonl.util.CommonUtil;
import com.guonl.vo.FrontResult;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by guonl
 * Date 2018/12/20 10:54 PM
 * Description:
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
     * 登录
     * @param requestJson
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/auth",method = RequestMethod.POST)
    public FrontResult authLogin(@RequestBody JSONObject requestJson) {
        CommonUtil.hasAllRequired(requestJson, "username,password");
        FrontResult result = loginService.authLogin(requestJson);
        return result;
    }


    /**
     * 查询当前登录用户的信息
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    public FrontResult getInfo() {
        return loginService.getInfo();
    }

    /**
     * 登出
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/logout",method = RequestMethod.POST)
    public FrontResult logout() {
        return loginService.logout();
    }


}
