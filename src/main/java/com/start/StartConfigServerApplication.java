package com.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 启动类
 * @author syl
 *
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class StartConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartConfigServerApplication.class, args);
	}
}
