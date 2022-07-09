package cm.objis.gestionlivres.domaine;

public class BD extends Livre {
	//attributs
	private boolean enCouleur;
	
	//constructeur
	public BD(String titre, String auteur, int prix, int nbPages, boolean enCouleur) {
		super(titre,auteur,prix,nbPages);
		this.enCouleur=enCouleur;
	}
	
	//getters et setters
	public boolean isEnCouleur() {
		return enCouleur;
	}

	public void setEnCouleur(boolean enCouleur) {
		this.enCouleur = enCouleur;
	}

	//methode toString
	@Override
	public String toString() {
		return "BD [enCouleur=" + enCouleur + ", toString()=" + super.toString() + "]";
	}
	
	

}
