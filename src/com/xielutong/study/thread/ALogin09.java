package com.xielutong.study.thread;

import com.xielutong.study.controller.LoginServlet09;

public class ALogin09 extends Thread{

	@Override
	public void run() {
		LoginServlet09.doPost("a", "aa");
	}
}
