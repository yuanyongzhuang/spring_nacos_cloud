package com.yyz.springNacosCloud.config;

import com.yyz.springNacosCloud.base.SwaggerProperties;
import org.springframework.context.annotation.Configuration;

/**
 * swagger 在线文档
 * http://localhost:8083/doc.html#/home
 * @author yyz
 */
@Configuration
public class Knife4jConfig extends Knife4jBaseConfig {
    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .groupName("基础框架服务")
                .apiBasePackage("com.yyz.springNacosCloud.controller")
                .title("基础服务 接口文档")
                .description("# 基础框架 接口文档")
                .contactName("我的test")
                .version("1.0.0")
                .build();
    }
}
