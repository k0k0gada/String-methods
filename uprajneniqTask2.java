//Напишете програма, която отпечатва на екрана инициалите на 
//името ви. Въведете името си от клавиатурата.
//programa otpe4atva6ta purvite bukvi na dumi

package stringoveMetodi;

import java.util.Scanner;

public class uprajneniqTask2 {
	public static void main(String[] args) {
		String str1;
		System.out.println("prepare to enter your name: ");
		str1 = stringDeclaration();
		char bukva;
		System.out.println("inicialite:  ");
		for (int i = 0; i < str1.length(); i++) {
			if (i == 0) {
				if (str1.charAt(i) == ' ') {
					continue;
				} else {
					bukva = str1.charAt(i);
					bukva = Character.toUpperCase(bukva);
					System.out.print(bukva + ". ");
				}
			} else {
				if (str1.charAt(i) != ' ' && str1.charAt(i - 1) == ' ') {
					bukva = str1.charAt(i);
					bukva = Character.toUpperCase(bukva);
					System.out.print(bukva + ". ");
				}
			}
		}
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
