package com.icr.test;

public class InsertionSort {
	

	public static void main(String[] arg) {
		
		int[] numbers = {32, 22, 55, 11, 66, 102, 12, 10, 1, 80,2};
		printNumbers(numbers);
		System.out.println();
		numbers = sortInt(numbers);
		//printNumbers(numbers);
		
	}
	
	public static void printNumbers(int[] numbers) {
		System.out.println();
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}
	}
	
	public static int[] sortInt(int[] numbers) {
		for(int i=1;i<numbers.length;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("i "+i+":: j "+j+"\n");
				
				if(numbers[j]>numbers[i]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
			printNumbers(numbers);
		}
		
		return numbers;	
	}
	
}
