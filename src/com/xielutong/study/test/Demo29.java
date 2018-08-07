package com.xielutong.study.test;

import com.xielutong.study.thread.MyThread29;

/**
 * suspend 与 resume 方法
 * @author 009
 *
 */
public class Demo29 {

	public static void main(String[] args) throws InterruptedException{
		try {
			MyThread29 myThread29 = new MyThread29();
			myThread29.start();
			Thread.sleep(5000);
			//A 段
			myThread29.suspend();
			System.out.println("A= " + System.currentTimeMillis() + " i="
					+ myThread29.getI());
			Thread.sleep(5000);
			System.out.println("A= " + System.currentTimeMillis() + " i="
					+ myThread29.getI());
			//B 段
			myThread29.resume();
			Thread.sleep(5000);
			//C 段
			myThread29.suspend();
			System.out.println("B= " + System.currentTimeMillis() + " i="
					+ myThread29.getI());
			Thread.sleep(5000);
			System.out.println("B= " + System.currentTimeMillis() + " i="
					+ myThread29.getI());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
