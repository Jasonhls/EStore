package com.cn.string;

public class TestOne {
	public static void main(String[] args) {
		int a[] = new int[5];
		System.out.println(a[4]);
		test1();
		Object b[] = new Object[5];
		System.out.println(b[4]);
	}

	private static void test1() {
		int a[] = new int[4];
		System.out.println(a[3]);
	}
}
