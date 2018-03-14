package com.cn.thread;

public class GarbageDemo {

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("垃圾回收执行代码。。。"
				+ Thread.currentThread().getName());
	}
	
}
