package ucionica;

public class GlavniUcionica {

	public static void main(String[] args) {
		Polaznik p1= new Polaznik("Filip Markov");
		Laptop l1= new Laptop("Fujitsu",p1);
		
		System.out.println(l1.ispisi()+" "+p1.ispisi());
	}

	

}
