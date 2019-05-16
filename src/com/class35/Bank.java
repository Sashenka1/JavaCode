package com.class35;

public class Bank {
	int balance;
	int withdrowAmount;
	
	public static void main(String[] args) {
	UserMoney(100, 200);}

	public static void UserMoney( int balance, int withdrowAmount) {
		if( balance <=withdrowAmount) {
			System.out.println("You have enough monye");
		}else {
			throw new ArithmeticException(" you dont have enout money");
			
		}
		

	}

}
