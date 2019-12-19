
public class Covek {

	private String ime;
	private String prezime;
	private int ID;
	public static int id_pocetni = 1;
	
	public Covek(String ime1, String prezime1) {
		super();
		this.ime = ime1;
		this.prezime = prezime1;
		this.ID = ID + id_pocetni++; 
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getID() {
		return ID;
	}

	
	
}
