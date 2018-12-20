package com.guonl.controller;

import com.guonl.po.SysUser;
import com.guonl.vo.FrontResult;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

/**
 * Created by guonl
 * Date 2018/12/20 10:54 PM
 * Description:
 */
@Controller
@RequestMapping
public class LoginController {

    public static final String USER_SESSION = "USER_SESSION";

    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public FrontResult login(HttpServletRequest request){
        HttpSession session = request.getSession();
        //先写死，让能顺利登录
        Long userId = Long.parseLong("1");
        String userName = "admin";
        String password = "123456";
        boolean rememberMe = false;
        SysUser user = new SysUser();
        user.setUserId(userId);
        user.setLoginAccount(userName);
        user.setLoginPass(password);
        //存入session
        Subject subject = SecurityUtils.getSubject();
        //记得传入明文密码
        subject.login(new UsernamePasswordToken(userName, password, rememberMe));
        session.setAttribute(USER_SESSION, user);
        return FrontResult.success("登录成功！！！");
    }

    //post登录
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestBody Map map){
        //添加用户认证信息
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(
                map.get("username").toString(),
                map.get("password").toString());
        //进行验证，这里可以捕获异常，然后返回对应信息
        subject.login(usernamePasswordToken);
        return "login";
    }

    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }

    // 登出
    @ResponseBody
    @RequestMapping("/user/logout")
    public FrontResult logout(HttpServletRequest request){
        HttpSession session = request.getSession();
        //退出权限验证
        SecurityUtils.getSubject().logout();
        //销毁session
//        session.invalidate();
        return FrontResult.success("登出成功！！！");
    }

    //错误页面展示
    @RequestMapping(value = "/error",method = RequestMethod.POST)
    public String error(){
        return "error ok!";
    }


}
