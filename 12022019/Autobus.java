import java.util.ArrayList;

public class Autobus {

	private String naziv;
	private Vozac vozac;
	private int cena;
	private int sedista;
	private ArrayList <Putnik> putnici;
	private boolean vozac_u_autobusu;
	
	public Autobus(String naziv, int cena, int sedista) {
		this.naziv = naziv;
		this.cena = cena;
		this.sedista = sedista;
		putnici = new ArrayList <Putnik> ();
	}

	public Vozac getVozac() {
		return vozac;
	}

	public void postaviVozaca(Vozac vozac) {
		System.out.println("Novi Vozac je: " + vozac.getIme());
		this.vozac = vozac;
		vozac_u_autobusu = true;
	}
	
	public void izbaciVozaca(Vozac v) {
		System.out.println(vozac.getIme() + " vise nije vozac");
		this.vozac_u_autobusu = false;
	}

	public int getCena() {
		return cena;
	}

	public int getSedista() {
		return sedista;
	}
	
	public void izbaciVozaca() {
		System.out.println("Prethodni vozac je bio : " + getVozac() + ". Postavite novog");	
		this.vozac = null;
	}
	
	public void dodajPutnika(Putnik p) {
		if (putnici.size() <= sedista){
			putnici.add(p);
			System.out.println("Uspesno dodat putnik " + p.getIme());
		}
		else System.out.println("Sva sedista su popunjena");
	}
	
	public void izbaciPutnika (Putnik p) {
		putnici.remove(p);
		System.out.println("Uspesno oduzet putnik " + p.getIme());
	}

	public void ispisiPutnike() {
		System.out.print("Trenutni putnici su: ");
		System.out.print("[ ");
		for (int i = 0; i < putnici.size(); i++) {
			Putnik p = putnici.get(i);
			System.out.print(p.getIme() + " ");
		}
		/* Moze i :
		for (Putnik p : putnici) {
			System.out.println(p.getIme() + " ");
		}
		*/
		System.out.println("]");
	}
	
	public void pokreniVoznju() {
		if (vozac_u_autobusu == true) {
			System.out.print("Stigli na odrediste. Sledecim putnicima je naplacena karta : ");
			for (Putnik p : putnici) {
				p.oduzmiNovac(cena);
				System.out.println(p.getIme() + " ");
			}
		}
		else System.out.println("Niste postavili vozaca");
	}
	
}
