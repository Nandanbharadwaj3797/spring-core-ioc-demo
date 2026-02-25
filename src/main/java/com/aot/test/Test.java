package com.aot.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aot.beans.MyView;
import com.aot.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		// Activate (call) ApplicationContext container
		
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
				
		MyView my=ac.getBean("mobj",MyView.class);
		System.out.println(my);
		
		ac.close();
	}

}
