//2 niza.pod 40 simvola .Rezultata e i 2ta niza izpisano samo s malki i samo s glavni bukfi
package stringoveMetodi;

import java.util.Scanner;

public class o4HwStringMethodsZad1 {
	public static void main(String[] args) {
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("enter string1:");
			s1 = sc.nextLine();
		} while (s1.length() > 40);
		do {
			System.out.println("enter string2:");
			s2 = sc.nextLine();
		} while (s2.length() > 40);
		sc.close();
		System.out.println(
				s1.toLowerCase() + " \n" + s1.toUpperCase() + " \n" + s2.toLowerCase() + " \n" + s2.toUpperCase());
	}
}
