package org.framework.apps.configures;

import org.framework.apps.profiles.DemoBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfigure {

	@Bean
	@Profile("dev")
	public DemoBean devDemoBean(){
		return new DemoBean("开发环境");
	}
	
	@Bean
	@Profile("test")
	public DemoBean testDemoBean(){
		return new DemoBean("测试环境");
	}
}
