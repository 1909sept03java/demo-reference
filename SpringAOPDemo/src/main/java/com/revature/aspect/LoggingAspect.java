package com.revature.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.revature.model.Animal;

@Aspect // marks class as containing advice, prevents autoproxying (from AspectJ!)
@Component // stereotype indicating that LoggingAspect is a Spring bean
public class LoggingAspect {

	// could create Logger as a bean and inject it
	private static Logger log = Logger.getRootLogger();

	// INFO log when a method is executed with no incident
	// ERROR log when exception is thrown
	// WARN log when "chase" is called (proof-of-concept for pattern matching)

	// after any method in service package executes normally
	@AfterReturning(pointcut = "within(com.revature.service.*)")
	public void logAfterReturn(JoinPoint jp) {
		System.out.println("in logAfterReturn");
		log.info(jp.getSignature());
	}

	// after any method in any package throws any Throwable
	@AfterThrowing(pointcut = "within(*)", throwing = "t")
	public void logAfterThrow(JoinPoint jp, Throwable t) {
		log.error(jp.getSignature() + " threw " + t.getClass() + " with stack trace: " + t.getStackTrace());
	}
	
	// use Around advice to control whether chase() ever finishes executing
	// careful... this is interacting with application logic, not sticking to cross-cutting concerns.
	@Around("execution(* com.revature.service.CircleOfLifeService.chase(..))")
	public void chaseMaybe(ProceedingJoinPoint pjp) throws Throwable {
		Animal a1 = (Animal) pjp.getArgs()[0]; 
		Animal a2 = (Animal) pjp.getArgs()[1];
		log.info(a1 + " is chasing " + a2);
		if (a1.getSpeed() > a2.getSpeed()) {
			log.warn(a1 +" is faster than "+ a2);
			pjp.proceed(); // decides whether method executes
		} else {
			log.info(a2 + " got away");
		}
	}

}
