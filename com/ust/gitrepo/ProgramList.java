package com.ust.gitrepo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ProgramList {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// Refactor size of list
			int n = getSizeofthelist(sc);

			ArrayList<Integer> numbers = new ArrayList<>();
			int sum = 0;
			// Refactor add numbers to list
			addnumberstolist(sc, n, numbers);
			// Refactor sum of even numbers
			sum = sumofEvennum(numbers, sum);
			// Refactor o sum n natural numbers

			sumOfNaturalNumbers(n, sum);
			// Refactor sum of odd numbers
			sumofOddnumbers(numbers);
			// Refactor factorial
			getFactorial(n);

		}

	}

	private static void getFactorial(int n) {
		System.out.println("The factorial of " + n + " is : " + factorialStreams(n));

		IntStream.rangeClosed(2, n).filter(ProgramList::isPrime).forEach(System.out::println);
	}

	private static void sumofOddNumbers(ArrayList<Integer> numbers) {
		int sumodd = 0;

		for (int num : numbers) {
			if (num % 2 == 1) {
				sumodd += num;
			}
		}
		System.out.println("Sum of odd numbers: " + sumodd);
	}

	private static void sumofOddnumbers(ArrayList<Integer> numbers) {
		sumofOddNumbers(numbers);
	}

	private static int getSizeofthelist(Scanner sc) {
		System.out.println("enter the limit");
		int n = sc.nextInt();
		return n;
	}

	private static void sumOfNaturalNumbers(int n, int sum) {
		for (int i = 1; i <= n; i++) {
			sum += i;
		}

		System.out.println("Sum of first " + n + " Natural Number = " + sum);
	}

	private static int sumofEvennum(ArrayList<Integer> numbers, int sum) {
		for (int num : numbers) {
			if (num % 2 == 0) {
				sum += num;
			}
		}
		System.out.println("Sum : " + sum);
		return sum;
	}

	private static void addnumberstolist(Scanner sc, int n, ArrayList<Integer> numbers) {
		for (int i = 0; i < n; i++) {
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

		return LongStream.rangeClosed(1, n).reduce(1, (long a, long b) -> a * b);
	}
}
