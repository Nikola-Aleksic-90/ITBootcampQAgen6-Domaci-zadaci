import java.util.Scanner;

public class Zadatak_2_11152019 {

	public static void main(String[] args) {
		
		// Napravi program koji ce na izlazu izbaciti sliku pravougaonika od zvezdica:
		// Primer: ulaz     m=3, n=7;
		// Izlaz (vidljivo u konzoli)
		// Hint: koristiti dve for petlje

		System.out.println("Unesite broj redova: ");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		
		System.out.println("Unesite broj kolona: ");
		Scanner sc2 = new Scanner(System.in);
		int n= sc2.nextInt();
		
		for (int i=0; i < m; i++) {
			for (int j=0; j < n; j++) {
				System.out.print("*   ");
			}
			System.out.println("");
		}
			
	}

}
