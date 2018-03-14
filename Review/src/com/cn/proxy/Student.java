package com.cn.proxy;

public class Student implements Person {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("学生吃饭。。");
	}
	
	public void sleep(){
		System.out.println("学生睡觉好舒服");
	}

}
