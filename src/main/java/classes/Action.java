package classes;

public class Action {

	private int id, idclient;

	private String dateheure; 
	private double montant;
	private String type;
	public int getId() {
		return id;
	}
	
	public int getIdclient() {
		return idclient;
	}

	public void setIdclient(int idclient) {
		this.idclient = idclient;
	}

	public void setDateheure(String dateheure) {
		this.dateheure = dateheure;
	}

	public void setId(int id) {
		this.id = id;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDateheure() {
		return dateheure;
	}
	public Action(int id, int id_client, String dateheure, double montant, String type) {
		super();
		this.id = id;
		this.idclient = id_client;
		this.dateheure = dateheure;
		this.montant = montant;
		this.type = type;
	}

	public Action() {
		super();
	}

	public Action(int id_client, String dateheure, double montant, String type) {
		super();
		this.idclient = id_client;
		this.dateheure = dateheure;
		this.montant = montant;
		this.type = type;
	}

	public Action(int idclient, double montant, String type) {
		super();
		this.idclient = idclient;
		this.montant = montant;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Action [id=" + id + ", idclient=" + idclient + ", dateheure=" + dateheure + ", montant=" + montant
				+ ", type=" + type + "]";
	}
	
	
	
	
}
