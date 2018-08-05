package com.xielutong.study.test;

import com.xielutong.study.thread.ALogin08;
import com.xielutong.study.thread.BLogin08;
/**
 * 非线程安全的方法
 * @author 009
 *
 */
public class Demo08 {

	public static void main(String[] args) {
		ALogin08 a = new ALogin08();
		a.start();
		BLogin08 b = new BLogin08();
		b.start();
	}

}
