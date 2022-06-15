package com.cj.task.quartz;

/**
 * Created by Jinmunan
 * 2022/6/14
 * 17:06
 */

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * 这里是一个任务
 * 继承Quartz框架中的Job，并重写execute方法
 */
public class QuartzTestJob extends QuartzJobBean {
    static long count = 0;

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        count++;
        System.out.println("此处开启定时任务：正在执行第" + count + "次");

    }
}