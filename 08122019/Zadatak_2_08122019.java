package dp;

import java.util.Scanner;

public class Zadatak_2_08122019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi broj: ");
		int n, br, sum = 0, pro = 1;
		n = sc.nextInt();
		br = 0;

		while (br < n) {
			if (br % 2 == 0) {

				sum += br;
				br += 1;

			} else if (br % 2 == 1) {

				pro *= br;
				br += 1;

			}
		}
		System.out.println("Zbir parnih brojeva je: " + sum);
		System.out.println("Proizvod neparnih brojeva je: " + pro);

	}

}
