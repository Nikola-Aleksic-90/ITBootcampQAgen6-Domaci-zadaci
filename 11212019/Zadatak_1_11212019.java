import java.util.Scanner;

public class Zadatak_1_11212019 {

	
	
	// upisivanje elemenata u niz
	public static Double[] ucitajNiz(int duzina) {
		Double[] niz = new Double[duzina];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < duzina; i++) {
			System.out.println("Unesi " + (i + 1) + ". clan niza");
			niz[i] = sc.nextDouble();
		}
		return niz;
	}
	
	
	
	
	// Ispisivanje unetog niza
	public static void ispisiNiz(Double[] niz) {
		System.out.println("");				// pravimo nov red da odvojimo ispis od unosa
		System.out.print("Ispisan niz: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + "  ");
		}
	}
	
	
	
	
	
	public static void deljiviSa3(Double[] niz) {
		Double d3;
		System.out.println("");
		System.out.print("Elementi niza deljivi sa 3 su: ");
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] %3 == 0) {
				d3 = niz[i];
				System.out.print(d3 + "  ");
			}
		}	
	}
	
	
	
	
	public static void deljiviSa5(Double[] niz) {
		Double d5;
		System.out.println("");
		System.out.print("Elementi niza deljivi sa 5 su: ");
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] %5 == 0) {
				d5 = niz[i];
				System.out.print(d5 + "  ");
			}
		}	
	}

	
	
	
	public static void main(String[] args) {
		// Korisnik ucitava niz od N elemenata niza (koristiti posebnu metodu).
		// Napisati zasebno 2 metode
		// Prva metoda ispisuje elemente niza koji su deljivi sa 3
		// Druga metoda ispisuje elemente niza koji su deljivi sa 5

		
		
		
		// Prvo definisemo duzinu niza
		Scanner sc = new Scanner(System.in);
		int duzina;
		do {
			System.out.print("Unesite duzinu niza: ");
			while (!sc.hasNextInt()) {
				System.out.print("To nije ocekivani rezultat, pokusajte ponovo: ");
				sc.next();
			}
			duzina = sc.nextInt();
			if (duzina == 0) System.out.print("Duzina niza ne moze biti 0. ");
			if (duzina < 0) System.out.print("Duzina ne moze biti negativna. ");
			if (duzina == 1) System.out.println("Nema smisla kreirati niz od jednog broja, ali ok, kako hoces");
		} while (duzina <= 0);
		
		
		
		
		// Deklaracija niza i prosledjivanje duzine niza ka metodi
		Double[] niz = ucitajNiz(duzina);	
		// kreiraj niz zvan "niz", i prosledi duzinu niza "duzinu" u metodu ucitajNiz
		

		
		// ispisivanje niza
		ispisiNiz(niz);
		
		
		
		// ispisivanje clanova deljivih sa 3
		deljiviSa3(niz);
		
		
		
		// ispisivanje clanova niza deljivih sa 5
		deljiviSa5(niz);
		
		
	}

}
