package org.framework.apps.configures;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 计划任务配置类
 * @author Administrator
 *
 */
@Configuration
@ComponentScan("org.framework.apps.taskscheduler")
@EnableScheduling //开启对计划任务的支持
public class TaskSchedulerConfigure {

}
