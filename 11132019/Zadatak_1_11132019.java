package domaci_zadatak_11132019;

import java.util.Scanner;

public class Zadatak_1_11132019 {

	public static void main(String[] args) {
		// Napisati program koji proverava da li je uneti broj paran ili neparan. Ukoliko jeste, program treba da 
		// ispise poruku: Broj je paran! Ukoliko nije, program treba da ispise poruku: Broj je neparan!
		
		// Kod ce se izvrsavati dok se ne unese pozitivan prirodan broj
		
		// Jelena, Pronasao sam nacin da sprecim korisnike da unesu, npr. abcdef ili razlomak umesto broja a da ne 
		// izbaci error i zaustavi/stopira program, a uz to i da ne radim exeption-e, handeling-e ili kako se vec zovu.
		
		Scanner sc = new Scanner(System.in);
		long broj;
		do {
		    System.out.print("Unesite pozitivnu celobrojnu vrednost: ");
		    while (!sc.hasNextLong()) {
		        System.out.print("To nije prirodni broj, pokusajte ponovo: ");
		        sc.next();
		    }
		    broj = sc.nextInt();
		} while (broj <= 0);
		
		if (broj%2 == 0) System.out.print("\nBroj "+ broj + " + je paran! ");
		else if (broj%2 == 1) System.out.print("\nBroj " + broj + " je neparan! ");
		
	}

}
