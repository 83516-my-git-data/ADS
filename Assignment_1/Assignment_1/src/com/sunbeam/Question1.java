package com.sunbeam;
import java.util.Stack;
public class q1 
{
	// 1st Way using TWO Pointer Technique -:
//	public class PalindromeCheck 
// Time complexity -: O(n) , Space Complexity -: O(1)
//	    public static boolean isPalindrome(String s)
//	    {
//	        int left = 0;
//	        int right = s.length() - 1;
//
//	        while (left < right) {
//	            if (s.charAt(left) != s.charAt(right)) {
//	                return false;
//	            }
//	            left++;
//	            right--;
//	        }
//	        return true;
//	    }
//
//	    public static void main(String[] args)
//	    {
//	        System.out.println(isPalindrome("racecar")); // true
//	        System.out.println(isPalindrome("hello")); // false
//	    }
	
	
	//Reverse And Compare -:
	// Time complexity -: O(n) , Space Complexity -: O(n)
//	    public static boolean isPalindrome(String s)
//	    {
//	        String reversed = new StringBuilder(s).reverse().toString();
//	        return s.equals(reversed);
//	    }
//
//	    public static void main(String[] args) 
//	    {
//	        System.out.println(isPalindrome("racecar")); // true
//	        System.out.println(isPalindrome("hello")); // false
//	    }
//}

	
	//Using A Stack -:
	//Time complexity -: O(n) , Space Complexity -: O(n)
	
	

	    public static boolean isPalindrome(String s) {
	        Stack<Character> stack = new Stack<>();
	        int length = s.length();

	        for (int i = 0; i < length / 2; i++) {
	            stack.push(s.charAt(i));
	        }

	        for (int i = (length + 1) / 2; i < length; i++) {
	            if (stack.pop() != s.charAt(i)) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        System.out.println(isPalindrome("racecar")); // true
	        System.out.println(isPalindrome("hello")); // false
	    }
	}

