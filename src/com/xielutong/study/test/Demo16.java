package com.xielutong.study.test;

/**
 * getId()--取得线程的唯一标识
 * @author 009
 *
 */
public class Demo16 {

	public static void main(String[] args) throws InterruptedException{
		Thread runThread = Thread.currentThread();
		System.out.println(runThread.getName() + " " + runThread.getId());
	}

}
