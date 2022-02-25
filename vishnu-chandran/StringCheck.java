package stringoperation;

import java.util.Scanner;

public class StringCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first string value:");
		String s1 = sc.nextLine();
		String strArray1[] = s1.split(" ");
		
		System.out.println("Enter the second String");
		String s2 = sc.nextLine();
		sc.close();
		String strArray2[] = s2.split(" ");


		if (strArray1[strArray1.length - 1].isEmpty()) {
			System.out.println("Missing first string value");
		} else if (strArray2[strArray2.length - 1].isEmpty()) {
			System.out.println("Missing Second string value");

		} else if (strArray1[strArray1.length - 1].equals(strArray2[strArray2.length - 1])) {
			System.out.println("The enterd sentence ends with same word. : " + strArray1[strArray1.length - 1]);

		}

		else {
			System.out.println("The entered strings are not matching.");
		}

	}

}
