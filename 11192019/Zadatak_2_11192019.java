import java.util.Scanner;

public class Zadatak_2_11192019 {

	public static void main(String[] args) {
		// Napisati program koji ce na standardnom izlazu ispisati proizvod elemenata
		// niza koji su veci od svog indeksa (preko konzole uneti duzinu i clanove niza)

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
		
		Double[] niz = new Double[duzina];
		Double proizvod = 1d;
		
		// Istovremeno i unosimo broj u niz i ispitujemo da li je taj uneti broj veci od indeksa
		for (int i = 0; i < duzina; i++) {
			System.out.print("Unesite " + (i + 1) + ". broj: ");
			niz[i] = sc.nextDouble();
			if (niz[i] > i) proizvod = proizvod * niz[i];
			
		}
		for (int i = 0; i < duzina; i++) System.out.print(niz[i] + " ");
		System.out.println("");
		System.out.println("Proizvod je : " + proizvod);
	}

}
