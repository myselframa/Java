package com.app;

import com.app.model.Node;

public class LinkedList {
	public static void main(String[] args) {
		Node head,middle,last;
		
		head=new Node();
		middle=new Node();
		last=new Node();
		
		head.data=10;
		middle.data=20;
		last.data=30;
		
		head.next=middle;
		middle.next=last;
		
		
		System.out.println("Elements in the linkedlist are :");
		
		Node temp=head;
		
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
}
