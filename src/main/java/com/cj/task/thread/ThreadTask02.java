package com.cj.task.thread;

/**
 * 定时任务创建方式一：线程定时任务
 * Created by Jinmunan
 * 2022/6/13
 * 23:34
 */
public class ThreadTask02 {

	static long count = 0;

	public static void main(String[] args) {
		new Thread(() -> {
			while (true) {
				try {
					Thread.sleep(3000);
					count++;
					System.out.println("此处开启定时任务：正在执行第" + count + "次");
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}).start();
	}
}

