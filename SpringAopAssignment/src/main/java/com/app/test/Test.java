package com.app.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.aop.FactoryService;
import com.app.aop.Shape;

public class Test {

	public static void main(String[] args) {
		//ApplicationContext context=new ClassPathXmlApplicationContext("Springnew.xml"); 
//Shape sh=context.getBean("sh",Shape.class);
//System.out.println(sh.getCircle().getName());

//System.out.println(sh.getTriangle().getName());
//sh.getCircle().setName("madhu");
FactoryService fs=new FactoryService();
Shape sh=(Shape)fs.getBean("sh");
//Shape sh1=(Shape)fs.getBean("circle");
sh.getCircle();
	}

}
