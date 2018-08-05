package com.xielutong.study.test;

import com.xielutong.study.thread.ALogin09;
import com.xielutong.study.thread.BLogin09;
/**
 * 线程安全的方法(synchronized)
 * @author 009
 *
 */
public class Demo09 {

	public static void main(String[] args) {
		ALogin09 a = new ALogin09();
		a.start();
		BLogin09 b = new BLogin09();
		b.start();
	}

}
