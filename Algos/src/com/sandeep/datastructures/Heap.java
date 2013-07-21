package com.sandeep.datastructures;

import java.util.NoSuchElementException;

public class Heap<T extends Comparable<T>> {
	T array[];
	int size;
	int capacity;
	public Heap(T arr[]){
		size = arr.length;
		capacity = size;
		
		array = arr;
		
		constructHeap();
	}
	
	@SuppressWarnings("unchecked")
	public Heap(int capacity) {		
		array = (T[]) new Comparable[capacity];
		
		this.capacity = capacity;
		this.size = 0;
	}
	public void constructHeap(){
		
		for(int i = size / 2; i >= 0; i--) {
			percolateDown(i);
		}
	}
	public void insert(T element) {
		if(capacity == size){
			System.out.println("Calling Resize");
			resize();			
		}
		
		array[size] = element;
		size++;
		percolateUp(size - 1);
		
		printHeap();
	}	
	public T delete() {
		if(size == 0){
			throw new NoSuchElementException();
		}
		T returnVal = array[0];
		
		swap(0, size - 1);
		size--;
		percolateDown(0);
		
		
		return returnVal; 
	}
	
	public T[] getHeapInArray(){
		return array;
	}
	public void printHeap(){
		for(int i=0;i<size;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	private void resize() {
		capacity = 2 * capacity;
		System.out.println("New Capacity: "+capacity);
		
		@SuppressWarnings("unchecked")
		T[] arr = (T[])new Comparable[capacity];
		
		for(int i = 0; i < size; i++ ) {
			arr[i] = array[i];
		}
		
		array = arr;
	}
	
	private void percolateUp(int i) {
		while(true) {
			int parent = parent(i);
			if(parent == i)
				break;
			if((array[parent]).compareTo(array[i]) < 0) {
				swap(parent,i);
				i = parent;
			}
			else {
				break;
			}
		}
	}
	private void percolateDown(int i){
		while(true) {
			int leftChild = leftChild(i);
			int rightChild = rightChild(i);
			
			int maxChild = max(leftChild,rightChild);
			int maxElement = max(i,maxChild);
			if(i != maxElement && maxElement > 0 && maxElement < size) {
				swap(i,maxChild);
				i = maxChild;
			}
			else
				break;
		}
	}
	private void swap(int i,int j){
		T temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	private int max(int i,int j){
		if(i >= size)
			return j;
		if(j >= size)
			return i;
		return array[i].compareTo(array[j]) > 0 ? i : j; 
	}
	private int parent(int i){
		return (i - 1)  / 2;
	}
	private int leftChild(int i){
		return 2 * i + 1;
	}
	private int rightChild(int i){
		return 2 * i + 2;
	}
}
