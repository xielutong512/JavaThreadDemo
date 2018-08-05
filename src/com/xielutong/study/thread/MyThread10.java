package com.xielutong.study.thread;

public class MyThread10 extends Thread{

	private int i = 5;

	@Override
	public void run() {
		super.run();
		System.out.println("i= " + (i--) + " threadName="
				+ Thread.currentThread().getName());
	}
	
}
