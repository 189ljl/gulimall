package com.ljlgithub.gulimall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * @Author Laijialong
 * @Description: 解决跨域问题
 * @Date 2022/8/13 17:39
 * @Version 1.0
 */
@Configuration
public class CorsConfig {

    @Bean
    public CorsWebFilter corsWebFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        //配置跨域
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        //1.请求头
        corsConfiguration.addAllowedHeader("*");
        //2.请求方式
        corsConfiguration.addAllowedMethod("*");
        //3.请求来源
        corsConfiguration.addAllowedOrigin("*");
        //4.是否允许携带cookies
        corsConfiguration.setAllowCredentials(true);
        source.registerCorsConfiguration("/**",corsConfiguration);
        return new CorsWebFilter(source);
    }

}
