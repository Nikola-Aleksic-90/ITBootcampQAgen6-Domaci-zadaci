
public class Main_Metoda_Domaci {

	public static void main(String[] args) {

		Putnik ptnk1 = new Putnik("Nikola", "Aleksic", 1000);
		Putnik ptnk2 = new Putnik("Mali", "Mikica", 200);
		Putnik ptnk3 = new Putnik("Tijana", "Ajfon", 0);
		Vozac vzc1 = new Vozac("Paja", "Ispicutura");
		Autobus bus = new Autobus("Mali Mokri Lug - Begaljica", 100, 10);
		
		System.out.println("ID " + ptnk1.getIme() + " je " + ptnk1.getID() );
		System.out.println("ID " + ptnk2.getIme() + " je " + ptnk2.getID() );
		System.out.println("ID " + ptnk3.getIme() + " je " + ptnk3.getID() );
		
		System.out.println("ID " + vzc1.getIme() + " je " + vzc1.getID() );
		
		bus.postaviVozaca(vzc1);
		bus.izbaciVozaca(vzc1);
		bus.postaviVozaca(vzc1);
		
		ptnk1.dodajNovac(100);
		ptnk1.oduzmiNovac(200);
		ptnk2.dodajNovac(100);
		ptnk3.dodajNovac(400);
		
		bus.dodajPutnika(ptnk1);
		bus.dodajPutnika(ptnk2);
		bus.dodajPutnika(ptnk3);
		bus.izbaciPutnika(ptnk3);
		bus.dodajPutnika(ptnk3);
		
		bus.ispisiPutnike();
		System.out.println("");
		bus.pokreniVoznju();
		

	}

}
