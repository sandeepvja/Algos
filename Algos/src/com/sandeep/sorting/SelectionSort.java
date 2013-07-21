package com.sandeep.sorting;

public class SelectionSort<T extends Comparable<T>> implements Sortable<T> {

	@Override
	public void sort(T[] array) {
		int min;
		for(int i = 0;i<array.length;i++) {
			min = i;
			for(int j = i+1; j<array.length;j++) {
				if(array[j].compareTo(array[min]) < 0) {
					min = j;
				}
			}
			if((min != i) ) {
				T temp;
				temp = array[min];
				array[min] = array[i];   
				array[i] = temp;
			}
		}
	}
}
