package com.xielutong.study.test;

import com.xielutong.study.thread.MyThread06;
/**
 * 共享数据(非线程安全)
 * @author 009
 *
 */
public class Demo06 {

	public static void main(String[] args) {
		MyThread06 myThread06 = new MyThread06();
		Thread a = new Thread(myThread06,"A");
		Thread b = new Thread(myThread06,"B");
		Thread c = new Thread(myThread06,"C");
		Thread d = new Thread(myThread06,"D");
		Thread e = new Thread(myThread06,"E");
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}

}
