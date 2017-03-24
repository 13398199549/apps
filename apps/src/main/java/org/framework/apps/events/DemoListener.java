package org.framework.apps.events;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
/**
 * 定义一个事件监听器
 * @author Administrator
 *
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

	public void onApplicationEvent(DemoEvent event) {
		// TODO Auto-generated method stub
		String msg = event.getMsg();//获取事件发生的消息
		
		System.out.println("DemoListener----接收到来自于DemoPublisher发布的DemoEvent事件消息：" + msg);
		//接收到之后，这里可以继续处理业务逻辑
		
		
		
	}

}
