package Try;

import java.util.Scanner;

public class LoopMobileNumber {

	static Scanner sc = new Scanner(System.in);

	static void mobileNo() {
		while (true) {
			System.out.println("Enter Mobile number: ");
			long no = sc.nextLong();
			if (no <= 9999999999l) {
				System.out.println("valid number ");

			} else {
				System.out.println("Invaild number");
			}

		}
	}

//	static boolean checkMobileNo(String no) {
//		if (no.length() != 10) {
//			System.out.println(" INVALID MOBILE NUMBER\n NUMBER SHOULD BE 10 DIGITS");
//			System.exit(0);
//			return false;
//		}
//		for (int i = 0; i < no.length(); i++) {
//			int c = (int) no.charAt(i);
//			if ((c >= 48) && (c <= 57)) {
//			} else {
//				System.out.println(" INVALID MOBILE NUMBER\n NUMBER SHOULD NOT CONTAINT ALPHABETS OR SPECIAL SYMBOLS");
//				System.exit(0);
//				return false;
//			}
//		}
//
//		return true;
//	}

	public static void main(String[] args) {
		mobileNo();
	}

}
