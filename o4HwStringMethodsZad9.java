//proverqva dali daden niz e palindrom

//Да се състави програма, чрез която по въведен низ съдържащ букви, 
//цифри, знак минус '-' се извежда сборът на въведените числа като се 
//отчита знакът '-' пред съответното число.
//Вход: asd-12sdf45-56asdf100
//Изход:
//-12
//45
//-56
//100
//Сума = 77
package stringoveMetodi;

import java.util.Scanner;

public class o4HwStringMethodsZad9 {
	public static void main(String[] args) {
		char zero = '0';
		Scanner sc = new Scanner(System.in);
		System.out.println("prigotvi si da vuvede6 dumata:  ");
		String word = stringDeclaration();
		// char[] workArr = new char[word.length()];
		// for (int i = 0; i < word.length(); i++) {
		// workArr[i] = word.charAt(i);
		// }
		int counter = 0;
		int counter1 = 0;
		int[][] chisla = new int[word.length()][word.length()];// pazi cifrite
																// vuv vsqko
																// 4islo
		int[] chislata = new int[word.length()];// pazi gotovite 4isla
		for (int i = 0; i < word.length(); i++) {// cikul koito prekosqva celiq
													// String
			int temp = 0;
			if ((word.charAt(i) - zero) >= 0 && (word.charAt(i)
					- zero) <= 9) {/*
									 * ako razlikata na (Ascii koda ) momentniq
									 * simvola sus 0 e mejdu 0 i 9
									 */
				for (int j = i; j < word.length(); j++) {//zapo4va novo obhojdane koeto vijda kolko sa na broi cifrite
					if ((word.charAt(j) - zero) >= 0 && (word.charAt(j) - zero) <= 9) {/*
						 * ako razlikata na (Ascii koda ) momentniq
						 * simvola sus 0 e mejdu 0 i 9
						 */
						chisla[counter1][counter] = word.charAt(j) - zero;//zapametqva cifrata 
						counter++;//otiva na sledva6tata cifra
					} else {//ako current char-a ne e cifra izlizame ot cikula
						break;
					}
				}
				temp = counter;//pomo6tna promenliva
				for (int j = 0; j < temp; j++) {/*vzimame vsqka cifra i q umnojavame po 10^counter-1(-1 za6toto na 2cifreno 4islo broq4a e 2 ,no ni trqbva edno umnojenie po 10 i edno po 1 )*/
					chislata[counter1] = chislata[counter1] + chisla[counter1][j] * umnojenieDeset(counter - 1);
					counter--;
				}
				if (i != 0) {//proverqqvame dali ne e purviq simvol ot niza
					if (word.charAt(i - 1) == '-') {//ako ne e ,i predi6niq simvol e -
						chislata[counter1] = -chislata[counter1];//4isloto trqbva da e oticatelno
					}//sled kraq na tozi if chisloto e gotovo
				}
				counter = 0;//broq4a na cifrite otiva na nula
				counter1++;//gotovi sme za sledva6toto 4islo da bude zapisano
			}
			i += temp;//preska4ame broq cifri koito sa se namirali vuv stringa(ina4e 2435 bi se razglejdalo kato 2435,435,35,5
		}
		int sum = 0;
		for (int i = 0; i < counter1; i++) {
			sum = sum + chislata[i];//namirame sumata na chislata
		}
		System.out.println("sumata na chislata e : " + sum);
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

	static int umnojenieDeset(int a) {
		int stepen = 1;
		for (int i = 0; i < a; i++) {
			stepen *= 10;
		}
		return stepen;
	}

	static String stringDeclarationOneWordOnly() {
		String s;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("enter your String:");
			s = sc.next();
		} while (s == null);
		return s;
	}
}