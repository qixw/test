package com.test.apsect;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author ：qixuewei@jinlianchu.com
 * @Description ：
 * @ClassName ：TestAspect
 * @date ：2018/3/15 16:56
 */
public class TestAspect {

	public void processed(ProceedingJoinPoint proceedingJoinPoint){
		Object o = proceedingJoinPoint.getArgs()[0];
		try {
			System.out.println("切面前");

			//执行程序
			proceedingJoinPoint.proceed();

			System.out.println("切面后");
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
	}
}
