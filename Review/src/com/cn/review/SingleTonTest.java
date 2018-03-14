package com.cn.review;

import org.junit.Test;

public class SingleTonTest {
	@Test
	public void testSinleT(){
		SingleTon singleTon = SingleTon.getInstance();
		singleTon.testData();
	}
	@Test
	public void testSingleTT(){
		
	}
}
