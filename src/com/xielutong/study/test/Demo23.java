package com.xielutong.study.test;

import com.xielutong.study.thread.MyThread23;

/**
 * 线程在sleep()状态下停止线程，会是什么效果呢？
 * @author 009
 *
 */
public class Demo23 {

	public static void main(String[] args) throws InterruptedException{
		try {
			MyThread23 myThread23 = new MyThread23();
			myThread23.start();
			Thread.sleep(200);
			myThread23.interrupt();
		} catch (InterruptedException e){
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}
}
