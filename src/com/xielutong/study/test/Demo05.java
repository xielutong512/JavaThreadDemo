package com.xielutong.study.test;

import com.xielutong.study.thread.MyThread05;
/**
 * 不共享数据
 * @author 009
 *
 */
public class Demo05 {

	public static void main(String[] args) {
		MyThread05 a = new MyThread05("A");
		MyThread05 b = new MyThread05("B");
		MyThread05 c = new MyThread05("C");
		a.start();
		b.start();
		c.start();
	}

}
