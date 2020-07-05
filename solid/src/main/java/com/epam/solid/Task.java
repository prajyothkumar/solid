package com.epam.solid;

import java.util.Scanner;
public class Task {
	public static void main(String[] args) {
	     Calculator cal = new Calculator();
	     try (Scanner sc = new Scanner(System.in)) {
			System.out.println("\n1. Addition");
	        System.out.println("2. Subtraction");
	        System.out.println("3. Multiplication");
	        System.out.println("4. Division");
	        System.out.print("\nWhat would u like to choose? : ");
	        int choice = sc.nextInt();
	        if (choice == 1){
	            cal.add();
	        }
	        else if (choice == 2){
	            cal.sub();
	        }
	        else if (choice == 3){
	            cal.mul();
	        }
	        else if (choice == 4){
	            cal.div();
	        }
		}
}
}
