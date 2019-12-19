
public class Putnik extends Covek {
	
	private int novac;

	public Putnik(String ime1, String prezime1, int novac) {
		super(ime1, prezime1);
		this.novac = novac;
	}

	public int getNovac() {
		return novac;
	}
	
	public void dodajNovac(int pare) {
		novac = novac + pare;
		System.out.println("Uspesno dodat novac. Trenutno stanje " + getIme() + " je :" + getNovac() );
	}
	
	public void oduzmiNovac(int pare) {
		novac = novac - pare;
		System.out.println("Uspesno oduzet novac. Trenutno stanje " + getIme() + " je :" + getNovac() );
	}	

}
