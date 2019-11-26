import java.util.*;

public class Zadatak_0_11192019 {

	public static void main(String[] args) {
		// za zadatu duzinu niza preko konzole, uneti clanove niza i 
		// proveriti da li je svaki uneti clan palindrom
		
		
		
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

		
		
		int[] niz = new int[duzina];

		
		// Istovremeno i unosimo broj u niz i ispitujemo da li je taj uneti broj palindrom
		for (int i = 0; i < duzina; i++) {
			System.out.print("Unesite " + (i + 1) + ". broj: ");
			niz[i] = sc.nextInt();
			

			// Provera da li je uneti broj palindrom
			int b = niz[i]; // b sluzi za while petlju
			int moguci_palindrom = 0;
			int ostatak = 0;
			while (b != 0) {
				ostatak = b % 10;
				moguci_palindrom = (moguci_palindrom * 10) + ostatak;
				b = b / 10;
			}
			if (niz[i] == moguci_palindrom) System.out.println("Jeste palindrom");
			else System.out.println("Nije palindrom");
			
			
			
			// Drugi nacin za ispitivanje je: 		(izkomentarisi kod od 37-47 i pusti ovo)
			/*
			String moguci_palindrom = niz[i] + "";
		    boolean rezultat = moguci_palindrom.equals(new StringBuilder(moguci_palindrom).reverse().toString());
		    if (rezultat == true) System.out.println("Uneti broj je palindrom");
		    else System.out.println("Uneti broj nije palindrom");
			*/
		}

		
		
		// Konacno, ispisujemo sve clanove niza
		System.out.println("");
		System.out.print("Niz cine clanovi : ");
		for (int i = 0; i < duzina; i++) System.out.print(niz[i] + " ");
	
	}
	
}
