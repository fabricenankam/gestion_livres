package cm.objis.gestionlivre.dao;

import cm.objis.gestionlivres.domaine.Film;

public class FilmDao {
	
	public Film acheterUnFilm(Film film) {
		System.out.println("Acheter le film : "+ film);
		return null;
	}
	
	public boolean revendreUnFilm(Film film) {
		System.out.println("Revendre le film : "+ film);
		return false;
	}

}
