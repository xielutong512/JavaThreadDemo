package com.xielutong.study.test;

import com.xielutong.study.thread.MyThread18;

/**
 * this.isInterrupted()--測試線程Thread对象是否已经是中断状态
 * ，但不清除状态标识。
 * @author 009
 *
 */
public class Demo20 {

	public static void main(String[] args) throws InterruptedException{
		try {
			MyThread18 myThread18 = new MyThread18();
			myThread18.start();
			Thread.sleep(1000);
			myThread18.interrupt();
			System.out.println("是否停止1？ ="+myThread18.isInterrupted());
			System.out.println("是否停止2？ ="+myThread18.isInterrupted());
		} catch (InterruptedException e){
			System.out.println("main catch");
			e.printStackTrace();
		}
	}
}
