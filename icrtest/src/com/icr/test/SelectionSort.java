package com.icr.test;

public class SelectionSort {

	public static void main(String[] arg) {
		
		int[] numbers = {32, 22, 55, 11, 66, 102, 12, 10, 1, 80};
				
		numbers = sortInt(numbers);
		printNumbers(numbers);
		
	}
	
	public static void printNumbers(int[] numbers) {
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
	}
	
	public static int[] sortInt(int[] numbers) {
		
		for(int i=0;i<numbers.length-1;i++ ) {
			
			int index = i;
			System.out.println();
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[index]>numbers[j]) {
					index = j;	
					System.out.println("i "+i+" j "+j+"num[i] "+numbers[i]+" num[j] "+numbers[j] + " index : "+index+" num[index] :"+numbers[index]);
				}
			}
			System.out.println();
			int smallnum = numbers[index];
			numbers[index] = numbers[i];
			numbers[i] = smallnum;
			for(int k=0;k<numbers.length;k++) {
				System.out.print(numbers[k]+", ");
			}
		}
		return numbers;
	}
}
