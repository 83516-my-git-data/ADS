package com.sunbeam;

import java.util.Scanner;

//6. Implement linear search algorithm to find the nth occurence of the given element. If nth occurrence is
//not found, return -1.
public class Question6 {
	
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
		// TODO Auto-generated method stub

		int arr[]= {10,20,30,20,40,50,20,20,20,10,50};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter key to find its last index : ");
		int key = sc.nextInt();
		
		int res = linearSearch(arr, arr.length, key);
		
		if(res != -1)
			System.out.println("last occurrence is at index : "+ res);
		else
			System.out.println("key not found");
		
		sc.close();
	}

}
