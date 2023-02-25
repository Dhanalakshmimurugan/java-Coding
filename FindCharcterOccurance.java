package javacode;

public class FindCharcterOccurance {


	public static void main(String[] args) {
		//declaring the string 
		String word ="TestLeaf";
		//Initialize a random variable to count the occurances of the letter 
		int b=0;
		//convert the string into character Array
		char[]a=word.toCharArray();
		//iterate the for to find e 
		for(int i =0;i<a.length;i++) {
			//in if condition give while iterating when e gets find incerment the b value 
			if(a[i]=='e') {
				b++;
				
			}
			}
		//giving print statement outside the  for loop to print once when it completes the iteration 
		System.out.println("e occurance is :"+b);
	}

}
