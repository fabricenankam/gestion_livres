package cm.objis.gestionlivre.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import cm.objis.gestionlivres.domaine.Album;

public class AlbumDao {
	
	public Album getAlbumByTittle(String title) {
		System.out.println("DAO : Recuperer un album dont le titre est : "+title);
		try {
			//étape1: récupération de la connexion
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/objisdb", "root", "anguissa");
			
			//étape2: préparation requête
			Statement statement = connection.createStatement();
			
			//étape3: exécution requete
			ResultSet resultset = statement.executeQuery("select titre,auteur,prix,nbpages from album where titre= 'saison blanche'");
			
			//parcours resultset (optionnel)
			while(resultset.next()) {
				System.out.println("le titre de cet album est : "+resultset.getString("titre")+" ; son auteur est : "+resultset.getString("auteur")+" ; son prix est : "+resultset.getInt("prix")+" ; son nombre de pages est : "+resultset.getInt("nbPages"));
			}
			
			//gestion des exception et libération automatique des ressources	
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//TODO Créer un album
	public Album createAlbum(Album album) {
		System.out.println("DAO : créer l'album : "+album);
		try {
			//étape1: recuperation de la connexion
			Connection cnt = DriverManager.getConnection("jdbc:mysql://localhost/objisdb","root","anguissa");
			
			//etape2: preparation requete
			Statement st = cnt.createStatement();
			
			//etape3: execution requete
			 st.executeUpdate("INSERT INTO album VALUES('deux chevaux','nankam',195,90)");
			
			 System.out.println("création effectuée avec succès!");
			// gestion des exception et liberation automatique des ressources
		}catch(SQLException e) {
			e.printStackTrace();
		}

		return null;
		}
	
	//TODO Mettre à jour un album
	public Album updateAlbumByTitle(String title) {
		System.out.println("Mettre à jour l'album dont le titre est : "+title);
		try {
			//etape1: creation d'une connexion
			Connection cnt = DriverManager.getConnection("jdbc:mysql://localhost/objisdb", "root", "anguissa");
			
			//etape2: preparation de la requete
			Statement st = cnt.createStatement();
			
			//etape3: execution de la requete
			st.executeUpdate("update album set titre='maison blanche', auteur='francis dupont', prix=350 where titre='saison blanche'");
			System.out.println("mis à jour terminée");
			
			//etape4: gestion des exceptions et liberation automatique des ressources
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	//TODO Supprimer un album
	public boolean deleteAlbumByTitle(String title) {
		System.out.println("DAO : Supprimer l'album dont le titre est : "+title);
		try {
			//etape1: creation d'une connexion
			Connection cnt = DriverManager.getConnection("jdbc:mysql://localhost/objisdb", "root", "anguissa");
			
			//etape2: preparation de la requete
			Statement st = cnt.createStatement();
		
			//etape3: execution de la requete
			st.executeUpdate("delete from album where titre='trois cochons'");
			System.out.println("operation terminée");
			
			//etape4: gestion des exceptions et liberation automatique des ressources
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	//TODO Recuperer tous les albums
	//ArrayList<Album> tousLesAlbums = new ArrayList<Album>();
	public ArrayList<Album> getAllAlbum(){
		System.out.println("DAO : recupérer tous les albums");
		try {
			//étape1: récupération de la connexion
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/objisdb", "root", "anguissa");
			
			//étape2: préparation requête
			Statement statement = connection.createStatement();
			
			//étape3: exécution requete
			ResultSet resultset = statement.executeQuery("select titre,auteur,prix,nbpages from album");
			
			//parcours resultset (optionnel)
			while(resultset.next()) {
				System.out.println("le titre de cet album est : "+resultset.getString("titre")+" ; son auteur est : "+resultset.getString("auteur")+" ; son prix est : "+resultset.getInt("prix")+" ; son nombre de pages est : "+resultset.getInt("nbPages"));
			}
			
			//gestion des exception et libération automatique des ressources	
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	

}
