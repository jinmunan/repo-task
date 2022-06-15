package com.cj.task.timertask;


import java.util.Timer;
import java.util.TimerTask;

/**
 * 使用Timer开启定时任务
 * Created by Jinmunan
 * 2022/6/14
 * 16:52
 */
public class TimerTask01 {

    static long count = 0;

    public static void main(String[] args) {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                count++;
                System.out.println("此处开启定时任务：正在执行第" + count + "次");
            }
        };
        // 创建timer对象设置间隔时间
        Timer timer = new Timer();
        // 间隔天数
        long delay = 0;
        // 间隔毫秒数
        long period = 3000;
        /**
         * schedule(TimerTask task, Date time) , 指定任务task在指定时间time执行
         * schedule(TimerTask task, long delay) , 指定任务task在指定延迟delay后执行
         * schedule(TimerTask task, Date firstTime,long period) ,指定任务task在指定时间firstTime执行后，进行重复固定延迟频率peroid的执行
         * schedule(TimerTask task, long delay, long period) , 指定任务task 在指定延迟delay 后，进行重复固定延迟频率peroid的执行
         * scheduleAtFixedRate(TimerTask task,Date firstTime,long period) , 指定任务task在指定时间firstTime执行后，进行重复固定延迟频率peroid的执行
         * scheduleAtFixedRate(TimerTask task, long delay, long period) , 指定任务task 在指定延迟delay 后，进行重复固定延迟频率peroid的执行
         */
        timer.scheduleAtFixedRate(timerTask, delay, period);
    }
}

