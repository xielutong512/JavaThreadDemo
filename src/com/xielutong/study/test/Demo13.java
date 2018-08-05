package com.xielutong.study.test;

import com.xielutong.study.thread.MyThread13;
/**
 * isAlive()--（Thread.currentThread()和this的差异）
 * @author 009
 *
 */
public class Demo13 {

	public static void main(String[] args) throws InterruptedException{
		MyThread13 myThread13 = new MyThread13();
		Thread t1 = new Thread(myThread13);
		System.out.println("main begin t1 isAlive=" + t1.isAlive());
		t1.setName("A");
		t1.start();
		//Thread.sleep(1000);
		System.out.println("main end t1 isAlive=" + t1.isAlive());
	}

}
