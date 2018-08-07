package com.xielutong.study.test;

import com.xielutong.study.thread.MyThread34;
import com.xielutong.study.thread.MyThread35;

/**
 * 线程的优先级具有继承性
 * @author 009
 *
 */
public class Demo35 {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("main thread begin priority="
				+ Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(6);
		System.out.println("main thread end   priority="
				+ Thread.currentThread().getPriority());
		MyThread34 myThread34 = new MyThread34();
		myThread34.start();
	}
}
