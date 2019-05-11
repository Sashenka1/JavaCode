package com.class35;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  List<Exception> exceptionList=getList();
  System.out.println(exceptionList.size());
  for(Exception sE: exceptionList) {
	  System.out.println(sE.getMessage());
  }
	}
	public static List<Exception> getList(){
		List<Exception> list=new ArrayList<>();
		try {
		System.out.println(10/0);
		}catch(ArithmeticException e) {
			list.add(e);
		}
		//2 try catch for ArrayIndexOutOfBounds Excptn
		int[] array= {12,13};
		try {
			System.out.println(array[2]);
			
		}catch(ArrayIndexOutOfBoundsException lol) {
			list.add(lol);}
		Scanner scan=new Scanner(System.in);
		System.out.println("pls enter number");
		
		//try {
			//int num=scan.nextInt();
		//}catch()
			
		}
		return list;
		}


