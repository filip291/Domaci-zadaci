package knjige;

public class GlavniKnjige {

	public static void main(String[] args) {
		Knjige k1=new Knjige("Idiot","Dostojevski");
		Knjige k2=new Knjige("1984","Dzordz Orvel");
		Knjige k3=new Knjige("Dervis i Smrt","Mesa Selimovic");
		k1.setGodina(2010);
		k2.setGodina(1999);
		k3.setGodina(2004);
		k1.setBrStr(200);
		k2.setBrStr(198);
		k3.setBrStr(300);
		
		
		System.out.println("Naziv knjige: "+k1.getNazivK()+" Naziv autora: "+k1.getNazivA()+" Godina izdavanja: "+k1.getGodina()+" Broj strana: "+k1.getBrStr());
		System.out.println("Naziv knjige: "+k2.getNazivK()+" Naziv autora: "+k2.getNazivA()+" Godina izdavanja: "+k2.getGodina()+" Broj strana: "+k2.getBrStr());
		System.out.println("Naziv knjige: "+k3.getNazivK()+" Naziv autora: "+k3.getNazivA()+" Godina izdavanja: "+k3.getGodina()+" Broj strana: "+k3.getBrStr());

		
	}

}
