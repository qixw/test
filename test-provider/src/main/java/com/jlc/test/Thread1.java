package com.jlc.test;

/**
 * @author ：qixuewei@jinlianchu.com
 * @Description ：
 * @ClassName ：Thread1
 * @date ：2017/12/6 14:33
 */
 class Thread1 implements Runnable {

	private String name;
	private Object prev;
	private Object self;
	//private Object c;

	public Thread1(String name, Object prev, Object self) {
		this.name = name;
		this.prev = prev;
		this.self = self;
	}

	public Thread1(){

	}
	@Override
	public void run() {
		int count = 10;
		while (count > 0) {
			synchronized (prev) {
				synchronized (self) {
					System.out.print(name);
					count--;

					self.notify();
				}
				try {
					prev.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}
}
