package com.jlc.test;

/**
 * @author ：qixuewei@jinlianchu.com
 * @Description ：
 * @ClassName ：Demo
 * @date ：2017/11/1 15:59
 */
public class Demo {

	public static void main(String[] args)throws Exception {

		Object a = new Object();
		Object b = new Object();
		Object c = new Object();
		Thread1 pa = new Thread1("A", c, a);
		Thread1 pb = new Thread1("B", a, b);
		Thread1 pc = new Thread1("C", b, c);


		new Thread(pa).start();
		Thread.sleep(100);  //确保按顺序A、B、C执行
		new Thread(pb).start();
		Thread.sleep(100);
		new Thread(pc).start();
		Thread.sleep(100);

	}
}
