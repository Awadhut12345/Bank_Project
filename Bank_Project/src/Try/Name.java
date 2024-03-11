package Try;

import java.util.Scanner;

public class Name {

	static boolean checkMobileNo(String no) {
		if (no.length() != 10) {
			System.out.println(" INVALID MOBILE NUMBER\n NUMBER SHOULD BE 10 DIGITS");
			System.exit(0);
			return false;
		}
		for (int i = 0; i < no.length(); i++) {
			int c = (int) no.charAt(i);
			if ((c >= 48) && (c <= 57)) {
			} else {
				System.out.println(" INVALID MOBILE NUMBER\n NUMBER SHOULD NOT CONTAINT ALPHABETS OR SPECIAL SYMBOLS");
				System.exit(0);
				return false;
			}
		}

		return true;
	}
	
	
	
	
	static boolean checkName(String name) {
		name = name.toLowerCase();
		for (int i = 0; i < name.length(); i++) {
			if (((int) name.charAt(i) >= 97 && (int) name.charAt(i) <= 122 ) || ((int) name.charAt(i) == 32)) {
			
			} else {
				System.out.println("  NAME SHOULD NOT CONTAINT NUMBERS OR SPECIAL SYMBOLS");
				System.out.println(" Enter Your Name in Format :- Name FatherName SureNmae ");
				System.exit(0);
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("  Welcome!! \nEnter following details to create account : ");
		System.out.println("Enter your full Name: ");
		String accName = sc.nextLine();
		if (checkName(accName)) {
			System.out.println("Add name");
		}
		System.out.println("Enter Mobile Number: ");
		String mobileNo = sc.next();
		if (checkMobileNo(mobileNo)) {
			System.out.println("add mobile number ");
		}
	}

}
