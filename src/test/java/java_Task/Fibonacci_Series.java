package java_Task;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {

		int n1 = 0, n2 = 1, n3, i, count;
		
		System.out.println("Enter the Number of Fibonacci Series:");
		Scanner sc=new Scanner(System.in);
		count = sc.nextInt();
		
		System.out.println("The Fibonacci Series are : ");
		
		System.out.print(n1 + " " + n2);
		for (i = 2; i < count; i++) {
			n3 = n1 + n2;
			System.out.print(" "+ n3);
			n1 = n2;
			n2 = n3;

		}

	}

}
