package com.geekerit.app.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * @author geekerhub
 * @date 2021/10/21 21:34
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("execute MyBeanFactoryPostProcessor....");
		final GenericBeanDefinition serviceA = (GenericBeanDefinition) beanFactory.getBeanDefinition("serviceA");
		serviceA.setBeanClass(ServiceB.class);

	}
}
