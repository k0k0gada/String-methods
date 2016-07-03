//programa koqto konkatenira 2 niza v edin 
//Напишете програма, която конкатенира елементите на масив от 
//символни низове в един символен низ.
package stringoveMetodi;

import java.util.Scanner;

public class uprajneniqTask6 {
	public static void main(String[] args) {
		String str2, str1;
		System.out.println("niz1:");
		str1 = stringDeclaration();
		System.out.println("niz2:");
		str2 = stringDeclaration();
		String str3 = str1 + str2;
		System.out.println(str3);
	}

	static int[] letterCount(String str) {
		int[] azbuka = new int[26];
		char s;
		for (int i = 0; i < str.length(); i++) {
			s = str.charAt(i);
			if ((int) (s - 97) < 26 && (int) (s - 97) > -1) {
				azbuka[(int) (s - 97)]++;
			}
		}

		return azbuka;
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

	static String OneWordStringDeclaration() {
		String s;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("enter your String:");
			s = sc.next();
		} while (s == null);
		return s;
	}
}
