package com.ust.gitrepo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ProgramList {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the limit");
			int n =sc.nextInt();
			
			ArrayList<Integer> numbers = new ArrayList<>();
			int sum =0;
			addnumberstolist(sc, n, numbers);
			
			sum = sumofEvennum(numbers, sum);
			
			
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
			
			
		IntStream.rangeClosed(2, n)
		.filter(ProgramList::isPrime)
		.forEach(System.out::println);

		}
			
		
		
		
	
	}
	private static int sumofEvennum(ArrayList<Integer> numbers, int sum) {
		for(int num : numbers)
		{
			if(num % 2==0)
			{
				sum +=num;
			}
		}
		System.out.println("Sum : "+sum);
		return sum;
	}
	private static void addnumberstolist(Scanner sc, int n, ArrayList<Integer> numbers) {
		for(int i =0; i<n;i++) {
			numbers.add(sc.nextInt());
		}
	}
	   public static boolean isPrime(int number) {
	        for (int i = 2; i <= number / 2; i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	
	public static long factorialStreams(long n) {

		  return LongStream.rangeClosed(1, n)
		      .reduce(1, (long a, long b) -> a * b);
		}
}
