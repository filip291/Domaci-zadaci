package knjige;

public class Knjige {
	private String nazivK;// get
	private String nazivA;// get
	public int brStr;// get
	public int godina;// get/set

	public Knjige (String nazivK, String nazivA) {
		this.nazivK=nazivK;
		this.nazivA=nazivA;
		brStr=0;
		godina=0;
	
	}
	public String getNazivK() {
		return nazivK;
	}
	public String getNazivA() {
		return nazivA;
	}
	public int getBrStr() {
		return brStr;
	}
	public void setBrStr(int brStr) {
		this.brStr=brStr;
	}
	public int getGodina() {
		return godina;
	}
	public void setGodina(int godina) {
		this.godina=godina;
	}
}	