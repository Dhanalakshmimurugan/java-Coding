package javacode;

public class PrintTheDuplicate {
	public static void main(String[] args) {
		//Declare the array
		int[] number={11,22,33,44,55,66,22,77,11};
		//iterate for loop 
        for(int i=0;i<number.length;i++) {
        	//iterate for loop as j and see whether i gets equal to j 
        	for(int j=i+1;j<number.length;j++) {//
                 // if i gets equal to j then print the i 
        		if(number[i]==number[j]) {
        			System.out.println(number[i]);
        		}
        	}
        }
	}

}
