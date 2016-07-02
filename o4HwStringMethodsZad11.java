//Da se otpe4ata masiv v konzola,4rez metod

package stringoveMetodi;

import java.util.Random;
import java.util.Scanner;

public class o4HwStringMethodsZad11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[] mas = new int[5];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rd.nextInt(15);
		}
		massPrint1D(mas);
		sc.close();

	}

	static void massPrint1D(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + " ");
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

}