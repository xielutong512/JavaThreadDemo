package com.xielutong.study.thread;

public class MyThread40 extends Thread{
	
	private int count = 0;
	
	public int getCount(){
		return count;
	}
	
	@Override
	public void run() {
		while (true){
			count++;
		}
	}
}
