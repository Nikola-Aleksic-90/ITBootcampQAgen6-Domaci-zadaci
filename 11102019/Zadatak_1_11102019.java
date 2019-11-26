package zadatak_1_11102019;

import java.util.Scanner;

public class Zadatak_1_11102019 {

	public static void main(String[] args) {
		
		// Nikola Aleksic domaci zadatak 1 10nov2019
		
		/* Zadatak: Napisi program koji ce racunati obim i povrsinu bazena, 
		   tako sto se stranice ucitavaju preko konzole. */
		
		// DOPUNA 1: Odredicemo i koliko litara vode staje u bazen na osnovu zapremine
		// DOPUNA 2: Postavljene granice za dimenzije
		// Dopuna 3: Dodao komentare za uslove

	Scanner sc = new Scanner(System.in);
	System.out.println("\n Unesite duzinu bazena u metrima: ");
	double duzina = sc.nextDouble();
	
    if (duzina > 100) {
       System.out.println("Jel to jos jedan Vucicev megalomanski projekat ?");
       System.out.println("Smanji malo pobogu, gde si video/la bazen od " + duzina + " metara");
       System.out.println("Ajde ponovo pokreni aplikaciju i potrudi se malo");
       System.exit(1);
    }
    if (duzina < 0) {
        System.out.println("Neko je ponovo pobrkao pilulice ?");
        System.out.println("Kako moze da duzina bude negativna od " + duzina + " metara ?");
        System.out.println("Ajde ponovo pokreni aplikaciju i potrudi se malo");
        System.exit(1);
    }
     
	Scanner sc1 = new Scanner(System.in);
	System.out.println("\n Unesite sirinu bazena u metrima: ");
	double sirina = sc1.nextDouble();
	
	if (sirina > 50) {
	       System.out.println("Sta hoces, da 4 vaterpolo tima igraju u isto vreme?");
	       System.out.println("Lakse malo, ne postoji bazen od " + sirina + " metara");
	       System.out.println("Ajde ponovo pokreni aplikaciju i potrudi se malo");
	       System.exit(1);
	}
	if (sirina < 0) {
	        System.out.println("LOGIKA.exe has stopped working ?");
	        System.out.println("Objasni mi kako bi ti konstruisao/la bazen sirine " + sirina + " metara");
	        System.out.println("Ajde ponovo pokreni aplikaciju i potrudi se malo");
	        System.exit(1);
	}
	
	Scanner sc2 = new Scanner(System.in);
	System.out.println("\n Unesite dubinu bazena u metrima: ");
	double dubina = sc2.nextDouble();
	
	if (dubina > 7) {
	       System.out.println("Ko ce da pliva u tom bazenu, ljudi ili ajkule ?");
	       System.out.println("Probaj da smislis neku logicnu dubinu, a ne " + dubina + " metara");
	       System.out.println("Ajde ponovo pokreni aplikaciju i potrudi se malo");
	       System.exit(1);
	}
	if (dubina < 0) {
	        System.out.println("Lebdeci bazen ?");
	        System.out.println("Nisi ti arapski seik pa da pravis cuda po pustinji, npr bazen dubine " + dubina + " metara");
	        System.out.println("Ajde ponovo pokreni aplikaciju i potrudi se malo");
	        System.exit(1);
	}
	
	double obim = 2 * duzina + 2 * sirina;
	double povrsina = duzina * sirina;
	double zapremina = duzina * sirina * dubina;
	double litri = zapremina * 1000;		// gustina vode je 1000 kg/m3 ; 1 kilogram vode = 1 litar ;
	
	System.out.println("Obim bazena je: " + obim + " metara");
	System.out.println("Povrsina bazena je: " + povrsina + " kvadratih metara");
	System.out.println("U bazen staje " + litri + " litara vode");
		   
	}

}
