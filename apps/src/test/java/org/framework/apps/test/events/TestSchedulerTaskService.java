package org.framework.apps.test.events;

import org.framework.apps.configures.TaskSchedulerConfigure;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSchedulerTaskService {
	
	//启动容器
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		new AnnotationConfigApplicationContext(TaskSchedulerConfigure.class);
	}
}
