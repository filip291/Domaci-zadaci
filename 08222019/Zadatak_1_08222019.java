package vezbanje1;

import java.util.Scanner;

public class Zadatak_1_08222019 {

	public static void main(String[] args) {
		// Napisati program u kom se unose 3 realna broja
		// i poziva i ispisuje dve metode(u mainu). 
		// Prva metoda vraca proizvod unetih brojeva
		// Druga metoda ispisuje najmanji od unesenih brojeva.
		Scanner sc= new Scanner(System.in);
		System.out.println("Unesi 3 realna broja: ");
		double a, b, c, w;
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		w=proizvod(a,b,c);
		najmanji(a, b, c);
	}
	public static double proizvod(double x, double y, double z) {
		double w;
		w=x*y*z;
		System.out.println(w);
		return w;
		
	}
	public static void najmanji(double x, double y, double z) {
		if (x<y && x<z) {
			System.out.println(x);
		}
		if (y<x && y<z) {
			System.out.println(y);
		}
		else {
			System.out.println(z);
		}
		
	}

}
