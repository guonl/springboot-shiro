package com.guonl.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.guonl.dao.SysUserMapper;
import com.guonl.dao.custom.PermissionService;
import com.guonl.po.SysUser;
import com.guonl.po.SysUserExample;
import com.guonl.service.LoginService;
import com.guonl.util.constants.Constants;
import com.guonl.vo.FrontResult;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by guonl
 * Date 2018/12/22 10:46 AM
 * Description:
 */
@Service
public class LoginServiceImpl implements LoginService {

    private static Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

    @Autowired
    private SysUserMapper userMapper;
    @Autowired
    private PermissionService permissionService;

    @Override
    public FrontResult authLogin(JSONObject jsonObject) {
        String username = jsonObject.getString("username");
        String password = jsonObject.getString("password");
        JSONObject returnData = new JSONObject();
        Subject currentUser = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
            currentUser.login(token);
            returnData.put("result", "success");
        } catch (AuthenticationException e) {
            returnData.put("result", "fail");
        }
        return FrontResult.success(returnData);
    }

    @Override
    public SysUser getUserByName(String loginName) {
        SysUser user = null;
        SysUserExample example = new SysUserExample();
        example.createCriteria().andUsernameEqualTo(loginName);
        List<SysUser> sysUsers = userMapper.selectByExample(example);
        if(!sysUsers.isEmpty()){
            user = sysUsers.get(0);
        }
        return user;
    }

    @Override
    public FrontResult getInfo() {
        Session session = SecurityUtils.getSubject().getSession();
        SysUser user = (SysUser) session.getAttribute(Constants.SESSION_USER_INFO);
        String username = user.getUsername();


        return null;
    }

    @Override
    public FrontResult logout() {
        try {
            Subject subject = SecurityUtils.getSubject();
            subject.logout();
        } catch (Exception e) {
            logger.error("登出错误……");
        }
        return FrontResult.success("登出成功");
    }
}
