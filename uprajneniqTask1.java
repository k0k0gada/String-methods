//Напишете програма, която проверява дали даден символен низ 
//е префикс (начало) на друг символен низ
//daden niz zapo4va li s drug daden niz
package stringoveMetodi;

import java.util.Scanner;

public class uprajneniqTask1 {
	public static void main(String[] args) {
		String str1, str2;

		str1 = stringDeclaration();
		System.out.println("prepare to enter a string to see if it begins with : ");
		str2 = stringDeclaration();
		boolean startsWith = str1.startsWith(str2);
		System.out.println("using predefined method answer : " + startsWith);
		startsWith = myStartsWith(str1, str2);
		System.out.println(startsWith?"first string begins with the second":"first string doesn't begint with the second one");
	}

	static boolean myStartsWith(String s1, String s2) {// tursim dali s1 zapo4va
														// sus s2
		boolean result = true;
		for (int i = 0; i < s2.length(); i++) {
			if (s2.charAt(i) != s1.charAt(i)) {
				result = false;
				break;
			}
		}
		return result;
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
