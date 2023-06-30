package org.example.test;

import org.example.starter.config.MyProperties;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @author han
 * @since 2023/06/29
 */
@SpringBootTest
public class StarterTest {

    @Resource
    MyProperties myProperties;

    @Test
    void test(){
        System.out.println(myProperties);
    }
}
