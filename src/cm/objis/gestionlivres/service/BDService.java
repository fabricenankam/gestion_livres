package cm.objis.gestionlivres.service;

import cm.objis.gestionlivre.dao.BDDao;
import cm.objis.gestionlivres.domaine.BD;

public class BDService {
	private BDDao bDDao;
	
	public BDService() {
		this.bDDao = new BDDao();
	}
	
	public BD acheterUneBD(BD bD) {
		System.out.println("SERVICE : Acheter la bd : "+ bD);
		  BD maBD = bDDao.getBDByTitle("journal intime");
		return maBD;
	}
	
	public boolean revendreUneBD(BD bD) {
		System.out.println("SERVICE : Revendre la db : "+ bD);
	                bDDao.createBD(bD);	
		return false;
	}
	
	public BD echangerUneBD(BD bD) {
		System.out.println("Echanger la bd : "+ bD);
		return null;
	}


}
