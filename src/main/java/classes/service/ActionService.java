package classes.service;

import Test.Validation;
import classes.Action;
import classes.Client;
import classes.dao.ActionDAO;

public class ActionService {

	private ActionDAO actDAO= new ActionDAO();
	private Validation val=new Validation();
	
	public boolean save(Action act,Client cl) {
		
		if (val.veriChaine(act.getType()) &&val.verifMontant(act.getMontant()) && val.verifType(act.getType()) ){
			
			if (val.verifAction( act.getMontant(),cl.getSolde())) {
				actDAO.save(act);
				return true;
			}
						
		}
		return false;
	}
	
}
