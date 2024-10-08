package com.sunbeam;

import java.util.Scanner;

//2. Write a linear search algorithm to return index of last occurance of key.
public class Question2 {
	
	public static int linearSearch(int arr[], int N, int key) {
		int index = -1;
		 for (int i = 0; i < N; i++) 
		 {
			if(key==arr[i]) 
			{
				index = i;
			}
		}
		return index;
	}

	public static void main(String[] args) {


		int arr[]= {11,22,33,44,55,66,44,77,88,44};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter key to find its last index : ");
		int key = sc.nextInt();
		
		int res = linearSearch(arr, arr.length, key);
		
		if(res != -1)
			System.out.println("index : "+ res);
		else
			System.out.println("key not found");
		
		sc.close();
	}

}
