package com.cn.thread;

public class GarbageCollectionTest {
	public static void main(String[] args) {
		for (int i = 0; i < 100000; i++) {
			new GarbageDemo();
			//System.gc();
		}
		for (int i = 0; i < 10000; i++) {
			System.out.println("这个是主线程" + Thread.currentThread().getName());
		}
	}
}
