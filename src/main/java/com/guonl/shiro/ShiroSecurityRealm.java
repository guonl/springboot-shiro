package com.guonl.shiro;

import com.guonl.po.SysUser;
import com.guonl.service.IUserService;
import com.guonl.vo.RoleVo;
import com.guonl.vo.UserVo;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.Sha256CredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

/**
 * Created by guonl
 * Date 2018/12/19 11:44 PM
 * Description: 权限认证
 */
@SuppressWarnings("deprecation")
@Component
public class ShiroSecurityRealm extends AuthorizingRealm {

    @Resource
    private IUserService userService;

    public ShiroSecurityRealm() {
        setName("ShiroSecurityRealm"); // This name must match the name in the SysUser class's getPrincipals() method
        setCredentialsMatcher(new Sha256CredentialsMatcher());
    }

    /**
     * 登录认证
     */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        SysUser user = userService.getSysUserByName(token.getUsername());
        if (user != null) {
            return new SimpleAuthenticationInfo(user.getUserId(), user.getLoginPass(), getName());
        } else {
            return null;
        }
    }


    /**
     * 权限认证
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        Long userId = (Long) principals.fromRealm(getName()).iterator().next();
        UserVo user = userService.getUserById(userId);
        if (user != null) {
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            for (RoleVo role : user.getRoles()) {
                info.addRole(role.getRoleKey());
                info.addStringPermissions(role.getPermissions());
            }
            return info;
        } else {
            return null;
        }
    }

}
