//proverqva dali daden niz e palindrom
//����: ����� 
//�����: ��.
//����: �������� 
//�����: ��.
package stringoveMetodi;

import java.util.Scanner;

public class o4HwStringMethodsZad8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("prigotvi si da vuvede6 dumata:  ");
		String word = stringDeclarationOneWordOnly();
		char[] workArr = new char[word.length()];
		for (int i = 0; i < word.length(); i++) {
			workArr[i] = word.charAt(i);
		}
		boolean palindrom = true;
		for (int i = 0; i < workArr.length; i++) {
			if (workArr[i] != workArr[workArr.length - (i+1)]) {
				palindrom = false;
				break;
			}
		}
		System.out.println((palindrom? "niza e palindrom " : "niza ne e palindrom"));
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