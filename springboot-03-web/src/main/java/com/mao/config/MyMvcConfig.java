package com.mao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/main.html").setViewName("dashboard");
    }


    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }


    //添加拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor())
        .addPathPatterns("/**")
        .excludePathPatterns("/index.html","/","/user/login","/css/*","/img/**","/js/**");
    }


    //    //视图跳转
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/mao").setViewName("test");
//    }
//
//
//    //    //这里要将自定义视图解析器注入到spring容器中才能生效
////    @Bean
////    public ViewResolver myViewResolver(){
////        return new MyViewResolver();
////    }
////
////
////    public static class MyViewResolver implements ViewResolver {
////
////        @Override
////        public View resolveViewName(String s, Locale locale) throws Exception {
////            return null;
////        }
////    }

}
