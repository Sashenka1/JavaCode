import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String original, reverse = ""; // Palindrome or not
	      Scanner in = new Scanner(System.in);
	     
	      System.out.println("Enter a string to check if it is a palindrome");
	      original = in.nextLine();
	     
	      int length = original.length();
	     
	      for (int i = length - 1; i >= 0; i--) 
	         reverse = reverse + original.charAt(i);
	         
	      if (original.equals(reverse)) 
	         System.out.println("The string is a palindrome.");
	      else
	         System.out.println("The string isn't a palindrome.");
	         
	  
//prime or not//prime # devided by itself and 1
  int num = 22;
  boolean flag = false;
  for(int i = 2; i <= num/2; ++i){
   if(num % i == 0){
    flag = true;
        break;}}
   if (!flag)
    System.out.println(num + " is a prime number.");
   else
    System.out.println(num + " is not a prime number.");
   
//Fibonacci series. first 10 #s.
   int n=10;//a=0;
   int n1=0;//b=1;
   int n2=1;//c=0;
   int n3;
   for ( int i=0; i<n; i++) {//(int i<10, i++)
	   System.out.print(n1+" ");// c=a+b,a=b,b=c,
	   n3=n1+n2;                //syso(a+"");
	   n1=n2;
	   n2=n3;}}
   ///Fibonacci
     String move="We are moving";
     re		int number;

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a number to check if it is prime");

		number = input.nextInt();

		boolean prime = true;

		for (int i = 2; i < number; i++) {

			if (number % i != 0) {



			}else {

				prime = false;

				break;

			}

		}

		System.out.println(prime);}}

	


     



	

	
	    
	
		
		


