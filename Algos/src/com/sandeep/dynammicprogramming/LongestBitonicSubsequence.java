package com.sandeep.dynammicprogramming;

public class LongestBitonicSubsequence {
	static int array[];
	static int lis[];
	static int lds[]; 
	/**
	 * @param args
	 */
	private static void increasing_sequence(){
		for(int i = 0; i < lis.length; i++) {
			lis[i] = 1;
		}
		
		for(int i = 1; i < lis.length; i++) {			
			for(int j = 0; j < i; j++) {
				/*
				 * Change this to array[i] >= array[j]  
				 * if the question is longest non-decreasing subsequence  
				 */
				if(array[i] > array[j]){
					lis[i] = Math.max(lis[j]+1, lis[i]);
				}
			}
		}
	}
	private static void decreasing_sequence(){
		for(int i = 0; i < lds.length; i++) {
			lds[i] = 1;
		}
		
		for(int i = lds.length - 2; i >= 0; i--) {			
			for(int j = i + 1; j < lds.length; j++) {
				/*
				 * Change this to array[i] >= array[j]  
				 * if the question is longest non-decreasing subsequence  
				 */
				if(array[i] > array[j]){
					lds[i] = Math.max(lds[j]+1, lds[i]);
				}
			}
		}
	}
    public static int bitonic_sequence(int[] input1)
    {
    	array = input1;
    	lis = new int[array.length];
    	lds = new int[array.length];
    	increasing_sequence();
    	decreasing_sequence();
    	
    	int max = lis[0] + lds[0] - 1;
    	int temp;
    	for(int i = 1;i<array.length;i++){
    		temp = lis[i] + lds[i] - 1;
    		if(max < temp){
    			max = temp;
    		}
    	}
    	
    	return max;
    }
    public static void main(String[] args) {
		//int[] input1 = {1, 11, 2, 10, 4, 5, 2, 1};
		//int[] input1 = {12, 11, 40, 5, 3, 1};
		int[] input1 = {80, 60, 30, 40, 20, 10};
		//IOUtils.print1DArray(input1);
		System.out.print(LongestBitonicSubsequence.bitonic_sequence(input1));
	}

}
