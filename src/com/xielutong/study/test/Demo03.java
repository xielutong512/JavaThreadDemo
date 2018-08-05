package com.xielutong.study.test;

import com.xielutong.study.thread.MyThread03;

/**
 * 执行start()方法的顺序不代表线程启动的顺序
 * @author 009
 *
 */
public class Demo03 {

	public static void main(String[] args) {
		MyThread03 t1 = new MyThread03(1);
		MyThread03 t2 = new MyThread03(2);
		MyThread03 t3 = new MyThread03(3);
		MyThread03 t4 = new MyThread03(4);
		MyThread03 t5 = new MyThread03(5);
		MyThread03 t6 = new MyThread03(6);
		MyThread03 t7 = new MyThread03(7);
		MyThread03 t8 = new MyThread03(8);
		MyThread03 t9 = new MyThread03(9);
		MyThread03 t10 = new MyThread03(10);
		MyThread03 t11 = new MyThread03(11);
		MyThread03 t12 = new MyThread03(12);
		MyThread03 t13 = new MyThread03(13);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		t11.start();
		t12.start();
		t13.start();
	}

}
