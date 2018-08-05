package com.xielutong.study.test;

import com.xielutong.study.thread.MyThread21;

/**
 * 能停止的线程--异常法
 * @author 009
 *
 */
public class Demo21 {

	public static void main(String[] args) throws InterruptedException{
		try {
			MyThread21 myThread21 = new MyThread21();
			myThread21.start();
			Thread.sleep(2000);
			myThread21.interrupt();
		} catch (InterruptedException e){
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}
}
