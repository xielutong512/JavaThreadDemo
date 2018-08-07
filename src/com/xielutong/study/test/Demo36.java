package com.xielutong.study.test;

import com.xielutong.study.thread.MyThread36;
import com.xielutong.study.thread.MyThread37;

/**
 * 线程的优先级具有规则性
 * @author 009
 *
 */
public class Demo36 {

	public static void main(String[] args) throws InterruptedException{
		for (int i = 0; i < 5; i++) {
			MyThread36 myThread36 = new MyThread36();
			myThread36.setPriority(1);
			myThread36.start();
			MyThread37 myThread37 = new MyThread37();
			myThread37.setPriority(10);
			myThread37.start();
		}
	}
}
