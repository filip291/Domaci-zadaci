package vezbanje1;

import java.util.Scanner;

public class Zadatak_1_08232019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava ceo broj n.
		// Taj broj n se prosledjuje metodi koja formira
		// i vraca ceo broj koji predstavlja inverzan broj.
		// Glavni program nakon toga ispisuje taj inverzan broj.
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi ceo broj: ");
		int n;
		n = sc.nextInt();
		int m=inverzija(n);
		ispis(m);
		
	}

	public static int inverzija(int c) {
		int inverz=0;
		int y;
		while (c!=0) {
			y=c%10;
			inverz=inverz*10+y;
			c/=10;
			
		}
		return inverz;
	}

	public static void ispis(int x) {
		System.out.println(x);
	}

}
