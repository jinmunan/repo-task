package com.cj.task.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Jinmunan
 * 2022/6/14
 * 16:58
 */
public class ThreadPoolTask01 {
    static long count = 0;

    public static void main(String[] args) {
        // 新的单线程调度执行器
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        // 第二个参数为首次执行的延时时间，第三个参数为定时执行的间隔时间
        service.scheduleAtFixedRate(() -> {
            count++;
            System.out.println("此处开启定时任务：正在执行第" + count + "次");
        }, 1, 3, TimeUnit.SECONDS);
    }
}

