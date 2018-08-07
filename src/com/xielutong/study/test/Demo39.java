package com.xielutong.study.test;

import com.xielutong.study.thread.MyThread38;
import com.xielutong.study.thread.MyThread39;

/**
 * 线程的优先级具有随机性
 * @author 009
 *
 */
public class Demo39 {

	public static void main(String[] args) throws InterruptedException{
		for (int i = 0; i < 5; i++) {
			MyThread38 myThread38 = new MyThread38();
			myThread38.setPriority(5);
			myThread38.start();
			MyThread39 myThread39 = new MyThread39();
			myThread39.setPriority(6);
			myThread39.start();
		}
	}
}
