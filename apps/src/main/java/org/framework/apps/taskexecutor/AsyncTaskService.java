package org.framework.apps.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 定义一个任务执行类
 * @author Administrator
 *
 */
@Service
public class AsyncTaskService {

	@Async//标记为一个异步方法
	public void executeAsyncTask(Integer i){
		System.out.println("executeAsyncTask" + i);
	}
	
	@Async//标记为一个异步方法
	public void executeAsyncTaskPlus(Integer i){
		System.out.println("executeAsyncTaskPlus" + i);
	}
}
