package com.sunbeam;

import java.util.Scanner;

//5. Implement binary search algorithm if array is sorted in descending order
public class Question5 {

	public static int binarySearch(int arr[], int key) {
		int left = 0;
		int right = arr.length - 1;
		int mid;
		
		while(left <= right) {
			mid = (left + right)/2;
			
			if(key == arr[mid])
				return mid;
			//else if(key > arr[mid]) // ascending sort condition
			else if(key < arr[mid]) // descending sort condition
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int arr[] = {10,20,30,40,50,60}; // ascending order
		int arr[] = {99,88,77,55,44,22,11,9,8}; // descending order
		
		System.out.print("Enter Key to find index : ");
		int key = sc.nextInt();
		
		int index = binarySearch(arr, key);
		if(index != -1)
			System.out.println("Element Found at index : "+index);
		else
			System.out.println("Element not Found...");
		
		sc.close();
	}
	
}
