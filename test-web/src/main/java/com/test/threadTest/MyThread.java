package com.test.threadTest;

import java.util.concurrent.CountDownLatch;

/**
 * @author ：qixuewei@jinlianchu.com
 * @Description ：
 * @ClassName ：MyThread
 * @date ：2018/3/6 14:18
 */
public class MyThread implements Runnable {

	private Counter counter;

	private CountDownLatch countDownLatch;

	public MyThread(Counter counter,CountDownLatch countDownLatch){
		this.countDownLatch=countDownLatch;
		this.counter=counter;
	}

	public  void run() {

		synchronized (countDownLatch){

			for (int i=0;i<10000;i++){
				counter.addCount();
			}

			//完成一个子线程 子线程数减1 ,直到为0,主线程await 方法启用继续执行
			countDownLatch.countDown();
		}
	}
}
