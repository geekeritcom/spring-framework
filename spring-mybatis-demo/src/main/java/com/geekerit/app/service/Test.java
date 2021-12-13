package com.geekerit.app.service;

import com.geekerit.app.App;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author geekerhub
 * @date 2021/10/21 21:13
 */
public class Test {

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(App.class);
//		// 直接通过Spring容器完成扫描
//		configApplicationContext.scan("");
//		System.out.println(configApplicationContext.getBean(ServiceA.class));


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		System.out.println("result is " + context.getBean(ServiceA.class));


//		GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
//		beanDefinition.setLazyInit(false);
//		beanDefinition.setBeanClass(ServiceA.class);
//		beanDefinition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_NAME);
//		beanDefinition.setScope(BeanDefinition.SCOPE_SINGLETON);
//		beanDefinition.setDescription("test description...");


	}
}
