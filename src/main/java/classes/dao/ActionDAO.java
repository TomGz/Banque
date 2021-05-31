package classes.dao;

import java.sql.SQLException;

import classes.Action;

public class ActionDAO {

	public void save (Action act) {
		
	System.out.println("action ajoutéé avec succes "+act.toString());
		
		
	}
	
	public void addaction(Action act) {
		try {
			 Connexion c = new Connexion();
	         String chaine ="INSERT INTO actions(montant,type,id_client) VALUES ('" + act.getMontant()+ "','" + act.getType() + "','" + act.getIdclient() +"')";
	         java.sql.PreparedStatement statement = c.conn.prepareStatement(chaine);
	         System.out.println(chaine);
	         statement.executeUpdate();
	         System.out.println("Action sauvergardée "+ act.getId());
	     } catch (SQLException ex) {
	                     System.out.println(ex);

	     }
	}
	
	
}
