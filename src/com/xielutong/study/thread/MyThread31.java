package com.xielutong.study.thread;

public class MyThread31 extends Thread{
	
	private long i = 0;
	
	@Override
	public void run() {
		while (true){
			i++;
			System.out.println(i);
		}
	}
}
