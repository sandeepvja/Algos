package com.sandeep.sorting;

public interface Sortable<T extends Comparable> {
	public void sort(T array[]);
}
