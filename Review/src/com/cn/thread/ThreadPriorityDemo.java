package com.cn.thread;

public class ThreadPriorityDemo {
	public static void main(String[] args) {
		ThreadPriority tp1 = new ThreadPriority();
		ThreadPriority tp2 = new ThreadPriority();
		ThreadPriority tp3 = new ThreadPriority();
		
		tp1.setName("zhangsan");
		tp2.setName("lisi");
		tp3.setName("wangwu");
		
		System.out.println("-----------------------------------------------------"+tp1.getPriority());
		System.out.println("-----------------------------------------------------"+tp2.getPriority());
		System.out.println("-----------------------------------------------------"+tp3.getPriority());
		
		tp1.setPriority(10);
		tp2.setPriority(1);
		tp1.start();
		tp2.start();
		tp3.start();
	}
}
