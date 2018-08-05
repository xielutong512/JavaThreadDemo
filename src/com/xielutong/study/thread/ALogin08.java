package com.xielutong.study.thread;

import com.xielutong.study.controller.LoginServlet08;

public class ALogin08 extends Thread{

	@Override
	public void run() {
		LoginServlet08.doPost("a", "aa");
	}
}
