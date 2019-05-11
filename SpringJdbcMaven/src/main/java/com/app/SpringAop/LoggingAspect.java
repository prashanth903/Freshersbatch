package com.app.SpringAop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(public boolean addEmp())")
	public void loggingAdvice()
	{
		System.out.println("Advice run.Get Method called");
	}
	
}
