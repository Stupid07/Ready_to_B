package datastructure;

public class MyArraySearch {
	public static int mySearch(int[] array, int key) {
		return myBinarySerach(0, array.length-1, array, key);
	}
	
	private static int myBinarySerach(int start, int end, int[] array, int key) {
		if(start <= end) {
			int mid = (start+end) >> 1;
			if(array[mid] > key) {
				return myBinarySerach(start, mid-1, array, key);
			}else if(array[mid] < key) {
				return myBinarySerach(mid+1, end, array, key);
			}else {
				return mid;
			}
		}
		return -1;
	}
}
