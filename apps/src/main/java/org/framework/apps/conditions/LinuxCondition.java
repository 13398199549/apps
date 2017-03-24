package org.framework.apps.conditions;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
/**
 * Linux环境
 * @author Administrator
 *
 */
public class LinuxCondition implements Condition {

	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// TODO Auto-generated method stub
		return context.getEnvironment().getProperty("os.name").contains("Linux");
	}

}
