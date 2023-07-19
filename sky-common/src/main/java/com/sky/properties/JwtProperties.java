package com.sky.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

// @ConfigurationProperties 配置文件配置项，application.yml文件中存在jwt的信息，将其配置给JwtProperties类
@Component
@ConfigurationProperties(prefix = "sky.jwt")
@Data
public class JwtProperties {

    /**
     * 管理端员工生成jwt令牌相关配置
     */
    private String adminSecretKey;
    private long adminTtl;
    private String adminTokenName;

    /**
     * 用户端微信用户生成jwt令牌相关配置
     */
    private String userSecretKey;
    private long userTtl;
    private String userTokenName;

}
