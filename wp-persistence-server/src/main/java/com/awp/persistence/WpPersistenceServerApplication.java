package com.awp.persistence;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.awp.persistence.mapper")
public class WpPersistenceServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WpPersistenceServerApplication.class, args);
    }

}
