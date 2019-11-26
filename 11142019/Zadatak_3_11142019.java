import java.util.*;

public class Zadatak_3_11152019 {

	public static void main(String[] args) {
		
		/* 
		Napisati program koji unosi i sabira brojeve dokle god nije unesen 
		negativan broj, i ispisuje njihov zbir (zbir pozitivnih brojeva).
        primer: ako korisnik unese 1 2 5 3 -1,  program treba da ispise 11
         */

		// Program moze da radi i sa pozitivnim realnim brojevima
		
		Scanner sc = new Scanner(System.in);
		Double broj;
		Double zbir = 0d;
		do {
			System.out.print("Unesite broj veci od nule ili negativni broj za reultat: ");
			while (!sc.hasNextDouble()) {
				System.out.print("To nije realni broj, pokusajte ponovo: ");
				sc.next();
			}
			broj = sc.nextDouble();
			zbir = zbir + broj;
		} while (broj >= 0);
		
		/* u zbir u petlji ce uci i poslednji negativni broj 
		koji prekida ciklus, zbog toga ide sledeca naredba */
		zbir = zbir - broj;		
		
		System.out.print("Zbir = " + zbir);
	
	}

}
