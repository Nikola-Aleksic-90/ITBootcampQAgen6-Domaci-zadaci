package Klikeri;

public class Main_netoda_Dete {

	public static void main(String[] args) {
		
		// Dete ima ime, prezime, broj godina i broj klikera. 
		// Napraviti mogucnost da se kreira vise objekata klase Dete. 
		// Ako se pozove metoda dodajKlikere ili metoda oduzmiKlikere, broj klikera se azurira.
		// Napraviti metodu koja ce ispisivati broj klikera i metodu koja ispisuje prosecan broj 
		// decjih godina(ako imamo troje dece, broj prosecnih godina za njih troje; 
		// ako imamo dvoje racunamo prosecne godine za to dvoje) .

		
		Dete nidza = new Dete("Nikola", "Aleksic", 29);
		Dete mikica = new Dete("Mali", "Mikica", 10);
		Dete miki = new Dete("Miki", "Mirijevac", 10);
		
		nidza.dodajKlikere(40000);
		mikica.dodajKlikere(10);
		mikica.oduzmiKlikere(2);
		miki.dodajKlikere(11);

		// " Napraviti metodu koja ce ispisivati broj klikera i metodu koja ispisuje prosecan broj 
		// decjih godina "
		// broj klikera lako dobijamo, prosto pozovem automatski generisanu metodu za geter
		// slicno(isto) cu odraditi za prosek godina, treba da dobijem 16.3333333333333333
		
		System.out.println("Ja imam " + nidza.getKlikeri() + " klikera");
		System.out.println("Mikica ima " + mikica.getKlikeri() + " klikera");
		System.out.println("Miki ima " + miki.getKlikeri() + " klikera");
		
		System.out.println("Prosek godina je: " + Dete.getGodine2() );
	}

}
