
import java.util.*;
public class Zadatak_2_11152019 {

	public static void main(String[] args) {
		
		/*Napisati program koji racuna sumu parnih brojeva i proizvod neparnih 
		brojeva od 0 do n - za resavanje ovog zadatka koristiti samo jednu 
		petlju (ne jednu vrstu petlje, vec samo jednu petlju)
		*/

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite pozitivan prirodan broj");
		int SAMO_POZITIVAN_INTEGER = sc.nextInt();
		int suma_parnih = 0;
		int proizvod_neparnih = 1;
		int i = 1;
		
		while (i <= SAMO_POZITIVAN_INTEGER) {
			
			if (i %2 == 0) suma_parnih = suma_parnih + (i);
			if (i %2 == 1) proizvod_neparnih = proizvod_neparnih * (i);
			
		i=i+1;
		
		}
		
		System.out.println("Suma parnih brojeva je " + suma_parnih);
		System.out.println("Proizvod neparnih brojeva je "+ proizvod_neparnih);
		
	}

}
