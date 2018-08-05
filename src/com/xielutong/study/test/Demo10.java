package com.xielutong.study.test;

import com.xielutong.study.thread.MyThread10;
/**
 * println()方法与i++联合使用时“有可能”出现另一种异常
 * @author 009
 *
 */
public class Demo10 {

	public static void main(String[] args) {
		MyThread10 myThread10 = new MyThread10();
		Thread t1 = new Thread(myThread10);
		Thread t2 = new Thread(myThread10);
		Thread t3 = new Thread(myThread10);
		Thread t4 = new Thread(myThread10);
		Thread t5 = new Thread(myThread10);
		Thread t6 = new Thread(myThread10);
		Thread t7 = new Thread(myThread10);
		Thread t8 = new Thread(myThread10);
		Thread t9 = new Thread(myThread10);
		Thread t10 = new Thread(myThread10);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
	}

}
