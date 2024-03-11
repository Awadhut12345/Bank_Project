package Try;

import java.util.Scanner;

public class Name2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        boolean abc = false;
        name = name.toLowerCase();
        for (int i = 0; i < name.length(); i++) {
            int c = (int) name.charAt(i);
            if (((int) name.charAt(i) >= 97 && (int) name.charAt(i) <= 122) || ((int) name.charAt(i) == 32)) {
                // If it is a lowercase letter or a space, set abc to true
                abc = true;
            } else {
                System.out.println("  NAME SHOULD NOT CONTAIN NUMBERS OR SPECIAL SYMBOLS");
                System.out.println(" Enter Your Name in Format :-\n    Your Name FatherName SureNamae ");
                System.exit(0);
            }
        }

        if (abc) {
            System.out.println("\nVALID NAME ");
        } else {
            System.out.println("\nINVALID NAME\nNAME SHOULD CONTAIN AT LEAST ONE LETTER");
        }

    }
}
