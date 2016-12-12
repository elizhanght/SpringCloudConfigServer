package com.xhy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by zhanght on 2016/12/12.
 */
@SpringBootApplication
@EnableConfigServer
public class Application {

        public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
        }
}
