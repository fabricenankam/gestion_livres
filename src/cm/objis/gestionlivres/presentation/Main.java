package cm.objis.gestionlivres.presentation;

import cm.objis.gestionlivre.dao.AlbumDao;
import cm.objis.gestionlivre.dao.BDDao;
import cm.objis.gestionlivres.domaine.Album;
import cm.objis.gestionlivres.domaine.BD;
import cm.objis.gestionlivres.service.AlbumService;
import cm.objis.gestionlivres.service.BDService;

public class Main {

	public static void main(String[] args) {
		System.out.println("************ALBUM***********");
		Album al1 = new Album("saison blanche","eric dubois",310,100);
		AlbumService alSer1 = new AlbumService();
		alSer1.acheterUnAlbum(al1);
		
		Album al2 = new Album("deux chevaux","nankam",220,150);
		AlbumService alSer2 = new AlbumService();
		alSer2.revendreUnAlbum(al2);
		
		AlbumDao alDao1 = new AlbumDao();
		alDao1.updateAlbumByTitle("saison blanche");
		alDao1.deleteAlbumByTitle("trois cochons");
		
		System.out.println("************BD***********");
		BD bD1 = new BD("journal intime","mackenzie",125,50,true);
		BDService bdSer1 = new BDService();
		bdSer1.acheterUneBD(bD1);
		
		BD bD2 = new BD("troix chevaux","kamdem",165,70,true);
		bdSer1.revendreUneBD(bD2);
		
		BD bD3 = new BD("le voyage","kouam",170,100,false);
		BDDao bDDao1 = new BDDao();
		bDDao1.updateBd(bD3);
		bDDao1.deleteBD(bD1);
		
		
	}

}
