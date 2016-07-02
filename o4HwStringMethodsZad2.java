//2 niza.pod 5-20 simvola .razmenq purvite 5 simvola i izvejda duljinata na po-dulgiq i 2ta stringa 

package stringoveMetodi;

import java.util.Scanner;

public class o4HwStringMethodsZad2 {
	public static void main(String[] args) {
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("string1:");
		s1 = OneWordStringDeclaration();
		System.out.println("string2:");
		s2 = OneWordStringDeclaration();
		sc.close();
		String tempS1, tempS2;
		tempS1 = s1.substring(0, 5);
		tempS2 = s2.substring(0, 5);
		s1 = s1.replace(tempS1, tempS2);
		s2 = s2.replace(tempS2, tempS1);
		System.out.println((s1.length() > s2.length()) ? s1.length()
				: s2.length() + " e duljinata na po-dulgiq masiv\n" + s1 + " " + s2);
//		System.out.println(s1 + " " + s2 + " \n duljinata na po-dulgiq masiv e "
//				+ (s1.length() > s2.length() ? s1.length() : s2.length()));

	}

	static String OneWordStringDeclaration() {
		String s;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("enter your String now:");
			s = sc.next();
		} while (s.length() > 20 || s.length() < 6);
		return s;
	}

}
