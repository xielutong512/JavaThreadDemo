package com.xielutong.study.thread;

public class MyThread15 extends Thread{
	
	@Override
	public void run() {
		try {
		System.out.println("run threadName="
				+ this.currentThread().getName() + " begin ="
				+ System.currentTimeMillis());
		Thread.sleep(2000);
		System.out.println("run threadName="
				+ this.currentThread().getName() + " end   ="
				+ System.currentTimeMillis());
		} catch (InterruptedException e){
			e.printStackTrace();
		}
	}
}
