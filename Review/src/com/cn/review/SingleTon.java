package com.cn.review;

public class SingleTon {
	private static SingleTon singleTon = null;

	private SingleTon() {
	}
	public static SingleTon getInstance(){
		if(singleTon == null){
			synchronized (SingleTon.class) {
				if(singleTon == null){
					singleTon = new SingleTon();
				}
			}
		} 
		return singleTon;
	}
	
	public void testData(){
		System.out.println("线程安全的单例测试。。");
	}
}
