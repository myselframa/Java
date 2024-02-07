package com.app.last;

import com.app.model.Node;

public class LastOfLinkedList {
	
	Node head;
	
	public void add(int val) {
		Node newNode= new Node();
		
		newNode.data=val;
		newNode.next = null;
		
		if(head== null) {
			head=newNode;
		}else {
			Node lastNode =head; 
			while(lastNode.next!=null) {
				lastNode=head.next;
			}
			lastNode.next=newNode;
		}
	}
	
	public void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) {
		LastOfLinkedList lis=new LastOfLinkedList();
		
		System.out.println("adding  element :"+10);
		lis.add(10);
		System.out.println("adding  element :"+20);
		lis.add(20);
		System.out.println("adding  element :"+30);
		lis.add(30);
		
		System.out.println("The LinkedList Elemt are :");
		lis.print();
	}

}
