package com.xielutong.study.thread;

public class MyThread02 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try{
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
