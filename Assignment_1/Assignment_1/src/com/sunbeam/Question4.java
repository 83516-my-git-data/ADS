package com.sunbeam;

import java.util.Scanner;

//4. Create array of employees and search employee by i. empid ii. name iii. salary

class Employee{
	public int empid;
	public String name;
	public double salary;
	
	
	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
		
}

public class Question4 {
	
	public static int sortByEmpId(Employee arr[], int N, int id) {
		
		for(int i=0; i<N; i++)
		{
			if(id == arr[i].empid)
			{
				return i;
			}
		}
		return -1;
	}
	
	
	public static int sortByEmpName(Employee arr[], int N, String name) {
	
		for(int i=0; i<N; i++)
		{
			if(arr[i].name.equals(name))
			{
				return i;
			}
		}
		return -1;
	}
	
	
	public static int sortByEmpSalary(Employee arr[], int N, double salary) {
		
		for(int i=0; i<N; i++)
		{
			if(salary == arr[i].salary)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee arr[] = new Employee[5];
		
		arr[0] = new Employee(1,"Hemant",6500);
		arr[1] = new Employee(2,"Shree", 7000);
		arr[2] = new Employee(3,"Vinay", 8000);
		arr[3] = new Employee(4,"Abhay", 9000);
		arr[4] = new Employee(5,"Shantanu",1000);
	
		System.out.print("Enter Empid to find Index : ");
		int key1 = sc.nextInt();
		int index1 = sortByEmpId(arr, arr.length, key1);
		if(index1 != -1)
			System.out.println("Employee index no : " + index1);
		else
			System.out.println("Employee not exist...");
		
		System.out.print("Enter EmpName to find Index : ");
		String key2 = sc.next();
		int index2 = sortByEmpName(arr, arr.length, key2);
		if(index2 != -1)
			System.out.println("Employee index no : " + index2);
		else
			System.out.println("Employee not exist...");
		
		System.out.print("Enter EmpSalary to find Index : ");
		double key3 = sc.nextDouble();
		int index3 = sortByEmpSalary(arr, arr.length, key3);
		if(index3 != -1)
			System.out.println("Employee index no : " + index3);
		else
			System.out.println("Employee not exist...");
		
		sc.close();
	}

}
