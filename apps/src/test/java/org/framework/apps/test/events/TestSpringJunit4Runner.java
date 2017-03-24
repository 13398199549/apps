package org.framework.apps.test.events;

import javax.annotation.Resource;

import org.framework.apps.configures.ProfileConfigure;
import org.framework.apps.profiles.DemoBean;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ProfileConfigure.class})
@ActiveProfiles("test")
public class TestSpringJunit4Runner {

	@Resource
	private DemoBean demoBean;
	
	@Test
	public void devBeanShouldInject(){
		Assert.assertEquals("开发环境", demoBean.getContent());
	}
}
