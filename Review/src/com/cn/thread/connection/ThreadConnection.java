package com.cn.thread.connection;

public class ThreadConnection {
	public static void main(String[] args) {
		final Printer2 p = new Printer2();
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
	}
}
