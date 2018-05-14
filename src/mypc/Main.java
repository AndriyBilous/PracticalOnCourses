package mypc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the year you need info about");
		int year = sc.nextInt();

		if (year % 4 == 0 & year % 100 != 0 ^ year % 400 == 0) {
			System.out.println("The year is high");
		} else {
			System.out.println("The year is low");

		}

	}

}
