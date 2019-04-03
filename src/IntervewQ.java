import java.util.Scanner;

public class IntervewQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a prog to swap 2 #s without tempt var// swap 2 string without a temp
		// var
		int a = 10;
		int b = 20;

		a = a + b; // adding 2 #s =30
		b = a - b;// 30-20=20
		a = a - b;// 30-10=20
		System.out.println("the value of a = " + a + " value of b = " + b);

		String str1 = "Hello";
		String str2 = "World";
		str1 = str1 + str2;// Hello World
		str2 = str1.substring(0, str1.length() - str2.length());// Hello
		str1 = str1.substring(str2.length());
		System.out.println("" + str1 + " " + str2);

		// find the largest, 2 large, smallest

		int arr[] = { 1000, 46, 1, 86, 292, 2 };
		int min = arr[0];// 0

		int secondLargest = 0;// 0

		int largest = 0;// 0

		for (int c : arr) {
			if (a > largest) {
				largest = c;
			}
			if (c < min) {
				min = c;
			}
		}
		for (int c : arr) {

			if (c > secondLargest && c < largest) {

				secondLargest = c;
			}
		}

		System.out.println("min =" + min);
		System.out.println("Second Largest = " + secondLargest);
		System.out.println("Largest = " + largest);
	

	// reverse string word by word

	String sentence = "The master is speaking ";
	String reverse2="";

	for(int i = sentence.length() - 1;i>=0;i--){
		reverse2 = reverse2 + sentence.charAt(i);}
	
	String[] words = reverse2.split(" ");

	for(int l = words.length- 1;l>=0;l--){
	System.out.print(words[l] + " ");

		// prime or not

		int count = 0;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter number to check if it's prime?");

		int n = in.nextInt();

		for (int i = 2; i < n; i++) {

			if (n % i == 0) {

				count++;}}
		if (count == 0) {

			System.out.println("Number is prime.");

		} else {

			System.out.println("Number is not prime.");
			int number;

			Scanner input = new Scanner(System.in);

			System.out.println("Please enter a number to check if it is prime");
			//prime or not

			number = input.nextInt();

			boolean prime = true;

			for (int i = 2; i < number; i++) {

				if (number % i != 0) {
                  }else {
                  prime = false;
                  break;}}
            System.out.println(prime);

		}

	}	
		}}


