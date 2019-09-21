package vezbanje1;

import java.util.Scanner;

public class Zadatak_3_08232019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi duzinu niza: ");
		int n;
		n = sc.nextInt();
		int[] niz = new int[n];
		ucitavanjeNiza(niz);
		int pro=proizvod(niz);
		System.out.println("Proizvod elemenata na neparnim pozicijama je "+pro);
		ucitavanjeNiza(niz);
		int sum=sabiranje(niz);
		System.out.println("Zbir parnih elemenata je "+sum);
	}

	public static void ucitavanjeNiza(int niz[]) {
		for (int i = 0; i < niz.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Unesi element "+i+" niza: ");
			niz[i] = sc.nextInt();

		}
	}

	public static int proizvod(int niz[]) {
		int pro = 1;
		for (int i = 1; i < niz.length; i++) {
			if (i % 2 != 0) {
				pro *= niz[i];
			}
		}
		return pro;
	}
	public static int sabiranje(int niz[]) {
		int sum = 0;
		for (int i=0; i<niz.length; i++) {
			if (niz[i]%2==0) {
				sum+=niz[i];
			}
		}
		return sum;
	}

}
