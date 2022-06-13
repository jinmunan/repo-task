package com.cj.task.thread;


/**
 * 定时任务创建方式一：线程定时任务
 * Created by Jinmunan
 * 2022/6/13
 * 23:34
 */
public class ThreadTask01 {
	public static void main(String[] args) {
		Task task = new Task();
		Thread thread = new Thread(task);
		thread.start();
	}
}