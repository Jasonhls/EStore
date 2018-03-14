package com.cn.review2;

import org.junit.Test;

public class DecorateTest {
	
	@Test
	public void testDecorate(){
		Car car = new QQCar();
		car.run();
		Decorate decorate = new Decorate(car);
		decorate.run();
	}
}
