
public class Personne {
	String nom;
	String prenom;
	int anNaissance;
	
    Personne (String n, String p, int a){
    	
    	nom=n;
    	prenom=p;
    	anNaissance= a;
    }
	

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", anNaissance=" + anNaissance + "]";
	}


	String format() {
		final int ANNEE_COURS = 2018;
		return " Nom: " + nom.toUpperCase() +
		"\n Prenom: " + prenom.substring(0,1).toUpperCase() + prenom.substring(1)+
		"\n Initiales: " + prenom.toUpperCase().charAt(0) +"."+nom.toUpperCase().charAt(0)+"." +
		"\n Age:" +( ANNEE_COURS - anNaissance);	
	}	 
}
