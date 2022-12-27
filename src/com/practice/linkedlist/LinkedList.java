package com.practice.linkedlist;

public class LinkedList {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		
		 Node(int d) {
			data=d;
			next=null;
		}
	}
	
	public void printList() {
		Node n=head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
		
	}
	
	public static void main(String[] args) {
		LinkedList llist=new LinkedList();
		
		llist.head=llist.new Node(748);
		Node second=llist.new Node(2943);
		Node third=llist.new Node(3473647);
		
		llist.head.next=second;
		second.next=third;
		
		llist.printList();
		
		
	}

}
