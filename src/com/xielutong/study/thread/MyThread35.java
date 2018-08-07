package com.xielutong.study.thread;

public class MyThread35 extends Thread{
	
	@Override
	public void run() {
		System.out.println("MyThread35 run priority="+ this.getPriority());
	}
}
