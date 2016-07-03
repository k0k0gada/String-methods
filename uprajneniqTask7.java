//transformira dadena matrica ot realni 4isla v simvolen niz s to4nost do 2rata cifra sled des.zapetaq
//Напишете програма, която трансформира дадена матрица от 
//реални числа в символен низ, така че при отпечатване на 
//екрана на символния низ числата от матрицата да бъдат в 
//четим табличен вид с точност 2 цифри след десетичната точка.
package stringoveMetodi;

import java.util.Random;
import java.util.Scanner;

public class uprajneniqTask7 {
	public static void main(String[] args) {
		double[][] arr = createRandMasiv();
		double[][] arrWork = new double[arr.length][arr[0].length];
		int[][] arrWork1 = new int[arr.length][arr[0].length];
		for (int i = 0; i < arrWork.length; i++) {
			for (int j = 0; j < arrWork[i].length; j++) {
				arrWork1[i][j]=(int)(arr[i][j]*100);
			}
		}
		for (int i = 0; i < arrWork1.length; i++) {
			for (int j = 0; j < arrWork1[i].length; j++) {
				arrWork[i][j]=(double)(arrWork1[i][j]);
				arrWork[i][j]=arrWork[i][j]/100;
			}
		}
		String str=Double.toString(arrWork[0][0]);
		for (int i = 0; i < arrWork1.length; i++) {
			for (int j = 0; j < arrWork1[i].length; j++) {
				if(j==0&&i==0){
					str=str+" ";
					continue;
				}
				String temp=Double.toString(arrWork[i][j]);
				str=str+temp+" ";
			}
			str=str+"\n";
		}
		System.out.println("stringa :");
		System.out.println(str);
		
		
	}

	static double[][] createRandMasiv() {
		Random rd = new Random();
		int r = 2 + rd.nextInt(5);
		int c = 2 + rd.nextInt(5);
		double[][] mas = new double[r][c];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rd.nextDouble() * 10;
			}
		}
		System.out.println("generiran Random masiv :");
		printMas2DDouble(mas);
		return mas;
	}
	static void printMas2DDouble(double [][]arrWork ){
		for (int i = 0; i < arrWork.length; i++) {
			for (int j = 0; j < arrWork[i].length; j++) {
				System.out.print(arrWork[i][j]+ " ");
			}
			System.out.println();
		}
	}
	static void printMas2DInt(int [][]arrWork ){
		for (int i = 0; i < arrWork.length; i++) {
			for (int j = 0; j < arrWork[i].length; j++) {
				System.out.print(arrWork[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
