package com.cn.thread.connection;
/**
 * 使用ReentrantLock
 * 测试结果：
 * 轮流打印输出：传智播客
				大家早上好
				黑马程序员
	这三个哪一个先打印不确定，但是一定是轮流地输出
 * @author Jason
 *
 */
public class MoreThreadConnectionTestWithLock {
	public static void main(String[] args) {
		final Printer4 p = new Printer4();
		new Thread(){
			public void run() {
				while(true){
					try {
						p.print1();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			};
		}.start();
		new Thread(){
			public void run() {
				while(true){
					try {
						p.print2();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			};
		}.start();
		new Thread(){
			public void run() {
				while(true){
					try {
						p.print3();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			};
		}.start();
	}
}
