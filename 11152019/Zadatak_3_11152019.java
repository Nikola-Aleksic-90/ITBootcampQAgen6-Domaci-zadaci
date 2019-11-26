import java.util.Scanner;

public class Zadatak_3_11152019 {

	public static void main(String[] args) {
		// Napisati program koji ce ispisati n brojeva Fibonacijevog niza.
		// (Na internetu istraziti sta je Fibonacijev niz!!!)
		
		System.out.println("Unesite broj clanova Fibonacijevog niza: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int pomoc = 0; 	// Samo kao pomocna promenjiva
		int clan = 1;	// Masincima niz pocinje od 1, dakle 1 1 2 3 ...
	    
        for (int i = 1; i <= n; i++) 
        { 
            System.out.print(clan + " "); 
            int sledeci_clan = pomoc + clan; 
            pomoc = clan; 
            clan = sledeci_clan;
        }
	}

}
