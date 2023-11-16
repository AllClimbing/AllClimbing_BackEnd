package com.ssafy.climbing.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.ssafy.climbing.model.dao")
public class DBConfig {

}