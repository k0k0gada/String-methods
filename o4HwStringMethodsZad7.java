//programa koqto broi dumi.izkarva kolko e dulga nai-dulgata duma
//Пример: asd fg hjkl
//Изход: 3 думи, най-дългата е с 4 символа.
package stringoveMetodi;

import java.util.Scanner;

public class o4HwStringMethodsZad7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentance;
		System.out.println("prigotvi si da vuvede6 izre4enieto:  ");
		sentance = stringDeclaration();
		char[] workArr = new char[sentance.length()];
		for (int i = 0; i < sentance.length(); i++) {
			workArr[i] = sentance.charAt(i);
		}
		int wordCount = 1, letterMaxCount = 0, letterCount = 1;
		if (workArr[1] == ' ') {
			wordCount--;
		}
		for (int i = 1; i < workArr.length; i++) {
			if (workArr[i] != ' ' && workArr[i - 1] == ' ') {
				wordCount++;
			}
			if (workArr[i] == ' ') {
				if (letterCount > letterMaxCount) {
					letterMaxCount = letterCount;
				}
				letterCount=-1;
			}
			letterCount++;
		}
		sc.close();
		System.out.println("ima " + wordCount + " dumi\nnai-dulgata duma ima "
				+ (letterMaxCount > letterCount ? letterMaxCount : letterCount) + " bukfi");
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