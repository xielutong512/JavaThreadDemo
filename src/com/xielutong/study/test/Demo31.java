package com.xielutong.study.test;

import com.xielutong.study.thread.MyThread31;

/**
 * suspend 与 resume 方法 的缺点--另一种独占锁
 * @author 009
 *
 */
public class Demo31 {

	public static void main(String[] args) throws InterruptedException{
		try {
			MyThread31 myThread31 = new MyThread31();
			myThread31.start();
			Thread.sleep(1000);
			myThread31.suspend();
			//println()方法中的锁未释放，不会打印main end！
			System.out.println("main end!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
