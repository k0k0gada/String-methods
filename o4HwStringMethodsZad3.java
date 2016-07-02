//2 redici ot simvoli ot klav.bez  intervali.Programata da izvejda 
//rezultata ot sravnenieto im po pozicii
//Пример: хипопотам, хипопотук
//Двата низа са с равна дължина.
//Разлика по позиции:
//8 а-у
//9 м-к
package stringoveMetodi;

import java.util.Scanner;

public class o4HwStringMethodsZad3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = OneWordStringDeclaration(), s2 = OneWordStringDeclaration();
		if (s1.length() == s2.length()) {
			System.out.println("dvata niza s ednakva duljina \n Razliki po pozicii");
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					System.out.println((i + 1) + " " + s1.charAt(i) + "  / " + s2.charAt(i));
				}
			}
		} else {
			System.out.println("stringovete sa s razli4na duljina");
		}
		sc.close();
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
