package com.cn.string;

public class TestTwo {
	public static void main(String[] args) {
		testObject(); //返回的是对象的地址
		testCharArray(); //返回的字符数组的值，如果没有值就为空字符（一个空格）
		testCharArrayOffCount();//返回的是从索引值为off开始count个数的值，包括off
		testBoolean();//如果b为true，返回true，为false，就返回false
		testChar();//返回值
		testInt();//返回值
		testFloat();//返回值
		testDouble();//返回值
	}
	
	private static void testObject(){
		//Object obj = new Object();
		Object obj = "q";
		System.out.println(String.valueOf(obj));  //返回的是obj.toString()，如果是对象就是地址值
	}
	private static void testCharArray(){
		//char data[] = {'a','b','c'};
		char data[] = new char[5];
		System.out.println(String.valueOf(data)); //返回的字符数组的值，如果没有值就为空字符（一个空格）
	}
	private static void testCharArrayOffCount(){
		char data[] = {'a','b','c','d','e'};
		int off = 2;
		int count = 3;
		System.out.println(String.valueOf(data,off,count)); //返回的是从索引值为off开始count个数的值，包括off
	}
	private static void testBoolean(){
		boolean b = true;
		System.out.println(String.valueOf(b));//如果b为true，返回true，为false，就返回false
	}
	private static void testChar(){
		System.out.println(String.valueOf('c'));//返回值
	}
	private static void testInt(){
		System.out.println(String.valueOf(10));//返回值
	}
	private static void testLong(){
		long l = 23L;//后缀为l或者L都一样
		System.out.println(String.valueOf(l));//返回值
	}
	private static void testFloat(){
		float f = 123.4f;
		System.out.println(String.valueOf(f));//返回值
	}
	private static void testDouble(){
		double d = 234.555d;
		System.out.println(String.valueOf(d));//返回值
	}
	
}
