package com.braindata.bankmanagement.serviceImpl;

import java.util.Scanner;

import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.Rbi;

public class Sbi implements Rbi {
	int accountNo = 86544333;
	Scanner sc = new Scanner(System.in);
	Account ac = new Account();

	void mobileNo() {
		while (true) {
			System.out.println("Enter Mobile number: ");
			String no = sc.next();
			if (no.length() == 10) {
				boolean isValid = true;
				for (int i = 0; i < no.length(); i++) {
					int c = (int) no.charAt(i);
					if ((c < 48) || (c > 57)) {
						isValid = false;
						System.out.println(
								"INVALID MOBILE NUMBER\nNUMBER SHOULD NOT CONTAIN ALPHABETS OR SPECIAL SYMBOLS");
						break;
					}
				}
				if (isValid) {
					ac.setMobNo(no);
					return;
				}
			} else {
				System.out.println("INVALID MOBILE NUMBER\nNUMBER SHOULD BE 10 DIGITS");
			}
		}
	}

	public void checkAge() {
		while (true) {
			System.out.println("Enter your age: ");
			int age = sc.nextInt();
			if (age >= 18 && age <= 100) {
				ac.setAge(age);
				break;
			} else {
				System.out.println("Enter Valid Age \nYou should atlest be above 18 ");

			}
		}
	}

	static boolean checkAadharNo(String no) {
		if (no.length() != 12) {
			System.out.println(" INVALID AADHAR NUMBER \n NUMBER SHOULD BE 12 DIGITS");
			System.exit(0);
			return false;
		}
		for (int i = 0; i < no.length(); i++) {
			int c = (int) no.charAt(i);
			if ((c >= 48) && (c <= 57)) {
			} else {
				System.out.println(" INVALID AADHAR NUMBER \n NUMBER SHOULD NOT CONTAINT ALPHABETS OR SPECIAL SYMBOLS");
				System.exit(0);

			}
		}

		return true;
	}

	static boolean checkName(String name) {
		name = name.toLowerCase();
		for (int i = 0; i < name.length(); i++) {
			if (((int) name.charAt(i) >= 97 && (int) name.charAt(i) <= 122) || ((int) name.charAt(i) == 32)) {

			} else {
				System.out.println("  NAME SHOULD NOT CONTAINT NUMBERS OR SPECIAL SYMBOLS");
				System.out.println(" Enter Your Name in Format :- Name FatherName SureNmae ");
				System.exit(0);
				return false;
			}
		}
		return true;
	}

	@Override
	public void createAccount() {
		System.out.println("  Welcome!! \nEnter following details to create account : ");
		System.out.println("Enter your full Name: ");
		String accName = sc.nextLine();
		if (checkName(accName)) {
			ac.setName(accName);
		}

		mobileNo();

		System.out.println("Enter Your Aadhar Number: ");
		String aadharNo = sc.next();
		if (checkAadharNo(aadharNo)) {
			ac.setAdharNo(aadharNo);
		}

		System.out.println("Select Gender form below options: ");
		System.out.println("1) Male \n2) Famale \n3) Other");
		int status = sc.nextInt();
		if (status == 1) {
			ac.setGender("Male");
		} else if (status == 2) {
			ac.setGender("Famale");
		} else {
			ac.setGender("Other");
		}

		checkAge();

		ac.setAccNo(accountNo);

		System.out.println("Add minimum balance of 1000 :  ;");
		double minBalance = sc.nextInt();
		if (minBalance < 1000) {
			System.out.println("Add minimum balance of 1000 :  ;");

		} else {
			ac.setBalance(minBalance);
		}

	}

	@Override
	public void displayAllDetails() {
		System.out.println("Name: " + ac.getName());
		System.out.println("Mobile Number: " + ac.getMobNo());
		System.out.println("Aadhar Number: " + ac.getAdharNo());
		System.out.println("Gender: " + ac.getGender());
		System.out.println("Age: " + ac.getAge());
		System.out.println("Account Number: " + ac.getAccNo());
	}

	@Override
	public void depositeMoney() {
		System.out.println("Enter how much you want to deposit: ");
		double balance = ac.getBalance();
		int depositMoney = sc.nextInt();
		if (depositMoney >= 500 && depositMoney <= 100000) {
			ac.setBalance(balance + depositMoney);
			System.out.println("Your amount has been successfully deposited");
		} else {
			System.out.println("Please deposit money within the range of 500 to 1,00,000 ");
		}

	}

	@Override
	public void withdrawal() {
		System.out.println("Enter amount to withdraw: ");
		double remove = sc.nextDouble();
		if ((ac.getBalance() - 1000) > remove) {
			ac.setBalance(ac.getBalance() - remove);

		} else {
			System.out.println("Insufficient balance");
		}

		System.out.println("Your Remaining Balance : " + ac.getBalance());

	}

	@Override
	public void balanceCheck() {
		System.out.println("Your Current balance is : " + ac.getBalance());
	}

}
