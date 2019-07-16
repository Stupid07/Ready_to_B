package datastructure;

import java.util.Arrays;

public class StructureTest {
	public static void main(String[] args) {
		int[] testData = {5, 3, 2, 4, 1, 6};
		
		//Stack Test
//		MyStack stack = new MyStack(testData.length);
//		for(int i = 0 ; i < testData.length; i++) {
//			stack.push(testData[i]);
//		}
//		for(int i = 0, size = stack.size(); i < size; i++) {
//			System.out.println(stack.pop());
//		}
		
		//LinkedList Test
//		MyLinkedList list = new MyLinkedList();
//		list.pushFront(2);
//		System.out.println(list.popFront());//2
//		System.out.println("size : " + list.size());//0
//		list.pushBack(3);
//		list.pushBack(2);
//		list.pushFront(1);
//		System.out.println(list.popBack()); // 2
//		System.out.println(list.popFront()); // 1
//		System.out.println(list.popFront()); // 3
		
		//Sort Test
		MyArraySort.mySort(testData);
		System.out.println(Arrays.toString(testData));
		
		//Search Test
		System.out.println(MyArraySearch.mySearch(testData, 1));
		System.out.println(MyArraySearch.mySearch(testData, 5));
		System.out.println(MyArraySearch.mySearch(testData, 7));
	}
}
