package Klikeri;

public class Dete {

	// "Dete ima ime, prezime, broj godina i broj klikera." - prvo deklarisemo ovo
	
	private String Ime;
	private String Prezime;
	private int Godine;
	private int klikeri;
	
	// kao i iz proslog domaceg, kreiramo pubic static podatke koji se menjaju,
	// tj, nisu vezani za objekat nego za main metodu
	public static int broj_dece;		// uvecavacemo kao i za ID Autora sa casa ili Polaznika iz proslog domaceg
	public static int ukupne_godine;	// sabiracemo sve godine i podeliti sa brojem dece iznad
	
	
	// "Napraviti mogucnost da se kreira vise objekata klase Dete." => Konstruktor
	// desni klik/source/generate_constructor_using_fields pa onda OK
	// za konstruktor daje i mogucnost klikeri, jer gleda ona 4 gore parametra a klikere ne saljemo iz main-a
	// zbog preglednosti, umesto this koristicu svoje nazive
	
	public Dete(String ime_iz_main_metode, String prezime_iz_main_metode, int godine_iz_main_metode) {
		//super();
		Ime = ime_iz_main_metode;
		Prezime = prezime_iz_main_metode;
		Godine = godine_iz_main_metode;
		// prosirujemo konstruktor za ona 2 static parametra
		broj_dece++;
		ukupne_godine = ukupne_godine + Godine;
	}


	// sada postavljamo getere, seteri nisu potrebni jer NISTA ne menjamo
	// broj klikera menjamo preko metoda, ne preko setera
	public String getIme() {
		return Ime;
	}
	public String getPrezime() {
		return Prezime;
	}
	public int getGodine() {
		return Godine;
	}
	public int getKlikeri() {
		return klikeri;
	}
	
	// " Ako se pozove metoda dodajKlikere ili metoda oduzmiKlikere, broj klikera se azurira."
	// sada pisem metode za dodavanje i oduzimanje klikera
	// stavicemo void jer ne vracamo nista nazad u main metodu, ovde azuriramo stanje
	
	public void dodajKlikere(int broj_u_zagradama_u_main_metodi) {
		klikeri = klikeri + broj_u_zagradama_u_main_metodi;
	}
	
	public void oduzmiKlikere(int broj_u_zagradama_u_main_metodi) {
		klikeri = klikeri - broj_u_zagradama_u_main_metodi;
	}	
	
	// " Napraviti metodu koja ce ispisivati broj klikera i metodu koja ispisuje prosecan broj 
	// decjih godina " - iskomentarisano u main
	
	public static Double getGodine2() {		// Vec imam godine pa zato 2
		// 29+10+10 = 49/3 = 16,333333333 => double
		Double prosek = Double.valueOf(ukupne_godine)/Double.valueOf(broj_dece);
		// Type mismatch, ne moze da konvertuje int u double
		return prosek;
	}
	
	
	
}
