package org.example.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 整合Redis
 * @author han
 * @since 2023/06/19
 */
@SpringBootApplication
public class RedisApp {
    public static void main(String[] args) {
        SpringApplication.run(RedisApp.class,args);
        System.out.println("====== 整合redis ======");
    }
}
