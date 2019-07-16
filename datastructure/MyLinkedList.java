package datastructure;

public class MyLinkedList {
	class Node{
		Node preNode;
		int data;
		Node nextNode;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	Node front;
	Node back;
	int size;
	
	public MyLinkedList() {
		front = null;
		back = null;
		size = 0;
	}
	
	public void pushFront(int data) {
		Node newNode = new Node(data);
		if(front == null) {
			front = newNode;
			back = front;
		}else {
			front.preNode = newNode;
			newNode.nextNode = front;
			front = newNode;
		}
		size++;
	}
	
	public void pushBack(int data) {
		Node newNode = new Node(data);
		if(back == null) {
			back = newNode;
			front = back;
		}else {
			back.nextNode = newNode;
			newNode.preNode = back;
			back = newNode;
		}
		size++;
	}
	
	public int popFront() {
		if(front == null) {
			throw new RuntimeException("MyLinkedList is Empty");
		}
		
		int data = front.data;
		
		front = front.nextNode;
		size--;
		
		if(size > 0) {
			front.preNode = null;
		}else {
			back = null;
		}
		
		
		return data;
	}
	
	public int popBack() {
		if(back == null) {
			throw new RuntimeException("MyLinkedList is Empty");
		}
		int data = back.data;
		back = back.preNode;
		size--;
		
		if(size > 0) {
			back.nextNode = null;
		}else {
			front = null;
		}
		
		return data;
		
	}
	
	public int size() {
		return size;
	}
}
