package fakultet;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Covek {
	private String titula;
	List<String> predmeti;

	public Profesor(String ime, String prezime, int godRodj, String titula) {
		super(ime, prezime, godRodj);
		this.titula = titula;
		predmeti = new ArrayList<>();
	}

	public String getTitula() {
		return titula;
	}

	public void addPredmet(String predmet) {
		predmeti.add(predmet);
	}

	public boolean izbaciPredmet(String predmet) {
		return predmeti.remove(predmet);
	}

	public String getPredmet(int i) {
		return predmeti.get(i);
	}

	public String ispis() {

		predmeti.add("UPT");
		predmeti.add("IPT");
		predmeti.add("Sociologija");
		String s = "";
		for (String predmet : predmeti) {
			s += predmet + "\n";
		}
		return s;
	}

	public String ispisi() {
		return super.getIme() + " " + super.getPrezime() + " je" + " " + titula + " koji drzi nastavu na: " + ispis();
	}
}
