package stringoveMetodi;

import java.util.Random;
import java.util.Scanner;

public class klipcheTasksInClass {
	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("kolko elementa da e masiva ? ");
			n = sc.nextInt();
		} while (n < 1);
		int[] mas = arrGeneration(n);
		arrDisplay(mas);
		sc.close();
	}

	static void arrDisplay(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + " ");
		}
		System.out.println();
	}

	static int[] arrGeneration(int n) {
		int[] mas = new int[n];
		Random rd = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rd.nextInt(20);
		}
		return mas;
	}
}
