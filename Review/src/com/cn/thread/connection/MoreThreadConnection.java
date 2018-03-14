package com.cn.thread.connection;
/**
 * 不能实现三个依次轮流的打印，只能交换打印输出结果
 * @author Jason
 *
 */
public class MoreThreadConnection {
	public static void main(String[] args) {
		final Printer3 p = new Printer3();
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
