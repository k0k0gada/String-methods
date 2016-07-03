//4islata do n se slepvat v niz;i se namira mqstoto na m(po-malko ot n)
//Въведете неотрицателно цяло число  n
//от клавиатурата и  конструирайте низа, който се получава от слепването на 
//числата  0, 1, 2, 3, ...n.
package stringoveMetodi;

import java.util.Scanner;

public class uprajneniqTask10VtoriNach {
	public static void main(String[] args) {
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
		String s2 = "0";
		for (int i = 1; i < m; i++) {
			String t = Integer.toString(i);
			s2 = s2.concat(t);
		}
		System.out.println(s);
		System.out.println("tursenoto 4islo zapo4va na mqsto " +(s2.length()+1) );
	}

}
