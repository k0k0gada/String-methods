//dali element se sudurja v masiv
package stringoveMetodi;

import java.util.Random;
import java.util.Scanner;

public class rekursiqMasiv2 {
	public static void main(String[] args) {
		int[] mas = { 4, 5, 64, 2, 4, 5, 67, 8, 9, 4, -3, 4, 5, 2 };
		int difference = findDifnoRec(mas, 0, 0, 1);
		System.out.println("razlikata mejdu max i min elementa e " + difference);
	}

	static int findDifnoRec(int[] mas, int difference, int ind1, int ind2) {
		int diff1 = mas[ind2] - mas[ind1];
		if (diff1 < 0) {
			diff1= -diff1;
		}
		if(diff1>difference)
			difference=diff1;
		if (ind2 == mas.length - 1) {
			ind1++;
			ind2 = ++ind1;
		} else {
			ind2++;
		}
		if (ind2 == (mas.length - 1) && ind1 == mas.length - 2) {
			return difference;
		} else {
			return findDifnoRec(mas, difference, ind1, ind2);
		}

	}

	static int findDifferenceMinMax(int[] mas, int difference, int ind1, int ind2) {
		difference = mas[ind2] - mas[ind1];
		if (difference < 0)
			difference = -difference;
		if (ind2 == mas.length - 1) {
			ind1++;
			ind2 = ++ind1;
		} else {
			ind2++;
		}
		if (ind2 == mas.length - 1 && ind1 == mas.length - 2) {
			return difference;
		}
		if (difference < findDifferenceMinMax(mas, difference, ind1, ind2)) {
			// diffenrce=
		}
		return difference;
	}

}
