package com.xielutong.study.test;

import com.xielutong.study.thread.MyThread15;
/**
 * sleep()--调用start()
 * @author 009
 *
 */
public class Demo15 {

	public static void main(String[] args) throws InterruptedException{
		MyThread15 myThread15 = new MyThread15();
		System.out.println("begin =" + System.currentTimeMillis());
		myThread15.start();
		System.out.println("end   =" + System.currentTimeMillis());
	}

}
