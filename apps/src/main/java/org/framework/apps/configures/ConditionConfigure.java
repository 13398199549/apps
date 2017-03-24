package org.framework.apps.configures;

import org.framework.apps.conditions.LinuxCondition;
import org.framework.apps.conditions.LinuxListService;
import org.framework.apps.conditions.ListService;
import org.framework.apps.conditions.WindowsCondition;
import org.framework.apps.conditions.WindowsListService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.framework.apps.conditions")
public class ConditionConfigure {

	/**
	 * 符合windows环境则实例化WindowsListService()
	 * @return
	 */
	@Bean
	@Conditional(WindowsCondition.class)
	public ListService windowsListService(){
		return new WindowsListService();
	}
	
	/**
	 * 符合linux环境则实例化LinuxListService()
	 * @return
	 */
	@Bean
	@Conditional(LinuxCondition.class)
	public ListService linuxListService(){
		return new LinuxListService();
	}
}
