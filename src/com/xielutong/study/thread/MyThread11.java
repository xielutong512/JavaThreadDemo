package com.xielutong.study.thread;

public class MyThread11 extends Thread{

	

	public MyThread11() {
		System.out.println("MyThread11--begin");
		System.out.println("Thread.currentThread().getName()="
				+ Thread.currentThread().getName());
		System.out.println("this.getName()=" + this.getName());
		System.out.println("MyThread11--end");
	}

	@Override
	public void run() {
		System.out.println("run--begin");
		System.out.println("Thread.currentThread().getName()="
				+ Thread.currentThread().getName());
		System.out.println("this.getName()=" + this.getName());
		System.out.println("run--end");
	}
	
}
