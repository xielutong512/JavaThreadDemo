package com.xielutong.study.test;

import com.xielutong.study.thread.MyThread33;

/**
 * yield()方法
 * @author 009
 *
 */
public class Demo33 {

	public static void main(String[] args) throws InterruptedException{
		MyThread33 myThread33 = new MyThread33();
		myThread33.start();
	}
}
