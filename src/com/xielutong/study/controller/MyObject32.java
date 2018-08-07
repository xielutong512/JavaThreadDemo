package com.xielutong.study.controller;

public class MyObject32 {
	private String username = "1";
	private String password = "11";
	public void setValue(String u , String p){
		this.username = u;
		if (Thread.currentThread().getName().equals("a")) {
			System.out.println("线程停止了！");
			Thread.currentThread().suspend();
		}
		this.password = p;
	}
	public void printUsernamePassword(){
		System.out.println(username+" "+password);
	}
}
