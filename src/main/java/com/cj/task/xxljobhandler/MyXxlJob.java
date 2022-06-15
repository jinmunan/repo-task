package com.cj.task.xxljobhandler;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;


/**
 * jinmunan
 */
@Component
public class MyXxlJob {
	static long count = 0;

	/**
	 * 1、简单任务示例（Bean模式）
	 */
	@XxlJob("myXxlJobHandler")
	public void myXxlJobHandler() throws Exception {
		// 内置的日志工具，将日志输出到本地文件中
		XxlJobHelper.log("我的第一个xxl-job定时任务开启了");
		count++;
		System.out.println("此处开启xxl-job定时任务：正在执行第" + count + "次");
		XxlJobHelper.log("此处开启定时任务：正在执行第" + count + "次");
	}
}
