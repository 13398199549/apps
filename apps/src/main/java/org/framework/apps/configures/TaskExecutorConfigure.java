package org.framework.apps.configures;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
/**
 * 异步任务配置类
 * @author Administrator
 *
 */
@Configuration
@ComponentScan(value={"org.framework.apps.taskexecutor"})
@EnableAsync //利用@EnableAsync开启异步任务支持
public class TaskExecutorConfigure implements AsyncConfigurer{

	/**
	 * 生成一个支持异步的线程池
	 */
	
	public Executor getAsyncExecutor() {
		// TODO Auto-generated method stub
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		taskExecutor.setCorePoolSize(5);//池中至少5个连接
		taskExecutor.setMaxPoolSize(10);
		taskExecutor.setQueueCapacity(25);//线程池所使用的缓冲队列
		taskExecutor.initialize();
		return taskExecutor;
	}

	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		// TODO Auto-generated method stub
		return null;
	}
}
