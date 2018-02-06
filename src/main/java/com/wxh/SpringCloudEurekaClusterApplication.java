package com.wxh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *  eureka服务注册中心的搭建
 *  1.pom文件添加spring-cloud-starter、spring-cloud-starter-eureka-server、
 *  spring-cloud-dependencies以pom方式导入
 *  2.在application.yml中配置各个服务器的名称、端口。连接客户端等相关信息
 *  3.在Application.java 通过注解@EnableEurekaServer启动Eureka服务注册中心
 *  4. Windows系统中hosts文件添加：
 *  	127.0.0.1 peer1
 *  	127.0.0.1 peer2
 *  	127.0.0.1 peer3
 *  5.浏览器输入:http://localhost:8000/,就可以看到peer1可以利用实例等相关信息
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaClusterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaClusterApplication.class, args);
	}
}
