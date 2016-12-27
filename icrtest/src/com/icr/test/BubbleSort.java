package com.icr.test;

public class BubbleSort {
public static void main(String[] arg) {
	int[] numbers = {32, 22, 55, 11, 66, 102, 12, 10, 1, 80};
	sortInt(numbers);
	printSortedNumbers(numbers);
	
	String[] str = {"hi", "welcome", "hello", "apple", "zebra", "wool", "temple", "micky" };
	
	sortString(str);
	printSortedString(str);
	
}

public static void sortString(String[] names) {
	for(int i=0;i<names.length-1;i++) {
		for(int j=i;j<names.length;j++) {
			if(names[i].compareTo(names[j]) > 0) {
				String temp = names[j];
				names[j] = names[i];
				names[i] = temp;
			}
		}
	}
}

public static void printSortedString(String[] names) {
	for(int i=0;i<names.length;i++) {
		System.out.println(names[i]);
	}
}

public static void sortInt(int[] numbers) {
	for(int i=0;i<numbers.length-1;i++) {
		for(int j=i;j<numbers.length;j++) {
			if(numbers[i]>numbers[j]) {
				int temp = numbers[j];
				numbers[j] = numbers[i];
				numbers[i] = temp;
			}
		}
	}
}

public static void printSortedNumbers(int[] numbers) {
	for(int i=0;i<numbers.length;i++) {
		System.out.println(numbers[i]);
	}
}
}
