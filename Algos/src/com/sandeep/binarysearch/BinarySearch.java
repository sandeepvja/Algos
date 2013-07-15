package com.sandeep.binarysearch;

public class BinarySearch {
	public static int search(int array[],int key){
		int low = 0;
		int high = array.length - 1;
		int mid;
		while(low <= high) {
			mid = (low + high) >>> 1;
			if(array[mid] < key ) {
				low = mid + 1;
			}
			else if (array[mid] > key) {
				high = mid - 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	public static void main(String args[]){
		int array[] = {1,2,3,4,5};
		System.out.println("Found the Key at index: "+BinarySearch.search(array, 4));
		System.out.println("Found the Key at: "+BinarySearch.search(array, 10));
	}
}
