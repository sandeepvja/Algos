package com.sandeep.sorting;

public class InsertionSort<T extends Comparable<T>> implements Sortable<T> {

	@Override
	public void sort(T[] array) {
		int j;
		for(int i = 1;i<array.length;i++){
			T key = array[i];
			
			for(j = i - 1; j >= 0; j--){
				if(array[j].compareTo(key) > 0){
					array[j + 1] = array[j];
				}
				else {
					break;
				}					
			}
			array[j + 1] = key; 
		}		
	}

}
