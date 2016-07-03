//cifri se konvertirat v tekst po slednata shema :
//На някои мобилни телефони английската азбука се получава от 
//натискане на клавишите по следния начин: 
//ABC(2), DEF(3), 
//GHI(4), JKL(5), MNO(6), PQRS(7), TUV(8), WXYZ(9).
//Напишете програма, която приема последователност от 
//натискания на клавиши (цифри) и конвертира 
//последователността към символен низ
//от английски букви.
package stringoveMetodi;

import java.util.Scanner;

public class uprajneniqTask8 {
	public static void main(String[] args) {
		System.out.println("vuvedi suob6tenieto:");
		String str = stringDeclaration();
		String[] list = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		int a;
		String str1 = null;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) > '1' && str.charAt(i) <= '9') {
				char s = str.charAt(i);
				switch (s) {
				case '2':
					a = broiPovtoreniqCifra(i, str, 3);
					i = i + a - 1;
					str1 = izvediBukva(0, str1, (a - 1), list);
					break;
				case '3':
					a = broiPovtoreniqCifra(i, str, 3);
					i = i + a - 1;
					str1 = izvediBukva(1, str1, (a - 1), list);
					break;
				case '4':
					a = broiPovtoreniqCifra(i, str, 3);
					i = i + a - 1;
					str1 = izvediBukva(2, str1, (a - 1), list);
					break;
				case '5':
					a = broiPovtoreniqCifra(i, str, 3);
					i = i + a - 1;
					str1 = izvediBukva(3, str1, (a - 1), list);
					break;
				case '6':
					a = broiPovtoreniqCifra(i, str, 3);
					i = i + a - 1;
					str1 = izvediBukva(4, str1, (a - 1), list);
					break;
				case '8':
					a = broiPovtoreniqCifra(i, str, 3);
					i = i + a - 1;
					str1 = izvediBukva(6, str1, (a - 1), list);
					break;
				case '7':
					a = broiPovtoreniqCifra(i, str, 4);
					i = i + a - 1;
					str1 = izvediBukva(5, str1, (a - 1), list);
					break;

				case '9':
					a = broiPovtoreniqCifra(i, str, 4);
					i = i + a - 1;
					str1 = izvediBukva(7, str1, (a - 1), list);
					break;

				}
			}
		}
		str1=str1.substring(4, str1.length());
		System.out.println(str1);
	}

	static String izvediBukva(int row, String str1, int col,
			String[] list) {/*
							 * row,col(koordinati) v stringa list i se zapisva v
							 * stringa str1
							 */
		str1 = str1 + list[row].charAt(col);
		return str1;

	}

	static int broiPovtoreniqCifra(int i, String s, int tri) {
		int broiPovtori = 1;
		char temp = s.charAt(i);
		if ((i + 1) < s.length()&&temp == s.charAt(i + 1) ) {
			broiPovtori = 2;
			if ((i + 2) < s.length()&&temp == s.charAt(i + 2)  ) {
				broiPovtori = 3;
				if (tri == 4 && (i + 3) < s.length()&&temp == s.charAt(i + 3) ) {
					broiPovtori = 4;
				}
			}
		}
		return broiPovtori;
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
