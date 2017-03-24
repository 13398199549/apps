package org.framework.apps.test.events;

import org.framework.apps.configures.EventConfigure;
import org.framework.apps.events.DemoPublisher;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * 当一个事件的运行需要等待例外一个事件的结果时，
 * 可以采用事件驱动模式，事件驱动模型更多可以做到
 * 组件与组件之间的解耦
 * @author Administrator
 *
 */
public class TestDemoEvent {

	AnnotationConfigApplicationContext context = null;
	
	/**
	 * 创建容器
	 */
	@Before
	public void before(){
		context = new AnnotationConfigApplicationContext(EventConfigure.class);
	}
	
	@Test
	public void testPublisherEvents(){
		//组件1是DemoPublisher，组件2是DemoListener
		DemoPublisher publisher = context.getBean(DemoPublisher.class);
		publisher.publish("from='张三',to='李四',acount='5000'");
		context.close();
	}
	
	
}
