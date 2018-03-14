package com.cn.link;

public class Node {
	Node next = null;//节点的引用，指向下一个节点
	int data;//节点的对象，即内容
	
	public Node(int data) {
		super();
		this.data = data;
	}
	
	public void display(){
		System.out.println(data+"");
	}
}
