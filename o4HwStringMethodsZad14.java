//metod,izvejda6t N!

package stringoveMetodi;

import java.util.Scanner;

public class o4HwStringMethodsZad14 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("vuvedi 4islo N ");
			n = sc.nextInt();
		} while (n < 2);
		long Res = Faktoriel(n);
		System.out.println("n!= " + Res);
		sc.close();
	}

	static long Faktoriel(int n) {
		long Fakt = 1;
		for (int i = 1; i <= n; i++) {
			Fakt *= i;
		}
		return Fakt;
	}

}