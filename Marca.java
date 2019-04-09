
public class Marca {
	private int idMarca;
	private String descMarca;
	
	public Marca(){
		this.init();
		this.getdescMarca();
		this.getidMarca();
	}
	
	public void init() {
		System.out.println("Classe"+ this.getClass().getName()+ "instancia");
	}
	public void destroy() {
		
	}
	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;

	}
	public void setdescMarca(String descMarca) {
		this.descMarca= descMarca;
	}
	public int getidMarca() {
		return this.idMarca;
	}
	public String getdescMarca() {
		return this.descMarca;
	}
}
