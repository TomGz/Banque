package classes;

import java.util.ArrayList;
import java.util.List;

public class ListeClients {

	static List<Client> listCl = new ArrayList<Client>();	
	
	public void ajoutClient( Client Cl) {
		
		listCl.add(Cl);
	}
	
	
	public void afficherClients() {
		
		for (Client e : listCl) {
			System.out.println(e.toString());
		}
	}
	
	public Client findClientbyID(int id) {
		
		for (Client e : listCl) {
			if (e.getId()==id) return e;
		};
		return null;
		
	}
	
}
