package cp;

import java.util.Scanner;

public class Zadatak_1_08152019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = 0, b = 0, c = 0, h = 0, r = 0;
		int izbor;

		do {
			System.out.println("Izaberite geometrijsko telo: ");
			System.out.println("1 - Povrsina kocke.");
			System.out.println("2 - Povrsina kvadra.");
			System.out.println("3 - Povrsina valjka.");
			System.out.println("4 - Povrsina lopte.");
			System.out.println("0 - Izlaz");
			izbor = sc.nextInt();

			switch (izbor) {
			case 1:
				System.out.println("Unesi stranicu kocke: ");
				a = sc.nextDouble();
				if (a > 0) {

					System.out.println("Povrsina kocke je: " + (6 * a * a));
				}else {
					System.out.println("Greska!");
				}
				break;
			case 2:
				System.out.println("Unesi stranice kvadra: ");
				a = sc.nextDouble();
				b = sc.nextDouble();
				c = sc.nextDouble();
				if (a > 0 && b > 0 && c > 0) {

					System.out.println("Povrsina kvadra je: " + (2 * (a * b + b * c + c * a)));
				}else {
					System.out.println("Greska!");
				}
				break;
			case 3:
				System.out.println("Unesi poluprecnik i visinu valjka: ");
				r = sc.nextDouble();
				h = sc.nextDouble();
				if (r > 0 && h > 0) {

					System.out.println("Povrsina valjka je: " + (2 * r * r * 3.14 + 2 * r * h * 3.14));
				}else {
					System.out.println("Greska!");
				}
				break;
			case 4:
				System.out.println("Unesi poluprecnik lopte: ");
				r = sc.nextDouble();
				if (r > 0) {

					System.out.println("Povrsina lopte je: " + 4 * r * r * 3.14);
				}else {
					System.out.println("Greska!");
				}
				break;

			}

		} while (izbor != 0); {
			System.out.println("Izasli ste iz menija!");
		}
	}

}
