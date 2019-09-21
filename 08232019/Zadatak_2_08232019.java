package vezbanje1;

import java.util.Scanner;

public class Zadatak_2_08232019 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.print("Unesi dva cela broja: ");
		int a, b;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Unesi treci ceo broj za deljenje");
		int c;
		c=sc.nextInt();
		ispis(a, b, c);
	}
	public static void ispis(int x, int y, int z) {
		for (int i=x; i<=y; i++ ) {
			if (i%z==0)
			System.out.print(i+" ");
		}
		
	}

}
