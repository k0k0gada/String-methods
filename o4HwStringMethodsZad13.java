//2 masiva se zapisvat v 3ti (kato se slepvat)puvo vsi4ki el.na masiv1 posle vs.el.masiv 2 

//Да се създаде метод, който приема два масива от числа и връща 
//масив, съдържащ всички елементи на подадените масиви, като в 
//първата част на масива са елементите на първия подаден масив, 
//а във втората част – тези на втория подаден масив

package stringoveMetodi;

import java.util.Random;
import java.util.Scanner;

public class o4HwStringMethodsZad13 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] mas1 = createRandMasiv();
		System.out.println("purvim masiv: ");
		massPrint1D(mas1);
		int[] mas2 = createRandMasiv();
		System.out.println("vtori masiv: ");
		massPrint1D(mas2);

		int[] mas3 = mergeMas(mas1, mas2);
		System.out.println("noviq masiv: ");
		massPrint1D(mas3);
	}

	static int[] mergeMas(int[] a, int[] b) {
		int[] c = new int[a.length + b.length ];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		int temp = 0;
		for (int i = a.length; i < c.length; i++) {
			c[i] = b[temp];
			temp++;
		}
		return c;
	}

	static int[] createRandMasiv() {
		Random rd = new Random();
		int n = 2 + rd.nextInt(5);
		int[] mas = new int[n];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rd.nextInt(10);
		}
		return mas;
	}

	static void massPrint1D(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + " ");
		}
		System.out.println();
	}

}