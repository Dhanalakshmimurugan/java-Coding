package javacode;

import java.util.Scanner;

public class ReverseAString {
	public static void main(String[] args) {
		//Declaring scanner scan and gets input from user 
		Scanner scan =new Scanner(System.in);
		//print statement
		System.out.println("ENTER YOUR NAME");
		//save the given string input in "name" variable 
		String name=scan.nextLine();
		//Printing the given statement 
		System.out.println(name);
		//convert the string into character array 
		char[] a=name.toCharArray();
		//print statement
		System.out.println("THE REVERSE STRING IS ");
		//printing the array from reverse using reverse for loop
		for(int i =a.length-1;i>=0;i--) {
			//printing the array in reverse
			System.out.print(a[i]);
		}
	}

}
