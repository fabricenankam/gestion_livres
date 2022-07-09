package cm.objis.gestionlivre.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import cm.objis.gestionlivres.domaine.BD;

public class BDDao {
	
	//TODO recup�rer une bd
	public BD getBDByTitle(String title) {
		System.out.println("DAO : Acheter la bd dont le titre est : "+ title);
		try {
			//�tape1: r�cup�ration de la connexion
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/objisdb", "root", "anguissa");
			
			//�tape2: pr�paration requ�te
			Statement statement = connection.createStatement();
			
			//�tape3: ex�cution requete
			ResultSet resultset = statement.executeQuery("select titre,auteur,prix,nbpages,encouleur from bd where titre= 'journal intime'");
			
			//parcours resultset (optionnel)
			while(resultset.next()) {
				System.out.println("le titre de cette Bande dessin�e est : "+resultset.getString("titre")+" ; son auteur est : "+resultset.getString("auteur")+" ; son prix est : "+resultset.getInt("prix")+" ; son nombre de pages est : "+resultset.getInt("nbPages")+" ; en couleur? : "+resultset.getBlob("encouleur"));
			}
			
			//gestion des exception et lib�ration automatique des ressources	
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	  //TODO Cr�er une bd 
	  public boolean createBD(BD bD) {
	  System.out.println("DAO : Revendre la db : "+ bD);
	  try {
			//�tape1: recuperation de la connexion
			Connection cnt = DriverManager.getConnection("jdbc:mysql://localhost/objisdb","root","anguissa");
			
			//etape2: preparation requete
			Statement st = cnt.createStatement();
			
			//etape3: execution requete
			 st.executeUpdate("INSERT INTO bd VALUES('cinq chevaux','zambo',125,20,true)");
			
			 System.out.println("cr�ation effectu�e avec succ�s!");
			// gestion des exception et liberation automatique des ressources
		}catch(SQLException e) {
			e.printStackTrace();
		}
	  return false; 
	  }
	  
	  //TODO Mise � jour d'une bd 
	  public BD updateBd(BD bD) {
			System.out.println("Mettre � jour la bande dessin�e : "+bD.toString());
			try {
				//etape1: creation d'une connexion
				Connection cnt = DriverManager.getConnection("jdbc:mysql://localhost/objisdb", "root", "anguissa");
				
				//etape2: preparation de la requete
				Statement st = cnt.createStatement();
				
				//etape3: execution de la requete
				st.executeUpdate("update album set titre='saison pluvieuse', auteur='gustave mvogo', prix=220,encouleur=false where titre='le voyage'");
				System.out.println("mis � jour termin�e");
				
				//etape4: gestion des exceptions et liberation automatique des ressources
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
	  }
			
	  //TODO supprimer une bd
	  public boolean deleteBD(BD bD) {
			System.out.println("DAO : Supprimer l'album : "+bD);
			try {
				//etape1: creation d'une connexion
				Connection cnt = DriverManager.getConnection("jdbc:mysql://localhost/objisdb", "root", "anguissa");
				
				//etape2: preparation de la requete
				Statement st = cnt.createStatement();
			
				//etape3: execution de la requete
				st.executeUpdate("delete from bd where titre='journal intime'");
				System.out.println("operation termin�e");
				
				//etape4: gestion des exceptions et liberation automatique des ressources
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return true;
		}
	  
	  //TODO Recuperer toutes les bds
	  public ArrayList<BD> getAllBD(){
			System.out.println("DAO : recup�rer toutes les bandes");
			try {
				//�tape1: r�cup�ration de la connexion
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/objisdb", "root", "anguissa");
				
				//�tape2: pr�paration requ�te
				Statement statement = connection.createStatement();
				
				//�tape3: ex�cution requete
				ResultSet resultset = statement.executeQuery("select titre,auteur,prix,nbpages,encouleur from bd");
				
				//parcours resultset (optionnel)
				while(resultset.next()) {
					System.out.println("le titre de cette bande est : "+resultset.getString("titre")+" ; son auteur est : "+resultset.getString("auteur")+" ; son prix est : "+resultset.getInt("prix")+" ; son nombre de pages est : "+resultset.getInt("nbPages")+" ; en couleur? : "+resultset.getBoolean("enCouleur"));
				}
				
				//gestion des exception et lib�ration automatique des ressources	
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return null;
		}
		
	 
}
