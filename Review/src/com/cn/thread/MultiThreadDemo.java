package com.cn.thread;

public class MultiThreadDemo {
	public static void main(String[] args) {
		new Thread(){
			long m = 1000000 / 4;
			long t1 = 0;
			long t2 = 0;
			public void run(){
				t1 = System.currentTimeMillis();
				while(true){
					m --;
					System.out.println("线程速度测试");
					if(m <= 0){
						break;
					}
				}
				t2 = System.currentTimeMillis();
				System.out.println("----------------------");
				System.out.println(t2 - t1); //一个线程耗时3309
			}
		}.start();
		new Thread(){
			long m = 1000000 / 4;
			long t3 = 0;
			long t4 = 0;
			public void run(){
				t3 = System.currentTimeMillis();
				while(true){
					m --;
					System.out.println("线程速度测试");
					if(m <= 0){
						break;
					}
				}
				t4 = System.currentTimeMillis();
				System.out.println("----------------------");
				System.out.println(t4 - t3); //一个线程耗时750
			}
			
		}.start();
	}
	
}
