package com.xielutong.study.thread;

import java.util.Random;

public class MyThread38 extends Thread{
	
	@Override
	public void run() {
		long beginTime = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			Random random = new Random();
			random.nextInt();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("☆Thread 38 用时：" + (endTime - beginTime));
	}
}
