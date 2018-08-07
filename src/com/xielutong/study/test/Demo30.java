package com.xielutong.study.test;

import com.xielutong.study.controller.SynchronizedObject30;

/**
 * suspend 与 resume 方法 的缺点--独占
 * @author 009
 *
 */
public class Demo30 {

	public static void main(String[] args) throws InterruptedException{
		try {
			final SynchronizedObject30 object30 = new SynchronizedObject30();
			Thread thread1 = new Thread() {
				@Override
				public void run() {
					object30.printString();
				}
			};
			thread1.setName("a");
			thread1.start();
			Thread.sleep(1000);
			Thread thread2 = new Thread(){
				@Override
				public void run() {
					System.out.println("thread2启动了，但进入不了printString()方法！");
					System.out.println("因为printString()方法被a线程锁定并且永远suspend暂停了！");
					object30.printString();
				}
			};
			thread2.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
