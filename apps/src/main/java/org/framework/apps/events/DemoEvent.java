package org.framework.apps.events;

import org.springframework.context.ApplicationEvent;
/**
 * 定义一个事件
 * @author Administrator
 *
 */
public class DemoEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 400334612588767990L;

	private String msg;
	
	public DemoEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

	public DemoEvent(Object source,String msg) {
		super(source);
		// TODO Auto-generated constructor stub
		this.msg = msg;
		//可以在这个地方将msg解开为不同的内容
	}


	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
