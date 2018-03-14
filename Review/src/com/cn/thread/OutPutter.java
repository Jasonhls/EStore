package com.cn.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.junit.Test;

public class OutPutter {
	private Lock lock = new ReentrantLock();
	
	public void output(String name){
		lock.lock();  //得到锁
		try {
			for (int i = 0; i < name.length(); i++) {
				System.out.println(name.charAt(i));
			}
		} catch (Exception e) {
			lock.unlock(); //释放锁
		}
	}
	
	@Test
	public void test(){
		
	}
}
