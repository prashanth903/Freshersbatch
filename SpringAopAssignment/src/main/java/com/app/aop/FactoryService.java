package com.app.aop;

public class FactoryService  {
public Object getBean(String beanType) {
	if(beanType.equals("sh")) return new ShapeProxy();
	if(beanType.equals("circle")) return new Circle();
	if(beanType.equals("triangle")) return new Triangle();
	return null;

	
}
}
