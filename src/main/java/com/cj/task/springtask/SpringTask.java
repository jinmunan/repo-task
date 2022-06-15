package com.cj.task.springtask;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by Jinmunan
 * 2022/6/15
 * 8:48
 */
@Slf4j
@Configuration
public class SpringTask {
    static long count = 0;

    // cron表达式生成器 https://cron.qqe2.com/
    // 添加定时任务
    @Scheduled(cron = "0/3 * * * * ?")
    public void task() {
        count++;
        System.out.println("此处开启定时任务：正在执行第" + count + "次");

    }
}
