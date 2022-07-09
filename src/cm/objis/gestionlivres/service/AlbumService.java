package cm.objis.gestionlivres.service;

import cm.objis.gestionlivre.dao.AlbumDao;
import cm.objis.gestionlivres.domaine.Album;

public class AlbumService {
	private AlbumDao albumDao;

	public AlbumService() {
		this.albumDao=new AlbumDao();
	}
	
	public Album acheterUnAlbum(Album album) {
		System.out.println("*****SERVICE : Achat d'un album : "+album);
		
		Album monAlbum = albumDao.getAlbumByTittle("maison blanche");
		return monAlbum;
	}
	
	/*public boolean colorierUnAlbum(Album album) {
		System.out.println("SERVICE : Coloriage de l'album : "+ album);		
		return true;
	}*/
	
	public boolean revendreUnAlbum(Album album) {
		System.out.println("*****SERVICE : Revendre l'album : "+ album);
		             albumDao.createAlbum(album);
		return true;
	}
	
}
