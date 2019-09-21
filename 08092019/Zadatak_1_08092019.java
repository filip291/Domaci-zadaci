package pp;

import java.util.Scanner;

public class Zadatak_1_08092019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesi broj: ");
		double a=sc.nextInt();
		if (a<=0) {
			System.out.println("Pogresan unos");
		}
		else if (a%2== 0) {
			System.out.println("Broj je paran!");
		}
		else if (a%2== 1) {
			System.out.println("Broj je neparan!");
		}
		
		

	}

}
