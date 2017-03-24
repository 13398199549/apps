package org.framework.apps.events;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
/**
 * 定义一个事件发布者
 * @author Administrator
 *
 */
@Component
public class DemoPublisher {

	@Resource
	private ApplicationContext applicationContext;
	
	public void publish(String msg){
		applicationContext.publishEvent(new DemoEvent(this, msg));
	}
	
}
