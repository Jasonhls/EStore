package com.cn.review2;

public class Decorate implements Car {

	//引用被增强类
	private Car car;
	public Decorate(Car car){
		this.car = car;
	}
	//增强被装饰者的类
	@Override
	public void run() {
		car.run();
		System.out.println("增强的内容。。");
	}

}
