package com.icr.test;


import java.util.HashMap;
import java.util.Scanner;

public class Numerology {

	public static void main(String[] arg) throws InterruptedException {

		Scanner nameinput = new Scanner(System.in);
		String name = "";
		String retry = "";
		do {
		do {
			System.out.println("Enter your name : ");
			name = nameinput.nextLine();
		} while(name.length()<3);
		
		/*
		 * String name = "A B C D E F G H I "+ "J K L M N O P Q R "+
		 * "S T U V W X Y Z ";
		 */
		
		int total = calculateNumerology(name);
		System.out.println("Name : " + name + " Total : " + total);
		
		System.out.println("Do you want to retry [y/n] : ");
		retry = nameinput.nextLine();
		
		} while(retry.trim().equalsIgnoreCase("y"));
		
		System.out.println("End");
	}

	public static int calculateNumerology(String name) throws InterruptedException {

		name = name.toUpperCase();
		char[] namearray = name.toCharArray();

		int ascii, numer, remain;
		int total = 0;

		for (int i = 0; i < namearray.length; i++) {

			Character c = new Character(namearray[i]);
			if (c.equals(" ") || !Character.isLetter(c)) {
				continue;
			}
			ascii = (int) c;
			numer = ascii - 64;
			remain = numer % 9;
			remain = (remain == 0) ? 9 : remain;

			System.out.println(c + " :: " + remain);
			total = total + remain;
		}

		// String numerlogytotal = String.valueOf(total);
		int numertotal = 0;

		int n = total;
		
		do {
			numertotal = 0;
			
			while (n > 0) {

				int digit = n % 10;
				n = n / 10;
				numertotal += digit;

			}
			n = numertotal;
		} while (numertotal > 10);

//		System.out.println(numertotal);


		return numertotal;
	}
}
