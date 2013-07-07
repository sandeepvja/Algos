package com.sandeep.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class IOUtils {
	
	public static void redirectInput(String filename){
		FileInputStream istream;
		try {
			istream = new FileInputStream("E:\\programming\\eclipse Workspaces\\amazon interview\\DP\\inputs\\MaximumSubSetSum.txt");
			System.setIn(istream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void redirectOutput(PrintStream ostream){
		System.setOut(ostream);
	}
	public static int takeIntegerInput(Scanner input){
		int integer;
		
		integer = input.nextInt();

		return integer;
	}
	public static int[] take1DArrayInput(Scanner input,int size){
		int[] array = new int[size]; 
		
		for(int i = 0;i < array.length; i++ ){
			array[i] = input.nextInt();
		}

		return array;
	}
	public static void print1DArray(int[] array){
		for(int i = 0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}
