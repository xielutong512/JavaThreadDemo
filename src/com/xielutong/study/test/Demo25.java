package com.xielutong.study.test;

import com.xielutong.study.thread.MyThread25;

/**
 * stop(),停止线程(废弃)
 * @author 009
 *
 */
public class Demo25 {

	public static void main(String[] args) throws InterruptedException{
		try{
			MyThread25 myThread25 = new MyThread25();
			myThread25.start();
			Thread.sleep(8000);
			myThread25.stop();
		} catch (InterruptedException e){
			e.printStackTrace();
		}
	}
}
