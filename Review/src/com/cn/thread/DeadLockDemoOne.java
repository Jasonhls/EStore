package com.cn.thread;

public class DeadLockDemoOne {
	public static void main(String[] args) {
	final String s1 = "线程一";
	final String s2 = "线程二";
	 new Thread(){
         public void run() {
            while(true){
                  synchronized(s1){
                     System.out.println(Thread.currentThread().getName() + "获取" + s1 + "等待" + s2);
                     synchronized (s2) {
                    	 System.out.println(Thread.currentThread().getName() + "拿到" + s2 + "开吃");
					 }
                  }
            }
         };
      }.start();
      new Thread(){
    	  public void run(){
    		  while(true){
    			  synchronized (s2) {
					System.out.println(Thread.currentThread().getName() + "获取" + s2 + "等待" + s1);
					synchronized (s1) {
						System.out.println(Thread.currentThread().getName() +  "拿到" + s1 + "开吃");
					}
				}
    		  }
    	  };
      }.start();
				
	}
}
