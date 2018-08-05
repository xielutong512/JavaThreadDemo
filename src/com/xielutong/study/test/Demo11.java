package com.xielutong.study.test;

import com.xielutong.study.thread.MyThread11;
/**
 * getName()
 * @author 009
 *
 */
public class Demo11 {

	public static void main(String[] args) {
		MyThread11 myThread11 = new MyThread11();
		Thread t1 = new Thread(myThread11);
		t1.setName("A"); //只会修改t1的name，不会修改myThread11的name
		t1.start();
	}

}
