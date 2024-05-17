package com.sunbeam;

import java.util.Scanner;

//3. Write a program to print no of comparisions done to search a key in i. linear search ii. binary serach
public class Question3 {
	
	public static int linearSearch(int arr[], int N, int key) {
		
		int compa = 0;
		
		for(int i = 0; i < N; i++) {
			compa ++;
			if(key == arr[i]) {
				System.out.println("No. of Comparision in LinearSearch : "+compa);
				return i;
			}
		}
		return -1;
	}

	public static int binarySearch(int arr[], int N, int key) {
		int compa = 0;
		int left=0,right=N-1,mid;
		
		while(left <= right) {
			compa++;
			
			mid = (left + right)/2;
			
			if(key == arr[mid]) {
				System.out.println("No. of Comparision in BinarySearch : "+compa);
				return mid;
			}
			
			else if(key < arr[mid]){
				right = mid - 1;
			}
			else
			{
				left = mid + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {10,20,30,40,50};
		System.out.print("Enter key : ");
		int key = sc.nextInt();
		
		int res1 = linearSearch(arr, arr.length, key);
		if(res1 == -1)
			System.out.println("key not found...");
		else
			System.out.println("key found at index : "+res1);
		
		int res2 = binarySearch(arr, arr.length, key);
		if(res2 == -1)
			System.out.println("key not found...");
		else
			System.out.println("key found at index : "+res2);
		
		sc.close();
		
	}

}
