package cm.objis.gestionlivres.domaine;

public class Livre {
	//attributs
		private String titre;
		private String auteur;
		private int prix;
		private int nbPages;
		
		//contructeurs
		public Livre(String titre, String auteur, int prix, int nbPages) {
			this.titre=titre;
			this.auteur=auteur;
			this.prix=prix;
			this.nbPages=nbPages;
		}
		
		public Livre() {
			
		}

		//Getters et Setters
		public String getTitre() {
			return titre;
		}

		public void setTitre(String titre) {
			this.titre = titre;
		}

		public String getAuteur() {
			return auteur;
		}

		public void setAuteur(String auteur) {
			this.auteur = auteur;
		}

		public int getPrix() {
			return prix;
		}

		public void setPrix(int prix) {
			this.prix = prix;
		}

		public int getNbPages() {
			return nbPages;
		}

		public void setNbPages(int nbPages) {
			this.nbPages = nbPages;
		}

		  //methode toString
		  @Override
		  public String toString() {
			  return "Livre [titre=" + titre +
		  ", auteur=" + auteur + ", prix=" + prix + ", nbPages=" + nbPages + "]";
			  }
		 
}
