package com.xielutong.study.thread;

import com.xielutong.study.controller.SynchronizedObject27;

public class MyThread27 extends Thread{
	
	private SynchronizedObject27 object;
	
	public MyThread27(SynchronizedObject27 object) {
		super();
		this.object = object;
	}



	@Override
	public void run() {
		object.printString("b", "bb");
	}
}
