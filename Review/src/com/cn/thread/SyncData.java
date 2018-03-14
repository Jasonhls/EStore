package com.cn.thread;

public class SyncData {
	private int data;

	public synchronized void getData() {
		System.out.println(Thread.currentThread().getName() + "准备读出数据");
		try {
			Thread.sleep(20);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "读出" + this.data);
	}

	public synchronized void setData(int data) {
		System.out.println(Thread.currentThread().getName() + "准备写入数据");
		try {
			Thread.sleep(20);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "写入" + this.data);
	}
	
}
