package com.cn.thread.connection;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Printer4 {
	private ReentrantLock r = new ReentrantLock();
	private Condition c1 = r.newCondition();
	private Condition c2 = r.newCondition();
	private Condition c3 = r.newCondition();
	private int flag = 1;
	public void print1() throws InterruptedException {
		r.lock();
		if( flag != 1){
			c1.await();
		}
		System.out.print("黑");
		System.out.print("马");
		System.out.print("程");
		System.out.print("序");
		System.out.print("员");
		System.out.println();
		flag = 2;
		c2.signal();
		r.unlock();
	}
	public void print2() throws InterruptedException {
		r.lock();
		if(flag != 2){
			c2.await();
		}
		System.out.print("传");
		System.out.print("智");
		System.out.print("播");
		System.out.print("客");
		System.out.println();
		flag = 3;
		c3.signal();
		r.unlock();
	}
	public void print3() throws InterruptedException {
		r.lock();
		if(flag != 3){
			c3.await();
		}
		System.out.print("大");
		System.out.print("家");
		System.out.print("早");
		System.out.print("上");
		System.out.print("好");
		System.out.println();
		flag = 1;
		c1.signal();
		r.unlock();
	}
	
}
