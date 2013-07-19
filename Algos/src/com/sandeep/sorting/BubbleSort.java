package com.sandeep.sorting;

import com.sandeep.utilities.IOUtils;

public class BubbleSort<T extends Comparable> implements Sortable<T> {

	@Override
	public void sort(T[] array) {
		for(int i = 0;i<array.length;i++){
			for(int j=0; j<array.length - i- 1;j++){
				if(array[j].compareTo(array[j + 1]) > 0 ) {
					T temp;
					temp = array[j + 1];
					array[j + 1] = array[j];   
					array[j] = temp;
				}
			}
		}
	}
	public static void main(String args[]){
		Sortable bubble = new InsertionSort();
		//Integer[] array = {5,3,1,4,2};
		//Integer[] array = {5,4,3,2,1};
		Integer[] array = {1,2,3,4,5};
		bubble.sort(array);
		for(int i = 0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}	
	}
}
