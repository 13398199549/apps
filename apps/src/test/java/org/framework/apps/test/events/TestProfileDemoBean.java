package org.framework.apps.test.events;

import org.framework.apps.configures.ProfileConfigure;
import org.framework.apps.profiles.DemoBean;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * 根据输入的条件选择不同的环境
 * @author Administrator
 *
 */
public class TestProfileDemoBean {

AnnotationConfigApplicationContext context = null;
	
	/**
	 * 创建容器
	 */
	@Before
	public void before(){
		context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("dev");//设置测试环境
		context.register(ProfileConfigure.class);
		context.refresh();//刷新容器
	}
	
	@Test
	public void testProfileDemoBean(){
		DemoBean bean = context.getBean(DemoBean.class);
		System.out.println(bean.getContent());
		context.close();
	}
	
	
	
}
