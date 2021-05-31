package classes.dao;

import java.sql.SQLException;

import classes.Client;

public class ClientDAO {

public void save (Client Cl) {
		
	
	 try {
		// TODO add your handling code here:
		            Connexion c = new Connexion();
		            String chaine ="INSERT INTO client(nom,prenom,email,adresse,telephone,codeapplication,solde) VALUES ('" + Cl.getNom()+ "','" + Cl.getPrenom() + "','" + Cl.getEmail() + "','" + Cl.getAdresse() + "','" + Cl.getTelephone() + "','" + Cl.getCodeapplication() + "','" +Cl.getSolde() +"')";
		            java.sql.PreparedStatement statement = c.conn.prepareStatement(chaine);
		            System.out.println(chaine);
		            statement.executeUpdate();
		            System.out.println("Client sauvergardé "+Cl.getEmail());
		        } catch (SQLException ex) {
		                        System.out.println(ex);

		        }
	
	
		
	}
	
}
