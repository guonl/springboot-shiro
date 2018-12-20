package com.guonl.shiro;

import org.apache.shiro.web.filter.PathMatchingFilter;
import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Created by guonl
 * Date 2018/12/19 11:42 PM
 * Description: 自定义用户过滤器
 */
public class SysUserFilter extends PathMatchingFilter {

    @Override
    protected boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
        //可以参考http://jinnianshilongnian.iteye.com/blog/2025656
        return true;
    }
}
