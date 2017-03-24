package org.framework.apps.test.events;

import org.framework.apps.configures.TaskExecutorConfigure;
import org.framework.apps.taskexecutor.AsyncTaskService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * 测试异步任务
 * @author Administrator
 *
 */
public class TestAsyncTaskService {

	AnnotationConfigApplicationContext context = null;
	
	/**
	 * 创建容器
	 */
	@Before
	public void before(){
		context = new AnnotationConfigApplicationContext(TaskExecutorConfigure.class);
	}
	
	@Test
	public void testAsyncTask(){

		AsyncTaskService taskService = context.getBean(AsyncTaskService.class);
		for(int i = 0; i < 10; i++){
			taskService.executeAsyncTask(i);
			taskService.executeAsyncTaskPlus(i);
		}
		context.close();
		
	}
}
