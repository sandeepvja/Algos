package com.sandeep.dynammicprogramming;

import java.util.Scanner;

import com.sandeep.utilities.IOUtils;
/*
 * Longest Increasing Subsequence 
 * Variation can be longest non-decreasing subsequence
 */
public class LongestIncreasingSubsequence implements Algorithms{
	Scanner input;
	int array[];
	int lis[];
	

	public void readInput(){
		input = new Scanner(System.in);
		
		int size = IOUtils.takeIntegerInput(input);
		array = IOUtils.take1DArrayInput(input, size);
		lis = new int[array.length];
	}
	public static void main(String args[]){		
		
		LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
		
		lis.readInput();
		int result = lis.solve();
		System.out.println(result);
		
	}
	@Override
	public int optimizedSolve() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int solve() {
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
		IOUtils.print1DArray(lis);
		int max = findMax(lis);
		return max;
	}
	private static int findMax(int array[]){
		int maximum = array[0];
		for(int ele:array){
			if(ele > maximum){
				maximum = ele;
			}
		}
		return maximum;
	}
}
