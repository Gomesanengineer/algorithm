package com.icr.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Employee {	//implements Comparable<Employee> {
	
	String name;
	int age;
	String city;
	
	Employee(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	/*public int compareTo(Employee e) {
		String tempname = e.city;
		return tempname.compareTo(this.city);
	}*/
	
	public String toString() {
		return name+"::"+age+"::"+city;
	}
	
}

class NameComp implements Comparator<Employee> {
	
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);
	}

}

class AgeComp implements Comparator<Employee> {
	
	public int compare(Employee e1, Employee e2) {
		return e1.age - e2.age;
	}
}

class CityComp implements Comparator<Employee> {
	
	public int compare(Employee e1, Employee e2) {
		return e1.city.compareTo(e2.city);
	}
}

class AllComp implements Comparator<Employee> {
	
	
	private List<Comparator<Employee>> listComparators;
	
	AllComp(Comparator<Employee>... compList) {
		this.listComparators = Arrays.asList(compList);
	}
	
	public int compare(Employee emp1, Employee emp2) {
        for (Comparator<Employee> comparator : listComparators) {
            int result = comparator.compare(emp1, emp2);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }
	
/*	public int compare(Employee e1, Employee e2) {
		int citydiff = e1.city.compareTo(e2.city);
		int agediff = e1.age - e2.age;
		if(agediff == 0) {
			
			if(citydiff == 0 ) {
				return e1.name.compareTo(e2.name);
			} else {
				return citydiff;
			}
		} else {
			return agediff;
		}
			
	}*/
}