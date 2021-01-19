package com.text.park.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationBeanNameGenerator;
import org.springframework.util.Assert;

public class UniqueNameGenerator extends AnnotationBeanNameGenerator {

	@Override
	public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
		// 全限定类名
		String beanName = definition.getBeanClassName();

		return beanName;

	}

	@Override
	protected String buildDefaultBeanName(BeanDefinition definition) {
		String beanClassName = definition.getBeanClassName();
		Assert.state(beanClassName != null, "No bean class name set");
		// 分割类全路径
		String[] packages = beanClassName.split("\\.");
		StringBuilder beanName = new StringBuilder();
		// 取类的包名的首字母小写再加上类名作为最后的bean名
		for (int i = 0; i < packages.length - 1; i++) {
			beanName.append(packages[i].toLowerCase().charAt(0));
		}
		beanName.append(packages[packages.length - 1]);
		return beanName.toString();
	}
}
