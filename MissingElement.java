package javacode;

import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args) {
		//declare the array
		int[] num={2,5,6,8,9,1,3,4};
		//sort the array
		Arrays.sort(num);
		//intialzing a random variable
		int j=0;
		//iterate the for loop 
		for(int i=0;i<num.length;i++) {
			//increment the j value 
			j=i+1;
		//i not equal to print the j and breaks the loop
			if(num[i]!=j) {
				System.out.println(j);
				break;  
			}
		
		}
	}

}
