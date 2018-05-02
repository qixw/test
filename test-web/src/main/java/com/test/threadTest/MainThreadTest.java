package com.test.threadTest;

import java.util.Date;
import java.util.concurrent.CountDownLatch;

/**
 * @author ：qixuewei@jinlianchu.com
 * @Description ：
 * @ClassName ：MainThreadTest
 * @date ：2018/3/6 14:24
 */
public class MainThreadTest {

	public static void main(String[] args) {

		    for (int i=0;i<10;i++){
				//test();
			}
		int a=3;
		int b=4;
		a=b;
		System.out.println(a);
		//System.out.println(new BigDecimal(12201).intValue()%10);
	}

	public static void test(){
		long startTime = new Date().getTime();
		//创建计数器
		Counter counter = new Counter();

		//设置等待子线程数
		int threadCount =1000;

		CountDownLatch countDownLatch = new CountDownLatch(threadCount);

		//执行子线程
		for (int j=0;j<threadCount;j++){
			MyThread myThread = new MyThread(counter,countDownLatch);
			Thread thread = new Thread(myThread);
			//thread.run();
			thread.start();
		}
		try {
			//主线程等待
			countDownLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(counter.getCount());
		long excuteTime = new Date().getTime() - startTime;
		System.out.println("耗时>>>>>"+excuteTime+"ms");
	}
}
