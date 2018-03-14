package com.cn.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestOne {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(60);
		list.add(100);
		list.add(80);
		list.add(50);
		//for循环遍历
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			if(it.next().equals(100)){
				it.remove();
			}
		}
	}
	
	
}
