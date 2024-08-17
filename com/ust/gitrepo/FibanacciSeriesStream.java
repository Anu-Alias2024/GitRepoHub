package com.ust.gitrepo;

import java.util.Scanner;
import java.util.stream.Stream;

public class FibanacciSeriesStream {
	
	 public static void main(String[] args) {
	        // Generate Fibonacci series using Java 8 streams
		 try(Scanner sc = new Scanner(System.in)){
		 System.out.println("Enter the limit");
		 int n = sc.nextInt();
	        Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
	              .limit(n) // Limit the number of elements in the stream
	              .mapToInt(fib -> fib[0]) // Extract the first element (fibonacci number)
	              .forEach(System.out::println); // Print each Fibonacci number
	    }
	 }
}
