package com.xielutong.study.test;

import com.xielutong.study.thread.MyThread12;
/**
 * isAlive()
 * @author 009
 *
 */
public class Demo12 {

	public static void main(String[] args) throws InterruptedException{
		MyThread12 myThread12 = new MyThread12();
		System.out.println("begin ==" + myThread12.isAlive());
		myThread12.start();
		//Thread.sleep(1000);
		System.out.println("end ==" + myThread12.isAlive());
	}

}
