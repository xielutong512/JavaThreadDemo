package com.xielutong.study.test;

import com.xielutong.study.thread.MyThread07;
/**
 * 共享数据(非线程安全)
 * @author 009
 *
 */
public class Demo07 {

	public static void main(String[] args) {
		MyThread07 myThread07 = new MyThread07();
		Thread a = new Thread(myThread07,"A");
		Thread b = new Thread(myThread07,"B");
		Thread c = new Thread(myThread07,"C");
		Thread d = new Thread(myThread07,"D");
		Thread e = new Thread(myThread07,"E");
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}

}
