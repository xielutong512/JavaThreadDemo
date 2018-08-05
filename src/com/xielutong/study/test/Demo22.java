package com.xielutong.study.test;

import com.xielutong.study.thread.MyThread22;

/**
 * 能停止的线程--异常法
 * @author 009
 *
 */
public class Demo22 {

	public static void main(String[] args) throws InterruptedException{
		try {
			MyThread22 myThread22 = new MyThread22();
			myThread22.start();
			Thread.sleep(2000);
			myThread22.interrupt();
		} catch (InterruptedException e){
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}
}
