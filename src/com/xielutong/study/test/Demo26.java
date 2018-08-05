package com.xielutong.study.test;

import com.xielutong.study.thread.MyThread26;

/**
 * stop()与java.lang.ThreadDeath异常
 * @author 009
 *
 */
public class Demo26 {

	public static void main(String[] args) throws InterruptedException{
		MyThread26 myThread26 = new MyThread26();
		myThread26.start();
	}
}
