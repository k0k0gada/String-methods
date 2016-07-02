//Da se otpe4ata masiv s N elementa,sudurja6t 4islata do N v sebe si na konzola,4rez metod

package stringoveMetodi;

import java.util.Scanner;

public class o4HwStringMethodsZad12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		do{
		System.out.println("kolko elementa e masiva ");
		n=sc.nextInt();
		}while(n<1);
		int[] mas=fillMass(n);
		massPrint1D(mas);
		sc.close();
	}

	static int[] fillMass(int n){
		int [] mas=new int [n];
		for (int i = 0; i < mas.length; i++) {
			mas[i]=i+1;
		}
		return mas;
	}
	static void massPrint1D(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + " ");
		}
	}


}