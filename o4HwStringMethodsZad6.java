//Vuvejda se izre4enie s otdelni dumi.Rezultat: su6tiq tekst no ,vsqka duma e s glavna bukva,a ostanalite sa malki
//Пример: супер яката задача
//Изход: Супер Яката Задача
package stringoveMetodi;

import java.util.Scanner;

public class o4HwStringMethodsZad6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentance;
		System.out.println("prigotvi si da vuvede6 izre4enieto:  ");
		sentance = stringDeclaration();
		char[] workArr = new char[sentance.length()];
		for (int i = 0; i < sentance.length(); i++) {
			workArr[i] = sentance.charAt(i);
		}
		// sentance.charAt(0) = Character.toUpperCase(sentance.charAt(0));
		workArr[0] = Character.toUpperCase(workArr[0]);
		for (int i = 1; i < workArr.length; i++) {
			if (workArr[i - 1] == ' ') {
				workArr[i] = Character.toUpperCase(workArr[i]);
			} else {
				workArr[i] = Character.toLowerCase(workArr[i]);
			}

		}
		sc.close();
		String sent2 = new String(workArr);
		System.out.println(sent2);
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