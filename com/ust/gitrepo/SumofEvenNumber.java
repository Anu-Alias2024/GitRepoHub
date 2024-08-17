package com.ust.gitrepo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.LongStream;

public class SumofEvenNumber {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the limit");
			int n =sc.nextInt();
			
			ArrayList<Integer> numbers = new ArrayList<>();
			int sum =0;
			for(int i =0; i<n;i++) {
				numbers.add(sc.nextInt());
			}
			
			for(int num : numbers)
			{
				if(num % 2==0)
				{
					sum +=num;
				}
			}
			System.out.println("Sum : "+sum);
			
			
			for (int i = 1; i <= n; i++) { 
	            sum += i; 
	        } 
	        
	        System.out.println("Sum of first " + n 
	                           + " Natural Number = " + sum); 
	        
	        int sumodd=0;
	        
	    	for(int num : numbers)
			{
				if(num % 2==1)
				{
					sumodd +=num;
				}
			}
			System.out.println("Sum of odd numbers: "+sumodd);
			
			System.out.println ("The factorial of "+n+ " is : " + factorialStreams(n));
		}
		
		
	
	}
	public static long factorialStreams(long n) {

		  return LongStream.rangeClosed(1, n)
		      .reduce(1, (long a, long b) -> a * b);
		}
}
