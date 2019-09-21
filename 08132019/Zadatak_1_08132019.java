package tp;

public class Zadatak_1_08132019 {

	public static void main(String[] args) {
		int i = 1, k = 2;
		// uzima vrednost i (1), i povecava za 1 (sada je i=2)
		i++;
		// uzima vrednost k (2), i povecava za 1 (sada je k=3)
		k++;
		// povecava vrednost, zatim je upisuje u i
		++i;
		// povecava vrednost za 1 zatim dodaje k i upisuje u i
		i = ++k;
		// uzima vrednost i i smanjuje je za 1
		i--;
		// uzima vrednost k i smanjuje je za 1
		k--;
		// smanjuje vrednost k i upisuje je u i
		i = --k;
		// smanjuje vrednost i i to upisuje u k
		k = --i;

	}

}
