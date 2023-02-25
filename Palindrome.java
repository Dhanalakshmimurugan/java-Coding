package javacode;

public class Palindrome {
 public static void main(String[] args) {
	 String name="madam";
	 char[] str=name.toCharArray();
	 String b="";
	 for(int i= str.length-1;i>=0;i--) {
		 b=b+str[i];
		 System.out.println(b);
		 
	 }
		 if(name.equals(b)) {
			 System.out.println("THE GIVEN STRING IS PALINDROME");
		 }
		 else {
			 System.out.println("THE GIVEN STRING IS NOT A PALINDROME");
		 }
		 
	 }
}

