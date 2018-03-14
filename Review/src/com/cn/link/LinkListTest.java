package com.cn.link;

import org.junit.Test;

public class LinkListTest {
	//节点测试
	@Test
	public void testNode(){
		Node node = new Node(123);
		node.display();
		System.out.println(node.data);
		System.out.println(node.next);
	}
	//链表测试
	@Test
	public void testLinkList(){
		LinkList linkList = new LinkList();
		System.out.println(linkList.first);
		System.out.println(linkList.getPos());
	}
	
	@Test
	public void testAddFirstNode(){
		LinkList linkList = new LinkList();
		linkList.addFirstNode(10);
		System.out.println("--------------");
		System.out.println(linkList.first);
		System.out.println(linkList.first.next);
		System.out.println(linkList.first.data);
		System.out.println(linkList.getPos());
	}
	
	@Test
	public void testAddNode(){
		LinkList linkList = new LinkList();
		linkList.addFirstNode(10);
		linkList.add(20, 2);
		linkList.displayAll();
	}
	
	
}
