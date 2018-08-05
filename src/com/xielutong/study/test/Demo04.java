package com.xielutong.study.test;

import com.xielutong.study.thread.MyRunnable04;
import com.xielutong.study.thread.MyThread03;

/**
 * 实现Runnable接口，Thread构造函数支持传入Runnable接口
 * @author 009
 *
 */
public class Demo04 {

	public static void main(String[] args) {
		MyRunnable04 myRunnable04 = new MyRunnable04();
		Thread thread = new Thread(myRunnable04);
		thread.start();
		System.out.println("运行结束！");
	}

}
