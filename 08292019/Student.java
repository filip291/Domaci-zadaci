package fakultet;

public class Student extends Covek {
	private int UBrIndeksa=0;
	private int brIndeksa;
	private int godStu;
	private double prosek;
	
	public Student (String ime, String prezime, int godRodj, int godStu, double prosek) {
		super(ime, prezime, godRodj);
		brIndeksa=++UBrIndeksa;
		this.godStu=godStu;
		this.prosek=prosek;
	}

	public void setUBrIndeksa(int uBrIndeksa) {
		UBrIndeksa = uBrIndeksa;
	}

	public void setBrIndeksa(int brIndeksa) {
		this.brIndeksa = brIndeksa;
	}

	public void setGodStu(int godStu) {
		this.godStu = godStu;
	}

	public void setProsek(double prosek) {
		this.prosek = prosek;
	}

}
