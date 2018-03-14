package com.cn.link;

public class LinkList {
	public Node first;//定义一个头节点
	private int pos = 0;//节点的位置
	public int getPos() {
		return pos;
	}
	public void setPos(int pos) {
		this.pos = pos;
	}
	
	public LinkList(){
		this.first = null;
	}
	//插入一个头结点
	public void addFirstNode(int data){
		Node node = new Node(data);
		//System.out.println(this.first);
		node.next = this.first;
		this.first = node;
		//System.out.println(this.first);
	}
	//删除头结点，并返回头节点
	public Node deleteFirstNode(){
		Node node = this.first;
		this.first = node.next;
		return node;
	}
	//在任意位置插入节点，在index后面插入
	public void add(int data,int index){
		Node node = new Node(data);
		Node p = this.first;
		
		while(pos != index){
			p = p.next;
			pos++;
			if(p == null){
				System.out.println("插入失败");
				pos = 0;
				return;
			}
		}
		p.next = node;
		pos = 0;
	}
	//显示所有的节点信息
	public void displayAll(){
		Node node = this.first;
		while(node != null){
			node.display();
			node = node.next;
		}
	}
}
