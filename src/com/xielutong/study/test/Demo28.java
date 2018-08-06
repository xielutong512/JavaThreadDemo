package com.xielutong.study.test;

import com.xielutong.study.thread.MyThread28;

/**
 * interrupt()与return 结合使用实现停止线程的效果
 * 建议用“抛异常”的方法来实现线程的停止，因为在catch块还可以将异常向上抛，
 * 使线程停止的事件传播
 * @author 009
 *
 */
public class Demo28 {

	public static void main(String[] args) throws InterruptedException{
		MyThread28 myThread28 = new MyThread28();
		myThread28.start();
		Thread.sleep(2000);
		myThread28.interrupt();
	}
}
