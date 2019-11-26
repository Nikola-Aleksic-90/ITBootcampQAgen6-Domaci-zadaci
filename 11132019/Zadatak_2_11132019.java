package domaci_zadatak_11132019;

import java.util.Scanner;

public class Zadatak_2_11132019 {

	public static void main(String[] args) {
		/* U zgradi se nalazi lift nosivosti 680kg. Napisati program koji proverava da li ce lift 
		   bezbedno krenuti u zavisnostii od tezine koju treba da ponese. Podrazumevane 3 opcije: 
		   Lift je preopterecen; 
		   Na granici je; 
		   Lift je pokrenut  
		   (zahtevi zadatka namerno nisu dalje razradjivani jer 
		   1) ostavljam vasoj masti na volju 
		   2) zelim da budem upucena u vas tok razmisljanja). 
		*/
		
		// definisanje i deklarisanje promenljive - nosivost lifta
		double nosivost = 0.68e3d;
		
		// unosenje mase ljudi/putnika u konzolu
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite masu ljudi u kilogramima: ");
		Double masa = sc.nextDouble();
        
		// provera unete vrednosti
		if (masa < 0) {
			System.out.println("Uneta vrednost ne sme biti negativna");
			System.exit(1);
		}
		
		// granjanje
		if (masa < nosivost)      System.out.println("Lift je pokrenut ");
		else if(masa == nosivost) System.out.println("Na granici je ");
		else if (masa > nosivost) System.out.println("Lift je preopterecen ");
		
	}
	
}
