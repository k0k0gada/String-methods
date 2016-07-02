//proverqva dali daden niz e palindrom
//Вход: капак 
//Изход: да.
//Вход: тенджера 
//Изход: не.
package stringoveMetodi;

import java.util.Scanner;

public class o4HwStringMethodsZad8VtoriNachin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("prigotvi si da vuvede6 dumata:  ");
		String word = stringDeclaration();
		boolean palindrom = true;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) != word.charAt((word.length() - i) - 1)) {
				palindrom=false;
				break;
			}
		}
		System.out.println((palindrom ? "niza e palindrom " : "niza ne e palindrom"));
		sc.close();
	}

	static String stringDeclaration() {
		String s;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("enter your String now :");
			s = sc.nextLine();
		} while (s == null);
		return s;

	}

	static String stringDeclarationOneWordOnly() {
		String s;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("enter your String:");
			s = sc.next();
		} while (s == null);
		return s;
	}
}