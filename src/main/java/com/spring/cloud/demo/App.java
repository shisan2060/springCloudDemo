package com.spring.cloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * App springCloud 启动入口类
 *
 * @Author shisan
 * @Date 2017/6/8 上午9:14
 */
// @SpringBootApplication,相当于@Configuration、@EnableAutoConfiguration 和  @ComponentScan ;
// 其中@Configuration、@ComponentScan是spring框架的语法，在spring 3.x就有了，用于代码方式创建配置信息和扫描包。
// @EnableAutoConfiguration是spring boot语法，表示将使用自动配置。
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
