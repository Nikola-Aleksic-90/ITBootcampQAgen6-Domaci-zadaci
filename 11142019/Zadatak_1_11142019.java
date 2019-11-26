import java.util.*;

public class Zadatak_1_11152019 {

	public static void main(String[] args) {

		/*
		Zadatak: Napisati program koji na osnovu unete godine i meseca ispisuje
		koliko taj mesec ima dana. (Vodite racuna o prestupnoj godini!) - za
		resavanje ovog zadatka koristiti switch
		 */

		// Unos meseca:
		Scanner sc = new Scanner(System.in);
		int mesec;
		do {
			System.out.print("Unesite redni broj meseca u godini: ");
			while (!sc.hasNextInt()) {
				System.out.print("To nije ocekivani rezultat, pokusajte ponovo: ");
				sc.next();
			}
			mesec = sc.nextInt();
		} while (mesec <= 0);

		// Unos godine:
		Scanner sc2 = new Scanner(System.in);
		int godina;
		do {
			System.out.print("Unesite godinu: ");
			while (!sc2.hasNextInt()) {
				System.out.print("To nije ocekivani rezultat, pokusajte ponovo: ");
				sc2.next();
			}
			godina = sc2.nextInt();
		} while (godina <= 0);

		
		
		
		
		/* ----------------- NACIN 1, Klasika ----------------------
		switch (mesec) {

		case 1: System.out.println("Januar ima 31 dan"); break;
		case 2: 
			if (godina %4 == 0) System.out.println("Februar ima 29 dana"); 
			else if (godina %4 != 0)System.out.println("Februar ima 28 dana");
			break;
		case 3: System.out.println("Mart ima 31 dan"); break;
		case 4: System.out.println("April ima 30 dana"); break;
		case 5: System.out.println("Maj ima 31 dan"); break;
		case 6: System.out.println("Jun ima 30 dana"); break;
		case 7: System.out.println("Jul ima 31 dan"); break;
		case 8: System.out.println("Avgust ima 31 dan"); break;
		case 9: System.out.println("Septembar ima 30 dan"); break;
		case 10: System.out.println("Oktobar ima 31 dan"); break;
		case 11: System.out.println("Novembar ima 30 dan"); break;
		case 12: System.out.println("Decembar ima 31 dan"); break;

		default: System.out.println("Greska! Unesite broj meseca od 1 do 12"); break;
		}
		----------------------------------------------------------------*/
		
		
		
		
		
		/* Na W3Schools je dat primer sa nabrojanim markama automobila
		   umesto toga, ispisacemo mesece*/
		// array krece sa indeksiranjem nula, ne postoji nulti mesec
		
		String[] lista = {"", "Januar", "Februar", "Mart", "April",
				"Maj", "Jun", "Jul", "Avgust", "Septembar",
				"Oktobar", "Novembar", "Decembar"
				};
		
		int dani=0;
		
		switch (mesec) {

		case 1: case 3: case 5: case 7: case 8: case 10: case 12: dani = 31; break;
		case 2: 
			if (godina %4 == 0) dani = 29; 
			else if (godina %4 != 0) dani = 28;
			break;
		case 4: case 6: case 9: case 11:  dani = 30; break;

		default: System.out.println("Greska! Unesite broj meseca od 1 do 12"); break;
		}
		
		// Ukoliko se unese 15. mesec izbacuje error zbog liste koja ide do 12(13)
		if (mesec <= 12) System.out.println("Mesec " + lista[mesec] + " ima " + dani + " dana.");
		
	}

}
