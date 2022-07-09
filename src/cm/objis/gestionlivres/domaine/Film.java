package cm.objis.gestionlivres.domaine;

public class Film extends Livre {
	//attributs
	private int dureeFilm;

	//constructeur
	public Film(String titre, String auteur, int prix, int nbPages, int dureeFilm) {
		super(titre, auteur, prix, nbPages);
		this.dureeFilm=dureeFilm;
	}

	//methode toString
	@Override
	public String toString() {
		return "Film [dureeFilm=" + dureeFilm + ", toString()=" + super.toString() + "]";
	}
	

}
