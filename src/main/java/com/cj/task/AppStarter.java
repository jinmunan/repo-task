package com.cj.task;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@Slf4j
@SpringBootApplication
// 引入Spring Task
// @EnableScheduling
public class AppStarter {

    public static void main(String[] args) {
        SpringApplication.run(AppStarter.class, args);
        log.info("项目启动成功！！！");
    }
}
