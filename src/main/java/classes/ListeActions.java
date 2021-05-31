package classes;

import java.util.ArrayList;
import java.util.List;

public class ListeActions {

	static List<Action> listActions = new ArrayList<Action>();
	
	
	public void ajouterAction (Action a) {
		listActions.add(a);
	}
	
	public void afficherActions() {
		for (Action a : listActions) {
			System.out.println(a.toString());
		}
	}
	
	public Action findActionByUserID(int id) {
		for (Action a : listActions) {
			if (a.getIdclient()==id) return a;
		}
		return null;
	}
	
}
