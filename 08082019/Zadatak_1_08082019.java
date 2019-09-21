package pp;

import java.util.Scanner;

public class Zadatak_1_08082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, o, p;
		System.out.println("Ucitaj a: ");
		a = sc.nextDouble();
		System.out.println("Ucitaj b: ");
		b = sc.nextDouble();
		o = 2 * a + 2 * b;
		System.out.println("Obim: " + o);
		p = a * b;
		System.out.println("Povrsina: " + p);

	}

}
