package com.aot.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;


import com.aot.beans.MyView;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MyView m1=(MyView)context.getBean("sobj");
		System.out.println(m1);		
		
		
	}

}
