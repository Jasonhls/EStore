package com.cn.thread;

public class ThreadPriority extends Thread{
	@Override
	public void run(){
		for (int i = 0; i < 1000; i++) {
			System.out.println(getName() + ":" + i);
		}
	}
}
