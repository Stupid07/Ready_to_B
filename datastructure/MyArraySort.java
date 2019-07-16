package datastructure;

public class MyArraySort {
	private static int[] tempArray;
	public static void mySort(int[] array) {
		tempArray = new int[array.length];
		myMergeSort(0, array.length-1, array);
	}
	
	private static void myMergeSort(int start, int end, int[] array) {
		if(start < end) {
			int mid = (start+end) >>1;
			myMergeSort(start, mid, array);
			myMergeSort(mid +1, end, array);
			myMerge(start, mid, end, array);
		}
	}
	
	private static void myMerge(int start, int mid, int end ,int[] array) {
		int left = start, right = mid +1, tempIdx = start;
		while(left <= mid && right <= end) {
			if(array[left] < array[right]) {
				tempArray[tempIdx] = array[left++];
			}else {
				tempArray[tempIdx] = array[right++];
			}
			tempIdx++;
		}
		
		if(left <= mid) {
			while(left <= mid) {
				tempArray[tempIdx++] = array[left++];
			}
		}else {
			while(right <= end) {
				tempArray[tempIdx++] = array[right++];
			}
		}
		
		for(int i = start; i <= end; i++) {
			array[i] = tempArray[i];
		}
	}
}
