package com.app.start;

import com.app.model.Node;

public class StartOfLinkedList {
	Node head;
	public void addFirst(int val) {
		Node newNode=new Node();
		newNode.data = val;
		newNode.next = head;
		
		head = newNode;
	}
	
	public void print() {
		Node temp=head;
		 while(temp!=null) {
			 System.out.println(temp.data);
			 temp = temp.next;
		 }
	}
	public static void main(String[] args) {
		StartOfLinkedList list= new StartOfLinkedList();
		list.addFirst(10);
		System.out.println("insert element :"+10);
		list.addFirst(20);
		System.out.println("insert element :"+20);
		list.addFirst(30);
		System.out.println("insert element :"+30);
		
		
		System.out.println("The linkedlist elements are :");
		list.print();
		
	}
}
