package stringoveMetodi;

import java.util.Scanner;

public class klipcheTasksInClass2Compare2Texts {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("vuvedi text:");
		String a = sc.nextLine();
		System.out.println("kakvo 6te tursim dali go ima vuv vtoriq text:");
		String b = sc.nextLine();
		boolean sud;
		sud = a.contains(b);
		System.out.println(sud ? "Turseniq tekst go ima " : "turseniq text go nqma ");
		boolean sudurja = contains(b, a);
		System.out.println(sudurja ? "Turseniq tekst go ima " : "turseniq text go nqma ");
	}

	static boolean contains(String a, String b) {// a sudurja li se v b
		boolean sudurja = false;
		for (int i = 0; i < b.length(); i++) {
			if (a.charAt(0) == b.charAt(i)) {
				sudurja = true;
				for (int j = 0; j < a.length(); j++) {
					if (a.charAt(j) != b.charAt(j + i)) {
						sudurja = false;
						break;
					}
				}
			}
//			sudurja?break:continue;
			if (sudurja == true) {
				break;
			}
		}
		return sudurja;
	}
}
