package com.xielutong.study.test;

import com.xielutong.study.thread.MyThread17;

/**
 * interrupt()--调用方法仅仅是在当前线程中打了一个挺值得标记
 * ，并不是真的停止线程
 * @author 009
 *
 */
public class Demo17 {

	public static void main(String[] args) throws InterruptedException{
		try {
			MyThread17 myThread17 = new MyThread17();
			myThread17.start();
			Thread.sleep(2000);
			myThread17.interrupt();
		} catch (InterruptedException e){
			System.out.println("main catch");
			e.printStackTrace();
		}
	}

}
