//Да се състави програма, чрез която по въведени трите имена на двама 
//човека разделени със запетая, се извежда чие име има по-голям сбор 
//от ASCII кодовете на съставящите името букви.
//Пример: Anna Dosewa Asenowa, Iwo Peew Peew
//Изход: Anna Dosewa Asenowa
//2ma 4oveka s vuvedeni 3 imena,2mata 4oveka razdeleni sus zapetaq
//izvejdame koe ime ima pove4e sbor ot ASCII kodovete 
package stringoveMetodi;

import java.util.Scanner;

public class o4HwStringMethodsZad4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("prepare ot enter your 2 names ,with ',' betwenn them");
		String s = stringDeclaration();
		String a=",";
		String[] names = s.split(a);
		if (names[0].compareTo(names[1]) > 0) {
			System.out.println(names[0]);
		} else {
			System.out.println(names[1]);
		}

		// for (int i = 0; i < s.length(); i++) {
		// if (s.charAt(i) == ','){
		// sum1=sum;
		// sum=0;
		// name1=name;
		// name=null;
		// i++;
		// }
		//
		// name=name+s.charAt(i);
		// sum = sum + s.charAt(i);
		// }
		// System.out.println((sum1>sum)?name1:name);
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
