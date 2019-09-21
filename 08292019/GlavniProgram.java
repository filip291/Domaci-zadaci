package fakultet;

import java.util.ArrayList;
import java.util.List;

public class GlavniProgram {

	public static void main(String[] args) {
		List<String> predmeti = new ArrayList<>();
		Student s1 = new Student("Filip", "Markov", 1995, 3, 7.14);
		Student s2 = new Student("Petar", "Petrovic", 1999, 2, 7.82);
		Student s3 = new Student("Marko", "Markovic", 1997, 4, 8.20);
		Profesor p1 = new Profesor("Ilija", "Vujacic", 1951, "Dr");
		Profesor p2 = new Profesor("Cedomir", "Cupic", 1948, "Dr");
		p1.addPredmet("UPT");
		p1.addPredmet("IPT");
		p2.addPredmet("Sociologija");
		System.out.println(p1.ime+" "+p1.prezime+" "+p1.getGodRodj()+" "+p1.getTitula()+" "+p1.getPredmet(0)+" "+p1.getPredmet(1));
		
		
		
		

	}

}
