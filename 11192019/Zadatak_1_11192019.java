import java.util.*;

public class Zadatak_1_11192019 {

	public static void main(String[] args) {
		// Napisati program koji ce na standarnom izlazu ispisati poruku
		// “Niz je palindrom” ili “Niz nije palindrom”
		// (u zavisnosti da li niz jeste ili nije palindrom)

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

		
		// Kreiracemo niz gde ce se ti clanovi ispisivati unazad 
		// pa ako su isti onda je palindrom
		int[] niz = new int[duzina];
		int[] referentni = new int[duzina];

		
		// Prosto, broj je palindrom ako se ispisuje isto u oba smera.
		// Najlaksi nacin je da ispisemo taj niz i drugi niz koji ide unazad i da ih uporedimo
		// Unosimo brojeve u niz.
		for (int i = 0; i < duzina; i++) { 
			System.out.println("Unesite " + (i + 1) + ". broj: ");
			int clan_niza = sc.nextInt();
			niz[i] = clan_niza;
			referentni[(duzina-1)-i] = clan_niza;
			
		}

		// Ispisujemo sve clanove niza, zbog preglednosti.
		System.out.println("");
		System.out.print("Niz cine clanovi : ");
		for (int i = 0; i < duzina; i++) System.out.print(niz[i]);
		
		System.out.println("");
		System.out.print("Niz ispisan unazad je : ");
		for (int i = 0; i < duzina; i++) System.out.print(referentni[i]);

		
		
		// Ispisi da li je palindrom. Uporedjujemo da li su isti elementi
		System.out.println("");
		if (Arrays.equals(niz, referentni)) System.out.println("Jeste palindrom");
		else System.out.println("Nije palindrom");
			
	}

}
