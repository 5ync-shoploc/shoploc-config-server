package com.shoploc.shoplocconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ShoplocConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoplocConfigServerApplication.class, args);
    }

}
