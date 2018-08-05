package com.xielutong.study.test;

import com.xielutong.study.thread.MyThread01;

/**
 * 继承Thread
 * @author 009
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread01 myThread01 = new MyThread01();
		myThread01.start();
		System.out.println("运行结束");
		//myThread01.start();
	}

}
