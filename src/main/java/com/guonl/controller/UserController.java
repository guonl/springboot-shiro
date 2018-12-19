package com.guonl.controller;

import com.guonl.service.UserService;
import com.guonl.vo.FrontResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by guonl
 * Date 2018/12/19 9:18 PM
 * Description:
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public FrontResult getAllUsers(){
        FrontResult result = userService.getAllUsers();
        return result;
    }


}
