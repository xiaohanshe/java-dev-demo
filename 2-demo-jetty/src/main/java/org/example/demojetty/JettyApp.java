package org.example.demojetty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * TODO
 *
 * @author han
 * @since 2023/06/16
 */
@SpringBootApplication
public class JettyApp {
    public static void main(String[] args) {
        SpringApplication.run(JettyApp.class,args);
        System.out.println("===== 整合jetty，去除tomcat ====");
    }
}
