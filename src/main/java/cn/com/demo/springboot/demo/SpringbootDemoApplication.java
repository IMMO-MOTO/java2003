package cn.com.demo.springboot.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = "cn.com.demo.springboot.demo.mapper")
@ComponentScan(basePackages = {"cn.com.demo.springboot.demo.service.impl",
                               "cn.com.demo.springboot.demo.controller",
                               "cn.com.demo.springboot.demo.config"
})
@EnableTransactionManagement
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

}
