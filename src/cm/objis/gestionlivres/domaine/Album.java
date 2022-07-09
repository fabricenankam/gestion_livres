package cm.objis.gestionlivres.domaine;

public class Album extends Livre {
    //constructeur
	public Album(String titre, String auteur, int prix, int nbPages) {
		super(titre, auteur, prix, nbPages);
	}
	
	public Album() {
		super();
		
	}

	//methode toString
	@Override
	public String toString() {
		return "Album [toString()=" + super.toString() + "]";
	}

	
}
