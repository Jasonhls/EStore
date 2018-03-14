package com.cn.review;

public class SingleTon2 {
	private static SingleTon2 singleTon2 = new SingleTon2();
	private SingleTon2(){};
	public SingleTon2 getInstance(){
		return singleTon2;
	}
}
