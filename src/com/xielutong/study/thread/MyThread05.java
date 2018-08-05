package com.xielutong.study.thread;

public class MyThread05 extends Thread{

	private int count = 5;
	
	public MyThread05(String name) {
		super();
		this.setName(name); // 设置多线程名称
	}

	@Override
	public void run() {
		super.run();
		while(count > 0 ){
			count--;
			System.out.println(" 由 " + this.currentThread().getName()
					+ " 计算，count=" + count);
		}
	}
	
}
