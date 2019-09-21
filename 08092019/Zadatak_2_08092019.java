package pp;

import java.util.Scanner;

public class Zadatak_2_08092019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi naziv oblika: ");
		String z;
		double p, x, k;
		z = sc.nextLine();

		switch (z) {
		case "kvadrat":
			System.out.println("Unesi stranicu a: ");
			double a = sc.nextDouble();
			if (a > 0) {
				p = a * a;
				System.out.println("Povrsina kvadrata je: " + p);

			} else if (a <= 0) {
				System.out.println("Los unos");
			}
			;

			break;
		case "krug":
			System.out.println("Unesi r");
			double r = sc.nextDouble();
			if (r > 0) {
				x = r * r * 3.14;
				System.out.println("Povrsine kruga je: " + x);

			} else if (r <= 0) {
				System.out.println("Los unos r");
			}
			break;
		case "pravougaonik":
			System.out.println("Unesi stranice a i b: ");
			double m = sc.nextDouble();
			double n = sc.nextDouble();
			System.out.println("Uneli ste stranice a i b");
			if (m > 0 && n > 0) {
				k = m * n;
				System.out.println("Povrsina pravougaonika je: " + k);

			} else if (m <= 0 || n <= 0) {
				System.out.println("Los unos stranica");
			}
			break;
		default:
			System.out.println("Los unos!");
			break;

		}
	}

}