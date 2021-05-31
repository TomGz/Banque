package classes.service;

import Test.Validation;
import classes.Client;
import classes.dao.ClientDAO;

public class ClientService {

	private ClientDAO cldao = new ClientDAO();
	private Validation val=new Validation();
	
	
	public boolean save(Client Cl) {
		
		if (val.veriChaine(Cl.getNom()) && val.verifEmail(Cl.getEmail()) && val.verifTel(Cl.getTelephone()) && val.verifCodeApplication(Cl.getCodeapplication()) )
		{
			cldao.save(Cl);
			return true;
		}
		return false;
	}
	
}
