package com.atos.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	 private static final Logger LOG = Logger.getLogger(LoggingAspect.class);
	
//	@Before("execution(* com.atos.service.impl.PersonneServiceImpl.save(..))")
//	public void logBefore(JoinPoint joinPoint) {
//
//		System.out.println("logBefore() is running!");
//		System.out.println("test : " + joinPoint.getSignature().getName());
//		System.out.println("******");
//	}
	@Around("execution(* com.atos.service.impl.PersonneServiceImpl.save(..))")
    public void logAround(ProceedingJoinPoint pjp) throws Throwable {
	
	 System.out.println("Around() is running!");
		System.out.println("test : " + pjp.getSignature().getName());
     long time1 = System.currentTimeMillis();
	// int result = (int) 
			 pjp.proceed();

	 long time2 = System.currentTimeMillis();

	 System.out.format("method took %d milliseconds\n\n", (time2 - time1));
		System.out.println("******");
		//return result;
    }

	@After("execution(* com.atos.service.impl.*.save(..))")
	public void logAfter(JoinPoint joinPoint) {

		LOG.info("\n logAfter() is running!");
		System.out.println("******");
		System.out.println("\n logAfter() is running!");
		System.out.println("test : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}
	
	@AfterReturning(pointcut = "execution(* com.atos.service.impl.*.save(..))", returning = "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result) {

		System.out.println("logAfterReturning() is running!");
		System.out.println("test : " + joinPoint.getSignature().getName());
		System.out.println("Method returned value is : " + result);
		System.out.println("******");

	}

}