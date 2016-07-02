package stringoveMetodi;

//Да се състави програма, чрез която се въвеждат 2 редици от знаци 
//(думи).
//Ако в двете редици участва един и същи знак, да се изведе на екрана 
//първата редица хоризонтално, а втората вертикално, така че да се 
//пресичат в общия си знак.
//Ако редиците нямат общ знак да се изведе само уведомително 
//съобщение.
//Пример :
//м
//а
//шапка
//и
//н
//а
import java.util.Scanner;

public class o4HwStringMethodsZad5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word1, word2;
		System.out.println("prigotvi si da vuvede6 purvata duma:  ");
		word1 = OneWordStringDeclaration();
		System.out.println("prigotvi se da vuvede6 vtorata duma: ");
		word2 = OneWordStringDeclaration();
		boolean mutChar = false;// presi4a dumite pri purviq sre6tant ednakuv
								// char
		int ind1 = 0, ind2 = 0;
		word1 = word1.toLowerCase();
		word2 = word2.toLowerCase();
		for (int i = 0; i < word1.length(); i++) {
			for (int j = 0; j < word2.length(); j++) {
				if (word1.charAt(i) == word2.charAt(j)) {
					mutChar = true;

					ind1 = i;// ind1-mqstoto na povtarq6tiq se char ot word1;
					ind2 = j;// ind2-zapomnq mqstoto ot word2
					break;
				}
			}
			if (mutChar == true) {
				break;
			}
		}
		if (mutChar == false) {
			System.out.println("nqma povtarq6ti se bukvi");
			return;
		}
		for (int i = 0; i < word1.length(); i++) {
			if (i != ind1) {
				for (int t = 0; t < ind2; t++) {
					System.out.print(" ");
				}
				System.out.println(word1.charAt(i));
			} else {
				System.out.println(word2);
			}
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