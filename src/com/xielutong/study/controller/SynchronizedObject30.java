package com.xielutong.study.controller;

public class SynchronizedObject30 {
	
	synchronized public void printString(){
		System.out.println("begin");
		if (Thread.currentThread().getName().equals("a")) {
			System.out.println("a线程永远suspend了");
			Thread.currentThread().suspend();
		}
		System.out.println("end");
	}
}
