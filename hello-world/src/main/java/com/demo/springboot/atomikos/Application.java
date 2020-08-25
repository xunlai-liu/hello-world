package com.demo.springboot.atomikos;

import com.demo.springboot.atomikos.config.DataSourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 *  单个应用多个库 属于非正常操作 一般微服务有一个库
 */

@EnableAutoConfiguration
@ComponentScan("com.demo.springboot.atomikos")
@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
@Import({ DataSourceConfig.class })
public class Application {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);

	}
}
