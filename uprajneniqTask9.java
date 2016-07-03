//4islata do n se slepvat v niz;
//Въведете неотрицателно цяло число  n
//от клавиатурата и  конструирайте низа, който се получава от слепването на 
//числата  0, 1, 2, 3, ...n.
package stringoveMetodi;

import java.util.Scanner;

public class uprajneniqTask9 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n;
		do{
			System.out.println("vuvedi neotricatelno 4islo");
			n=sc.nextInt();
		}while(n<0);
		String s="0";
		for(int i=1;i<=n;i++){
			s=s+i;
		}
		System.out.println(s);
		s="0";
		for(int i=1;i<=n;i++){
			String t=Integer.toString(i);
			s=s.concat(t);
		}
		System.out.println(s);
	}

}
