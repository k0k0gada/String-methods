//Напишете програма, която брои колко пъти се среща всяка 
//английска буква в даден символен низ. Запазете резултатите в 
//масив.
//kolko puti se sre6ta vsqka angliiska bukva

package stringoveMetodi;

import java.util.Scanner;

public class uprajneniqTask4 {
	public static void main(String[] args) {
		String str1;//a==97
		str1 = stringDeclaration();
		int[] azbuka = new int[26];
		int otherSymbols=0;
		str1 = str1.toLowerCase();
		char s;
		for (int i = 0; i < str1.length(); i++) {
			s = str1.charAt(i);
			switch (s) {
			case 'a':
				azbuka[0]++;
				break;
			case 'b':
				azbuka[1]++;
				break;
			case 'c':
				azbuka[2]++;
				break;
			case 'd':
				azbuka[3]++;
				break;
			case 'e':
				azbuka[4]++;
				break;
			case 'f':
				azbuka[5]++;
				break;
			case 'g':
				azbuka[6]++;
				break;
			case 'h':
				azbuka[7]++;
				break;
			case 'i':
				azbuka[8]++;
				break;
			case 'j':
				azbuka[9]++;
				break;
			case 'k':
				azbuka[10]++;
				break;
			case 'l':
				azbuka[11]++;
				break;
			case 'm':
				azbuka[12]++;
				break;
			case 'n':
				azbuka[13]++;
				break;
			case 'o':
				azbuka[14]++;
				break;
			case 'p':
				azbuka[15]++;
				break;
			case 'q':
				azbuka[16]++;
				break;
			case 'r':
				azbuka[17]++;
				break;
			case 's':
				azbuka[18]++;
				break;
			case 't':
				azbuka[19]++;
				break;
			case 'u':
				azbuka[20]++;
				break;
			case 'v':
				azbuka[21]++;
				break;
			case 'w':
				azbuka[22]++;
				break;
			case 'x':
				azbuka[23]++;
				break;
			case 'y':
				azbuka[24]++;
				break;
			case 'z':
				azbuka[25]++;
				break;
			default:
				otherSymbols++;
			}
		}
		for(int i=0;i<azbuka.length;i++){
			System.out.println("bukvata "+(char)(97+i)+" se sre6ta "+ azbuka[i]+" puti" );
		}
		System.out.println("drugi simvoli ima " + otherSymbols);

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
