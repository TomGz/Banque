package Test;

import classes.Action;
import classes.Client;

public class Validation {

	public boolean verifLongueur1Chaine12(String ch) {
		
		return ch.length()>=12;
	}
	
	public boolean verifLoginAdmin(String login) {
		
		return verifLongueur1Chaine12(login);
	}
	
	public boolean verifPasswordAdmin(String pwd) {
		
		return verifLongueur1Chaine12(pwd);
	}
	
	public boolean veriChaine(String ch) {
		
		return !ch.isBlank();
	}
	
	public boolean verifEmail(String mail) {
		if (mail.contains("@") && mail.contains(".")) return true; else return false;
		
	}
	public boolean verifTel(String tel) {
		if (tel.contains("+") ) return true; else return false;
		
	}
	
	public boolean verifCodeApplication(int code ) {
		
		String verif=String.valueOf(code);
		if (verif.startsWith("282")) return true; else return false;
	}
	
	
	public boolean verifMontant(double montant) {
		
		if (montant>20) return true; else return false;
	}
	
	public boolean verifType(String type) {
		if (type.equals("retrait") || type.equals("versement")) return true; else return false;
	}
		
	public boolean verifAction (double montant,double solde) {
		return montant <= solde;
		
	}
	public int convertInt(String x) {
		return Integer.parseInt(x);
	}
	
	public double convertDouble(String y) {
		return Double.parseDouble(y);
	}
}
