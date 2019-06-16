package com.awp.wpuploadingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WpUploadingServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WpUploadingServerApplication.class, args);
    }

}
