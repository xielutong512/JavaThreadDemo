package com.xielutong.study.test;

import com.xielutong.study.controller.SynchronizedObject27;
import com.xielutong.study.thread.MyThread27;

/**
 * stop()释放锁的不良后果
 * @author 009
 *
 */
public class Demo27 {

	public static void main(String[] args) throws InterruptedException{
		try{
			SynchronizedObject27 object27 = new SynchronizedObject27();
			MyThread27 myThread27 = new MyThread27(object27);
			myThread27.start();
			Thread.sleep(500);
			myThread27.stop();
			System.out.println(object27.getUsername()+ " "
					+object27.getPassword());
		}catch (InterruptedException e){
			e.printStackTrace();
		}
		
	}
}
