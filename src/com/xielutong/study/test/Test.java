package com.xielutong.study.test;

/**
 * 主线程（一个进程正在运行时至少会有1个线程在运行）
 * @author 009
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
	}

}
