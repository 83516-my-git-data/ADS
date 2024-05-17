package com.sunbeam;
import java.util.Arrays;
public class q2
{
	     public static void insertionsort(int arr[])
	    {
	        int count=0;
	        for(int i=arr.length-2;i>0;i--)
	        {
	            int temp=arr[i];
	            int j=i+1;

	            while(j<=arr.length-1 && arr[j]>temp)
	            {
	                arr[j-1]=arr[j];
	                j++;
	                count++;
	            }
	            arr[j-1]=temp;
	        }
	        System.out.println("Total no of Comparisons -: "+count);
	    }
	    public static void main(String[] args) 
	    {
	        int arr[]={55,44,11,33,22};
	        
	        System.out.println("Arrays Before of sort - "+Arrays.toString(arr));
	        insertionsort(arr);
	        System.out.println("Arrays Before of sort - "+Arrays.toString(arr));
	        
	        
	    }
	}
