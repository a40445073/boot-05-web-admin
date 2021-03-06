package com.atguigu.admin.config;

import com.atguigu.admin.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AdminWebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //版本二
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**") //拦截所有请求包括静态资源
                .excludePathPatterns("/", "/login", "/css/**", "/fonts/**", "/images/**", "/js/**");
    }
}
