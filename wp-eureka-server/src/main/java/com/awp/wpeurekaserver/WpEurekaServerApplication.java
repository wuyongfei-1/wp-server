package com.awp.wpeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WpEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WpEurekaServerApplication.class, args);
    }

}
