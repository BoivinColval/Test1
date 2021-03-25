
public class ListePersonnes {
	
	final int MAX= 100;
	Personne[] liste;
	int nb;
	
	ListePersonnes(){
		
		liste= new Personne [MAX];
		nb=0;
	}
	
	void ajouter (Personne p) {
		
		if (nb< MAX) {
			liste[nb]= p;
		    nb++;
		}
	}
	
	
	void afficher () {
		
		for (int i=0;  i<nb; i++)
			System.out.println("\n -----------------------\n" + liste[i].format() + "\n -----------------------");
	}

}
