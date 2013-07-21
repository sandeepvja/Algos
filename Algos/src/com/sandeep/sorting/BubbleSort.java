package com.sandeep.sorting;

public class BubbleSort<T extends Comparable<T>> implements Sortable<T> {

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
}
