
import java.util.*;

public class Zadatak_1_11152019 {

	public static void main(String[] args) {
		
		// Napisati program koji ce prebrojati koliko je brojeva od 
		// 9 do 250 (ukljucujuci i njih) deljivih brojem 3.
		
		int n = 0;
		for (int i=9 ; i<=250 ; i++) {
			if (i %3 == 0) {
				n = n+1; 
				System.out.print(i + " ");  // dobro je za proveru, ko sisa konzolu, nek rikne
			}		
		}
		System.out.println();
		System.out.println("Ima " + n + " brojeva deljivih sa 3");
	}
}
