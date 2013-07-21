package com.sandeep.sorting;

public class SortMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sortable<Integer> bubble = new SelectionSort<Integer>();
		//Integer[] array = {5,3,1,4,2};
		//Integer[] array = {5,4,3,2,1};
		Integer[] array = {1,2,3,4,5};
		bubble.sort(array);
		for(int i = 0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}

	}

}
