package primeoperations;

import java.util.Scanner;

public class PrimeInrange {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number1 : ");
		int n1 = sc.nextInt(); // number= n
		System.out.println("enter number2 ");
		int n2 = sc.nextInt();
		sc.close();
		if (n1 > n2) {
			System.out.println("sorry, the invalid limit");
		} else {
			String result = "";

			for (int i = n1; i <= n2; i++) {
				if (primecheck(i)) { 
					result = result + " " + i;
				}
			}

			if (result.isEmpty()) {
				System.out.println("No prime numers between given range ");
			} else {
				System.out.println("Prime numbers " + result);
			}

		}

	}

	public static boolean primecheck(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {

			return true;
		}
		return false;

	}

}
