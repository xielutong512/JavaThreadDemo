package com.xielutong.study.test;

import com.xielutong.study.thread.MyThread02;

/**
 * 线程随机特性
 * @author 009
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		try{
			MyThread02 myThread02 = new MyThread02();
			//myThread02.setName("myThread02");
			myThread02.start();
			for (int i = 0; i < 10; i++) {
				int time = (int)(Math.random()*1000);
				Thread.sleep(time);
				System.out.println("run="+Thread.currentThread().getName());
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
