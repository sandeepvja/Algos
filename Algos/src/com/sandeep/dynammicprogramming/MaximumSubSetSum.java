package com.sandeep.dynammicprogramming;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import com.sandeep.utilities.IOUtils;

/*
 * 	
* Largest Sum Contiguous Subarray
* July 7th, 2013

* Write an efficient program to find the 
* sum of contiguous subarray within a 
* one-dimensional array of numbers which has the largest sum.
* 
*/
public class MaximumSubSetSum {
	int array[];
	int subsetSum[];
	public MaximumSubSetSum(){
		
	}

	public void readInput() {
		
		Scanner input = new Scanner(System.in);
		int size = IOUtils.takeIntegerInput(input);
		array = IOUtils.take1DArrayInput(input,size);
		
		IOUtils.print1DArray(array);
		
		subsetSum = new int[array.length];
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
	public int solve(){
		for(int i=0;i<array.length;i++){
			subsetSum[i] = array[i];
		}
		for(int i = 1;i<array.length;i++){
			subsetSum[i] = Math.max(subsetSum[i-1] + array[i], array[i]);
		}
		//IOUtils.print1DArray(subsetSum);
		return findMax(subsetSum);
	}
	public static void main(String args[]) throws FileNotFoundException{		
		IOUtils.redirectInput("E:\\programming\\eclipse Workspaces\\amazon interview\\DP\\inputs\\MaximumSubSetSum.txt");
		
		MaximumSubSetSum subsetSum = new MaximumSubSetSum();
		subsetSum.readInput();
		int maxSum = subsetSum.solve();
		System.out.println(maxSum);
	}
}
