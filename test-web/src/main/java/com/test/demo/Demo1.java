package com.test.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：qixuewei@jinlianchu.com
 * @Description ：
 * @ClassName ：Demo1
 * @date ：2018/4/2 18:22
 */
public class Demo1 {

	public static void main(String[] args) {

		String a=new String("123");
		String b="123";
		Integer c = new Integer(123);
		Integer d = new Integer(123);
		System.out.println(a==b);
		System.out.println(c==d);
		//ExecutorService executorService = new ExecutorService();
		//Executor executor = Executors.newSingleThreadExecutor();
		final List lis = new ArrayList();
		lis.add(1);
		lis.add(2);
		//System.out.println(lis.get(0).toString()+lis.get(1).toString());
		String s =new String("Hello");
		modify(s);
		System.out.println(s);
	}

	public static  void modify(String s){
		s+="world!";
		System.out.println(s);
	}
}
