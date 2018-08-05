package com.xielutong.study.test;

import com.xielutong.study.thread.MyThread18;

/**
 * this.interrupted()--测试当前线程是否已经中断，
 * 当前线程是指运行this.interrupted()方法的线程。
 * @author 009
 *
 */
public class Demo18 {

	public static void main(String[] args) throws InterruptedException{
		try {
			MyThread18 myThread18 = new MyThread18();
			myThread18.start();
			Thread.sleep(2000);
			myThread18.interrupt();
			//Thread.currentThread().interrupt();
			//当前线程是指main
			System.out.println("是否停止1？ ="+myThread18.interrupted());
			System.out.println("是否停止2？ ="+myThread18.interrupted());
		} catch (InterruptedException e){
			System.out.println("main catch");
			e.printStackTrace();
		}
	}

}
