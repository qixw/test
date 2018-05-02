package com.test.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ：Qxw
 * @Description ：
 * @ClassName ：Demo3
 * @date ：2018/4/25 9:42
 */
public class Demo3 {

	public static void main(String[] args) {

		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

		for (int i =1;i<10;i++){

			final  int index =i;
			try {
				Thread.sleep(index*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		   cachedThreadPool.execute(new Runnable() {
			   @Override
			   public void run() {
				   System.out.println(System.currentTimeMillis());
				   System.out.println(index);
			   }
		   });
		}
	}
}
