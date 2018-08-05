package com.xielutong.study.thread;

import com.xielutong.study.controller.LoginServlet08;

public class BLogin08 extends Thread{

	@Override
	public void run() {
		LoginServlet08.doPost("b", "bb");
	}
}
