package com.xielutong.study.thread;

public class MyThread14 extends Thread{
	
	@Override
	public void run() {
		try {
		System.out.println("run threadName="
				+ this.currentThread().getName());
		Thread.sleep(2000);
		System.out.println("run threadName="
				+ this.currentThread().getName());
		} catch (InterruptedException e){
			e.printStackTrace();
		}
	}
}
