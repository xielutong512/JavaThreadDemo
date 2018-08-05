package com.xielutong.study.thread;

public class MyThread13 extends Thread{
	
	public MyThread13() {
		System.out.println("MyThread13---begin");
		System.out.println("Thread.currentThread().getName()="
				+ Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive()="
				+ Thread.currentThread().isAlive());
		System.out.println("this.getName()=" + this.getName());
		System.out.println("this.isAlive()=" + this.isAlive());
		System.out.println("MyThread13---end");
	}

	@Override
	public void run() {
		System.out.println("run---begin");
		System.out.println("Thread.currentThread().getName()="
				+ Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive()="
				+ Thread.currentThread().isAlive());
		System.out.println("this.getName()=" + this.getName());
		System.out.println("this.isAlive()=" + this.isAlive());
		System.out.println("run---end");
	}
}
