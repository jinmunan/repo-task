package com.cj.task.quartz;

import org.quartz.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Scheduler 代表调度容器，一个调度容器中可以注册多个JobDetail和Trigger。
 * Job 代表工作，即要执行的具体内容。
 * JobDetail 代表具体的可执行的调度程序，Job是这个可执行程调度程序所要执行的内容。
 * JobBuilder 用于定义或构建JobDetail实例。
 * Trigger 代表调度触发器，决定什么时候去调。
 * TriggerBuilder 用于定义或构建触发器。
 * JobStore 用于存储作业和任务调度期间的状态。
 */
@Configuration
public class QuartzConfig {

    @Value("${sue.spring.quartz.cron}")
    private String testCron;

    /**
     * 创建定时任务可执行的调度程序
     * JobDetail:代表具体的可执行的调度程序
     */
    @Bean
    public JobDetail quartzTestDetail() {
        return JobBuilder.newJob(QuartzTestJob.class)
                .withIdentity("quartzTestDetail", "QUARTZ_TEST") // 身份
                .usingJobData("userName", "zhongnan") // 作业数据
                .storeDurably() //持久存储
                .build();
    }

    /**
     * 创建触发器，即定时任务触发的条件构造器，定时触发相关任务
     */
    @Bean
    public Trigger quartzTestJobTrigger() {
        // Cron 计划生成器:每隔5秒执行一次
        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule(testCron);

        // 创建触发器
        return TriggerBuilder.newTrigger()
                .forJob(quartzTestDetail())
                .withIdentity("quartzTestJobTrigger", "QUARTZ_TEST_JOB_TRIGGER")
                .withSchedule(cronScheduleBuilder)
                .build();
    }
}