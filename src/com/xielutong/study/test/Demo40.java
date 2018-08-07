package com.xielutong.study.test;

import com.xielutong.study.thread.MyThread40;

/**
 * 线程的优先级具有随机性
 * @author 009
 *
 */
public class Demo40 {

	public static void main(String[] args) throws InterruptedException{
		try{
			MyThread40 a = new MyThread40();
			a.setPriority(Thread.NORM_PRIORITY - 3);
			a.start();
			MyThread40 b = new MyThread40();
			b.setPriority(Thread.NORM_PRIORITY + 3);
			b.start();
			Thread.sleep(20000);
			a.stop();
			b.stop();
			System.out.println("a=" + a.getCount());
			System.out.println("b=" + b.getCount());
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
