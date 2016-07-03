//4islata do n se slepvat v niz;i se namira mqstoto na m(po-malko ot n)
//Въведете неотрицателно цяло число  n
//от клавиатурата и  конструирайте низа, който се получава от слепването на 
//числата  0, 1, 2, 3, ...n.
package stringoveMetodi;

import java.util.Scanner;

public class uprajneniqTask10 {
	public static void main(String[] args) {//programta raboti kogato m >2 i m<n-2
		Scanner sc = new Scanner(System.in);
		int n, m;
		do {
			System.out.println("vuvedi neotricatelno 4islo");
			n = sc.nextInt();
		} while (n < 0);
		do {
			System.out.println("vuvedi na koe 4islo indeksa 6te tursim");
			m = sc.nextInt();
		} while (m < 0 || m >= n);
		String s = "0";
		for (int i = 1; i <= n; i++) {
			String t = Integer.toString(i);
			s = s.concat(t);
		}
		if (m < n - 2 && m > 1) {
			m = m - 2;
		}
		String t2 = Integer.toString(m);
		String s2 = t2;
		int ind = 0;
		for (int i = 0; i < 4; i++) {
			m++;
			if (i == 1) {
				ind = s2.length();
			}
			String t = Integer.toString(m);
			s2 = s2.concat(t);
		}
		int ind2 = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == s2.charAt(0)) {
				boolean ednakvi = true;
				for (int j = 0; j < s2.length(); j++) {
					if ((i + j) < s.length() && s.charAt(i + j) == s2.charAt(j)) {
						if (j == ind) {
							ind2 = i + j;
						}
					} else {
						ednakvi = false;
						ind2 = 0;
						break;
					}
				}
				if (ednakvi == true) {
					break;
				}
			}
		}
		System.out.println(s);
		System.out.println("tursenoto 4islo zapo4va na mqsto " + (ind2 + 1));
	}

}
