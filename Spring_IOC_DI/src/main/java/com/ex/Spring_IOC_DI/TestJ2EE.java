package com.ex.Spring_IOC_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJ2EE {

	public static void main(String[] args) {
		ApplicationContext aP=new ClassPathXmlApplicationContext("ConstructorDI.xml");
		Person person=(Person)aP.getBean("persons");
		person.display();
		

	}

}
