package com.guonl.config;

import com.guonl.filter.CustomFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by guonl
 * Date 2018/12/23 10:03 AM
 * Description: 一个过滤器的配置
 */
@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean filterRegist() {
        FilterRegistrationBean frBean = new FilterRegistrationBean();
        frBean.setFilter(new CustomFilter());
        frBean.addUrlPatterns("/*");
        return frBean;
    }
}

