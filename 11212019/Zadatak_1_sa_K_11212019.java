import java.util.Scanner;

public class Zadatak_1_sa_K_11212019 {

	
	
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
		System.out.println(""); // pravimo nov red da odvojimo ispis od unosa
		System.out.print("Ispisan niz: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + "  ");
		}
	}

	
	
	// Koji clanovi niza su deljivi sa K
	public static void deljiviSaK(Double[] niz, Double k) {
		Double dk;
		System.out.println("");
		System.out.print("Elementi niza deljivi sa K=" + k + " su: ");
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % k == 0) {
				dk = niz[i];
				System.out.print(dk + "  ");
			}
		}
	}

	
	
	
	
	public static void main(String[] args) {
		// ili
		// Korisnik ucitava niz od N elemenata niza, kao i neki broj K za deljivost.
		// Napisati metodu koja ispisuje elemente niza deljive brojem K.

		
		
		
		
		// Prvo definisemo duzinu niza
		Scanner sc = new Scanner(System.in);
		int duzina;
		do {
			System.out.print("Unesite duzinu niza: ");
			while (!sc.hasNextInt()) { System.out.print("To nije ocekivani rezultat, pokusajte ponovo: ");
				sc.next();
			}
			duzina = sc.nextInt();
			if (duzina == 0)System.out.print("Duzina niza ne moze biti 0. ");
			if (duzina < 0) System.out.print("Duzina ne moze biti negativna. ");
			if (duzina == 1) System.out.println("Nema smisla kreirati niz od jednog broja, ali ok, kako hoces");
		} while (duzina <= 0);

		
		
		
		
		// Deklaracija niza i prosledjivanje duzine niza ka metodi
		Double[] niz = ucitajNiz(duzina);
		// kreiraj niz zvan "niz", i prosledi duzinu niza "duzinu" u metodu ucitajNiz

		
		
	
		
		// ispisivanje niza
		ispisiNiz(niz);

		
		
		
		// Zatim definisemo K
		Double k;
		do {
			System.out.println("");
			System.out.print("Unesite broj K kojim cemo deliti niz: ");
			while (!sc.hasNextDouble()) {
				System.out.print("To nije realni broj, pokusajte ponovo: ");
				sc.next();
			}
			k = sc.nextDouble();
		} while (k < 0);

		
		
		
		// ispisivanje clanova deljivih sa K
		deljiviSaK(niz, k);
	}

}
