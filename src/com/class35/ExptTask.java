package com.class35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExptTask {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("input");
		try {
			int age=input.nextInt();
			System.out.println("your name is"+age);
		}catch (InputMismatchException e)  {
			System.out.println(" your input the int");
			
		}

	}

}
