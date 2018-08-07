package com.xielutong.study.test;

import com.xielutong.study.controller.MyObject32;

/**
 * suspend 与 resume 方法 的缺点--不同步
 * @author 009
 *
 */
public class Demo32 {

	public static void main(String[] args) throws InterruptedException{
		final MyObject32 myObject32 = new MyObject32();
		Thread thread1 = new Thread(){
			@Override
			public void run() {
				myObject32.setValue("a", "aa");
			}
		};
		thread1.setName("a");
		thread1.start();
		Thread.sleep(500);
		Thread thread2 = new Thread(){
			@Override
			public void run() {
				myObject32.printUsernamePassword();
			}
		};
		thread2.start();
	}
}
