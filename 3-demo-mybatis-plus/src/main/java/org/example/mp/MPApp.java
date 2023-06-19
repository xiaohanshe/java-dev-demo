package org.example.mp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * TODO
 *
 * @author han
 * @since 2023/06/16
 */
@MapperScan("org.example.mp.mapper")
@SpringBootApplication
public class MPApp {
    public static void main(String[] args) {
        SpringApplication.run(MPApp.class, args);
        System.out.println("====== 整合MP ======");
    }
}
