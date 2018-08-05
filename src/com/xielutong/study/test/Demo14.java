package com.xielutong.study.test;

import com.xielutong.study.thread.MyThread14;
/**
 * sleep()--直接调用run()
 * @author 009
 *
 */
public class Demo14 {

	public static void main(String[] args) throws InterruptedException{
		MyThread14 myThread14 = new MyThread14();
		System.out.println("begin =" + System.currentTimeMillis());
		myThread14.run();
		System.out.println("end   =" + System.currentTimeMillis());
	}

}
