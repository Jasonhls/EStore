package com.cn.thread.connection;

public class Printer3 {
		private int flag = 1;
		public synchronized void print1() throws InterruptedException{
			if(flag != 1){
				this.wait();
			}
			System.out.print("黑");
			System.out.print("马");
			System.out.print("程");
			System.out.print("序");
			System.out.print("员");
			System.out.println();
			flag = 2;
			this.notifyAll();;   //随机唤醒单个等待的线程
		}
		public synchronized void print2() throws InterruptedException{
			if(flag != 2){
				this.wait();
			}
			System.out.print("传");
			System.out.print("智");
			System.out.print("播");
			System.out.print("客");
			System.out.println();
			flag = 3;
			this.notifyAll();
		}
		public synchronized void print3() throws InterruptedException{
			if(flag != 3){
				this.wait();
			}
			System.out.print("大");
			System.out.print("家");
			System.out.print("早");
			System.out.print("上");
			System.out.print("好");
			System.out.println();
			flag = 1;
			this.notifyAll();
		}

}
