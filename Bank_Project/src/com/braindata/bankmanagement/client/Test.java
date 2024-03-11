package com.braindata.bankmanagement.client;

import java.util.Scanner;

import com.braindata.bankmanagement.service.Rbi;
import com.braindata.bankmanagement.serviceImpl.Sbi;

public class Test {

	public static void main(String[] args) {
		Rbi bank = new Sbi();
		Scanner sc = new Scanner(System.in);
		boolean accountCreated = false;
		while (true) {
			System.out.println("\nSelect the below options to bank operation: ");

			System.out.println(
					"1) Create Account \n2) Display Account Details \n3) Deposit_Money \n4) Withdraw_Money \n5) Check_Balance \n6) Exits");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				bank.createAccount();
				accountCreated = true;
				break;
			case 2:
				if (accountCreated) {
					bank.displayAllDetails();
				} else {
					System.out.println("You have to Create Account first");
				}
				break;
			case 3:
				if (accountCreated) {
					bank.depositeMoney();
				} else {
					System.out.println("You have to Create Account first");

				}
				break;
			case 4:
				if (accountCreated) {
					bank.withdrawal();
				} else {
					System.out.println("You have to Create Account first");

				}
				break;
			case 5:
				if (accountCreated) {
					bank.balanceCheck();
				} else {
					System.out.println("You have to Create Account first");

				}
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Invaild Choice");

			}

		}
	}

}
