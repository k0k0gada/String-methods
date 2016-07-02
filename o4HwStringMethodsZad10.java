//Задача 10: 
//kum ASCII koda na vseki char na daden String da se dobavi 5 i da se izkara noviq niz
//Да се състави програма, която по даден низ връща друг, 
//символите, на който са получени като към всеки код на символ 
//от  //ASCII  // таблицата е добавеното числото 5 и е записан 
//новополучения символ.
//Пример :
//Вход: 
//Hello
//Изход: 
//Mjqqt
package stringoveMetodi;

import java.util.Scanner;

public class o4HwStringMethodsZad10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("prigotvi si da vuvede6 NIZA:  ");
		String word = stringDeclaration();
		char[] arrWork = new char[word.length()];
		for (int i = 0; i < word.length(); i++) {
			int temp1=(int)word.charAt(i)+5;
			arrWork[i] = (char)temp1;
		}
		for (int i = 0; i < word.length(); i++) {
			System.out.print(arrWork[i]);
		}
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

	static int umnojenieDeset(int a) {
		int stepen = 1;
		for (int i = 0; i < a; i++) {
			stepen *= 10;
		}
		return stepen;
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