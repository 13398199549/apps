package org.framework.apps.test.events;

import org.framework.apps.conditions.ListService;
import org.framework.apps.configures.ConditionConfigure;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConditionService {

AnnotationConfigApplicationContext context = null;
	
	/**
	 * 创建容器
	 */
	@Before
	public void before(){
		context = new AnnotationConfigApplicationContext(ConditionConfigure.class);
	}
	
	@Test
	public void testListCondition(){
		ListService listService = context.getBean(ListService.class);
		System.out.println(context.getEnvironment().getProperty("os.name")
				+ "系统环境下的列表命令是：" + listService.showListCmd());
		
	}
	
	
}
