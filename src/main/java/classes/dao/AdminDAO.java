package classes.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import classes.Admin;

public class AdminDAO {

	 public boolean authentifier(Admin Ad) throws SQLException
	    {
	      Connexion c = new Connexion(); //appel de connexion à la BD
	        PreparedStatement pst; 
	        pst = (PreparedStatement) c.conn.prepareStatement("SELECT * FROM `admin` WHERE `login`='"+Ad.getLogin()+"' AND password='"+Ad.getPassword()+"' "); // lister les admins
	        pst.executeQuery(); // lister les admins
	        ResultSet rs = (ResultSet) pst.executeQuery(); // stocker le résultat dans un resultset
	        if(rs.next()) {
	           // System.out.println(rs.getString("nom")); //teste d’affichage
	           return true;
	        }
	        else
	            return false;
	    
	    
	    }
	
	
	
}
