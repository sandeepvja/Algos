package com.sandeep.datastructures;

public class HeapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] array = {4,5,2,3,1};
		Heap<Integer> heap = new Heap<Integer>(array);
		heap.insert(6);
		heap.insert(7);
				
		heap.insert(4);
		heap.insert(5);
		heap.insert(3);
		heap.insert(1);
		heap.insert(2);
		
		System.out.println(heap.delete());
		System.out.println(heap.delete());
		System.out.println(heap.delete());
		System.out.println(heap.delete());
		System.out.println(heap.delete());
	
		System.out.println(heap.delete());
		System.out.println(heap.delete());
		System.out.println(heap.delete());
	/*	Integer[] array = (Integer[]) heap.getHeapInArray();
		for(int i = 0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();*/
	}

}
