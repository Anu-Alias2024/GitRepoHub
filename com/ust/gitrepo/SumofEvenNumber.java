package com.ust.gitrepo;

import java.util.ArrayList;
import java.util.Scanner;

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
			System.out.print("Sum : "+sum);
		}
	}

}
