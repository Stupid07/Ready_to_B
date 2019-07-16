package datastructure;

public class MyStack {
	final static int DEFAULT_SIZE = 10;
	int[] myStack;
	int size;
	
	public MyStack() {
		this.myStack = new int[DEFAULT_SIZE];
		
	}
	
	public MyStack(int size) {
		this.myStack = new int[size];
	}
	
	public void push(int number) {
		if(size < myStack.length) {
			myStack[size] = number;
			size++;
		}else {
			int[] newStack = new int[myStack.length<<1];
			for(int idx = 0; idx < myStack.length; idx++) {
				newStack[idx] = myStack[idx];
			}
			newStack[size] = number;
			myStack = newStack;
		}
	}
	
	public int pop() {
		if(size > 0) {
			return myStack[--size];
		}
		throw new RuntimeException("MyStack is Empty");
	}
	
	public int size() {
		return size;
	}
}
