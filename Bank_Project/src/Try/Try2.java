package Try;

import java.util.Scanner;

public class Try2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter your age: ");
			int age = sc.nextInt();
			if (age >= 18 && age <= 100) {
				System.out.println("Vaild");
				System.exit(0);
			} else {
				System.out.println("Enter Valid Age \nYou should atlest be above 18 ");

			}
		}
	}

}
