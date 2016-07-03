//proverqva dali 2 niza sa anagrami
//Напишете програма, която проверява дали даден символен низ 
//е анаграма (съдържа същите символи, но не задължително в 
//същия ред) на друг символен низ. Проверявайте само 
//английските букви

package stringoveMetodi;

import java.util.Scanner;

public class uprajneniqTask5 {
	public static void main(String[] args) {
		String str2, str1;// a==97
		System.out.println("niz1:");
		str1 = OneWordStringDeclaration();
		str1 = str1.toLowerCase();
		System.out.println("niz2:");
		str2 = OneWordStringDeclaration();
		str2 = str2.toLowerCase();
		int[] bukvi1 = letterCount(str1);
		int[] bukvi2 = letterCount(str2);
		boolean angrama=true;
		if (bukvi1.length == bukvi2.length) {
			for (int i = 0; i < bukvi2.length; i++) {
				if(bukvi1[i]!=bukvi2[i]){
					angrama=false;
					break;
				}
			}
		}else{
			angrama=false;
		}
		System.out.println(angrama?"anagrama sa ":"ne sa anagrama");

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
