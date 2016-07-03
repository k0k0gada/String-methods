//Besenica 
//Реализирайте играта “Бесеница” – за тайна дума, потребителят 
//трябва да въвежда буква, след което да се отпечатва думата, в 
//която са показани отгатнатите букви, а на мястото на 
//неотгатнатите има _. Също така потребителят трябва да знае 
//колко опита му остават.
package stringoveMetodi;

import java.util.Random;
import java.util.Scanner;

public class uprajneniqTask11Besenica {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] list = { "krokodil", "kola", "kon", "krilo", "marmot", "shokolad", "staniol", "krava ", "parcal",
				"shnola", "mishka", "telefon", "cvete", "saksiq", "radio", "snimka", "vrata", "drujka", "iutiq",
				"narcis", "nar", "krustoslovica", "lampa", "bilka", "tramvai", "car", "carica", "kniga", "leglo",
				"chasha", "shnur", "kontakt", "bukva", "riza", "gashti", "antena", "shtora", "kiselina", "tpchilka",
				"membrana", "vaza", "peralnq", "pechka", "osnova " };
		int moves = selectDificulty();//izbira se kolko hoda da ima 4oveka
		char ch;
		Random rd = new Random();
		String word = list[rd.nextInt(list.length)];//slu4aina duma ot spisaka
		System.out.println("dumata:");
		char[] word1 = new char[word.length()];
		for (int i = 0; i < word1.length; i++) {//vzimame dumata v masiv ot char-4eta
			word1[i] = '_';
		}
		printWord(word1);
		boolean win = checkWin(word1, word);
		int[] bukvi = letterCount(word);//vzimame si4ki bukvi koito gi ima v dumata
		do {
			System.out.println("vuvedi bukva");
			ch = sc.next().charAt(0);
			if (bukvi[(int) ch - 'a'] != 0) {//ako bukvata q ima v spisaka ot bukvi na dumata
				for (int i = 0; i < word1.length; i++) {//zamenqma tainite simvol(_) s bukvata
					if (word.charAt(i) == ch) {
						word1[i] = ch;
					}
				}
			} else {//ako li ne gubi hod 4oveka 
				moves--;
				System.out.println("bukvata q nqma!\nostavat " + moves + " hoda");
			}
			printWord(word1);
			if (win = checkWin(word1, word)) {//proverqvame dali ne e poznal dumata,ako e izlizame 
				break;
			}
		} while (moves > 0);
		System.out.println(win ? "Bravo!Pe4eli6!" : "Obesiha te!Gubi6!");
		if (!(win)) {//ako ne e spe4elil da mu kajem koq e bila dumata vse pak 
			System.out.println("dumata be6e :" + word);
		}
	}

	static int selectDificulty() {
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("kolko hoda iska6 da ima6?");
			n = sc.nextInt();
		} while (n < 2 || n > 12);
		return n;
	}

	static void printWord(char[] wordWork) {
		for (int i = 0; i < wordWork.length; i++) {
			System.out.print(wordWork[i]);
		}
		System.out.println();
	}

	static boolean checkWin(char[] wordWork, String word) {
		boolean win = true;
		for (int i = 0; i < wordWork.length; i++) {
			if (wordWork[i] != word.charAt(i)) {
				win = false;
				break;
			}
		}
		return win;
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
}
