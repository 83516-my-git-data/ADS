package com.sunbeam;
import java.util.Objects;
import java.util.*;
public class q3 
{
		private int id;
		private String name;
		private int salary;
	   
		public q3(int id, String name, int salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "q3 [id=" + id + ", name=" + name + ", slary=" + salary + "]";
		}

		

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			   q3[] emp = {
			            new q3(1, "John", 500),
			            new q3(2, "Safeen", 60000),
			            new q3(3, "vedant", 55000),
			            new q3(4, "altaf", 52000),
			            new q3(5, "rohit", 22000)
			        };
		
			   for(int i = 1; i<emp.length; i++) {
				   int j = i;
				   while(j > 0 && emp[j].salary  < emp[j-1].salary ) {
					   int tmp = emp[j].salary;
					   emp[j].salary = emp[j-1].salary;
					   emp[j-1].salary = tmp;
					   j--;
				   }
			   }
			    for(int i = 0; i<emp.length; i++) {
			    	System.out.println(emp[i]);
			    }
			
			   
			   
		}

		

	}


