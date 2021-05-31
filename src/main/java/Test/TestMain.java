package Test;

import classes.Action;
import classes.Client;
import classes.dao.ActionDAO;
import classes.dao.ClientDAO;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ClientDAO Cldao=new ClientDAO();
//		Client Cl = new Client("gout","toto","tot@tt.fr","adresse","+335555",28234,100);
//		Cldao.save(Cl);
		
		ActionDAO actdao = new ActionDAO();
		Action a =new Action(1,300,"versement");
		actdao.addaction(a);
		
	}

}
