package com.app.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	@Before("allGetters()")
	
public void loggingadvice()
{
	System.out.println("1)advice run........!! Get() called....");
}
	@Before("allGetters()")
public void secondadvice()
{
	System.out.println("2)advice run........!! Get() called....");
}
	@Pointcut("execution( * get*())")
//	public void allGetters()
//	{
//		
//	}
	@Around("allGetters()")
	public Object myAroundAdvice(ProceedingJoinPoint pjp)
	{
		Object returnVal=null;
				try {
					System.out.println("before advice");

			returnVal=pjp.proceed();
			System.out.println("after returning advice");
		} catch (Throwable e) {
			System.out.println("after throwing");

			
		}
				System.out.println("after finally");
return returnVal;
	}
	@AfterThrowing("args(name)")
			public void afterThrowingAdvice(String name){
			   //System.out.println("Method Signature: "  + jp.getSignature());  
			   System.out.println("Exception thrown ");  
			}
}
