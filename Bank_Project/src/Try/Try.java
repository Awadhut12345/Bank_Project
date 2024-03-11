package Try;

public class Try {

	/*
	 * static boolean checkMobileNo(String no) { if (no.length() == 10) { for (int i
	 * = 0; i < no.length(); i++) { char c = no.charAt(i);
	 * System.out.println(c+" "+(int)c); if ((int) c <= 49 && (int) c >= 57) {
	 * return false; } } } return true; }
	 */

	static boolean checkMobileNo(String no) {
		if (no.length() != 10) {
			System.out.println(" INVALID MOBILE NUMBER \n NUMBER SHOULD BE 10 DIGITS");
			System.exit(0);
			return false;
		}
		for (int i = 0; i < no.length(); i++) {
			int c = (int) no.charAt(i);
			if ((c >= 48) && (c <= 57)) {
				System.out.println(c + " :" + (char) c);
			} else {
				System.out.println(" INVALID MOBILE \n NUMBER SHOULD NOT CONTAINT ALPHABETS OR SPECIAL SYMBOLS");
				System.exit(0);
				return false;
			}
		}

		return true;
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
				System.out.println(c + " :" + (char) c);
			} else {
				System.out.println(" INVALID AADHAR NUMBER \n NUMBER SHOULD NOT CONTAINT ALPHABETS OR SPECIAL SYMBOLS");
				System.exit(0);
				return false;
			}
		}

		return true;
	}
	
	static boolean checkName(String name) {
		name = name.toLowerCase();
		for(int i = 0; i <name.length(); i++) {
			if((int)name.charAt(i)>=97 && (int)name.charAt(i)<=122 || (int)name.charAt(i)==32 ){	
			}
			else {
				System.out.println("  NAME SHOULD NOT CONTAINT NUMBERS OR SPECIAL SYMBOLS");
				System.exit(0);
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		checkName("Yash Gillorkar");
		//System.out.println((int)' ');

	}

}
