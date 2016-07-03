//Напишете програма, която брои колко пъти се среща всяка 
//английска буква в даден символен низ. Запазете резултатите в 
//масив.
//kolko puti se sre6ta vsqka angliiska bukva

package stringoveMetodi;

import java.util.Scanner;

public class uprajneniqTask4VtoriNachin {
	public static void main(String[] args) {
		String str1;// a==97
		str1 = stringDeclaration();
		int[] azbuka = new int[26];
		int otherSymbols = 0;
		str1 = str1.toLowerCase();
		char s;
		for (int i = 0; i < str1.length(); i++) {
			s = str1.charAt(i);
			if ((int) (s - 97) < 26 && (int) (s - 97) > -1) {
				azbuka[(int) (s - 97)]++;
			} else {
				otherSymbols++;
			}

		}
		for (int i = 0; i < azbuka.length; i++) {
			if (azbuka[i] != 0) {
				System.out.println("bukvata " + (char) (97 + i) + " se sre6ta " + azbuka[i] + " puti");
			} else {
				continue;
			}
		}
		System.out.println("drugi simvoli ima " + otherSymbols);

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
