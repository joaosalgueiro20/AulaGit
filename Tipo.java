
public class Tipo {
	int idTipo;
	String descTipo;
	
	public Tipo(){
		this.init();
		this.getdescTipo();
		this.getidtipo();
	}
	
	public void init() {
		System.out.println("Classe"+ this.getClass().getName()+ "instancia");
	}
	public void destroy() {
		
	}
	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;

	}
	public void setdescTipo(String descTipo) {
		this.descTipo= descTipo;
	}
	public int getidtipo() {
		return this.idTipo;
	}
	public String getdescTipo() {
		return this.descTipo;
	}
}
