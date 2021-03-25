import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	//création de l'objet listePersonnes
	
	ListePersonnes l = new ListePersonnes();
	
	Scanner keyb= new Scanner (System.in);
		
	String entree, delim;
	String[] tokens;	
	
	
	int nbPersonnes;
	System.out.print("Entrer le nombre de personnes à saisir ---> ");
	nbPersonnes= keyb.nextInt(); 
	keyb.nextLine(); 
	
	// saisie des personnes 
	for (int i=0; i<nbPersonnes; i++) {
		
		System.out.println("\n Entrer les informations de la personne "+ (i+1));
		entree= keyb.nextLine();
	
		delim="[ ]+";	
		tokens=entree.split(delim);
				
		// création d'un  objet Personne et son ajout dans l'objet ListePersonnes
	    l.ajouter(new Personne (tokens[0],tokens[1],Integer.parseInt(tokens[2]) ));
	}
	
	
	keyb.close();
	
	
	//affichage des personnes selon le format demandé
	l.afficher();
	}

}
