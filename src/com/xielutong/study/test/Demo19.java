package com.xielutong.study.test;

/**
 * this.interrupted()--使mian线程产生中断。
 * @author 009
 *
 */
public class Demo19 {

	public static void main(String[] args) throws InterruptedException{
		Thread.currentThread().interrupt();
		System.out.println("是否停止1？ ="+Thread.interrupted());
		System.out.println("是否停止2？ ="+Thread.interrupted());
		System.out.println("main end");
	}

}
