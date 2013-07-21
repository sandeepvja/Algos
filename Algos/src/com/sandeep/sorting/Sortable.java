package com.sandeep.sorting;

public interface Sortable<T extends Comparable<T>> {
	public void sort(T array[]);
}
