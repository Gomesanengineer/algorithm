package com.icr.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class icrtestsort {

	public static void main(String[] arg) {
		
		/*String[] fruits = new String[] {"Pineapple","Apple", "Orange", "Banana"};
		ArrayList<String> fruitList = new ArrayList<String>(Arrays.asList("Pineapple","Apple", "Orange", "Banana"));
		
		Arrays.sort(fruits);
		
		Collections.sort(fruitList);
		
		for(String str : fruits) {
			System.out.println(str);
		}
		System.out.println("------");
		for(String str : fruitList) {
			System.out.println(str);
		}*/
		
		Employee[] empList = new Employee[6];
		Employee emp1 = new Employee("name3", 22, "city13");
		Employee emp2 = new Employee("name1", 31, "city61");
		Employee emp3 = new Employee("name2", 28, "city12");
		Employee emp4 = new Employee("name1", 23, "city41");
		Employee emp5 = new Employee("name1", 27, "city18");
		Employee emp6 = new Employee("name7", 21, "city71");
		
		empList[0] = emp1;
		empList[1] = emp2;
		empList[2] = emp3;
		empList[3] = emp4;
		empList[4] = emp5;
		empList[5] = emp6;
		
		NameComp nameComp = new NameComp();
		AgeComp ageComp = new AgeComp();
		CityComp cityComp = new CityComp();
		AllComp allComp = new AllComp(nameComp, ageComp, cityComp);
		
		Arrays.sort(empList, allComp);
		
		for(Employee emp : empList) {
			System.out.println(emp);
		}
		
		
		Arrays.sort(empList, cityComp);
		System.out.println("\nCity Sort");
		for(Employee emp : empList) {
			System.out.println(emp);
		}
		
		Arrays.sort(empList, ageComp);
		System.out.println("\nAge Sort");
		for(Employee emp : empList) {
			System.out.println(emp);
		}
		//Arrays.sort(empList);
		/*
		for(Employee emp : empList) {
			System.out.println(emp);
		}*/
	}
	
}