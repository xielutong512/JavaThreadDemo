package com.xielutong.study.test;

import com.xielutong.study.thread.MyThread24;

/**
 * 线程在先停止，再遇到了sleep()
 * @author 009
 *
 */
public class Demo24 {

	public static void main(String[] args) throws InterruptedException{
		MyThread24 myThread24 = new MyThread24();
		myThread24.start();
		myThread24.interrupt();
		System.out.println("end!");
	}
}
