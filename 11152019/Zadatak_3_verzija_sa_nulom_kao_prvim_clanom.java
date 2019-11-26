import java.util.Scanner;

public class Zadatak_3_verzija_sa_nulom_kao_prvim_clanom {

	public static void main(String[] args) {
		
		System.out.println("Unesite broj clanova Fibonacijevog niza: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int pomoc = 0; 	// Samo kao pomocna promenjiva
		int clan = 1;	/* Za sve ostale inferiorne nauke 
					 	gde niz pocinje od nule, dakle 0 1 1 2 3 ... */
	    
        for (int i = 1; i <= n; i++) 
        { 
            System.out.print(pomoc + " "); 
            int sledeci_clan = pomoc + clan; 
            pomoc = clan; 
            clan = sledeci_clan;
        }
	}

}
