package com.xielutong.study.thread;

public class MyThread34 extends Thread{
	
	@Override
	public void run() {
		System.out.println("MyThread34 run priority="+ this.getPriority());
		MyThread35 myThread35 = new MyThread35();
		myThread35.start();
	}
}
