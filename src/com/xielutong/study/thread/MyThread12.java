package com.xielutong.study.thread;

public class MyThread12 extends Thread{

	@Override
	public void run() {
		System.out.println("run=" + this.isAlive());
	}
}
