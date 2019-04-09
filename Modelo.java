
public class Modelo {
	int idMod;
	String nomeMod;
	
	private Tipo tipo;
	private Marca marca;
	public Modelo(){
		this.init();
		this.getnomeMod();
		this.getidMod();
	}
	
	public void init() {
		System.out.println("Classe"+ this.getClass().getName()+ "instancia");
	}
	public void destroy() {
		
	}
	public void setidMod(int idMod) {
		this.idMod = idMod;

	}
	public void setnomeMod(String nomeMod) {
		this.nomeMod= nomeMod;
	}
	public int getidMod() {
		return this.idMod;
	}
	public String getnomeMod() {
		return this.nomeMod;
	}
}
