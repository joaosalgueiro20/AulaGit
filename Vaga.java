
public class Vaga {
	int idVaga;
	String descVaga;
	public Vaga() {
		this.init();
		this.getidVaga();
		this.getdescVaga();	
	}	
	public void init() {
		System.out.println("Classe"+ this.getClass().getName()+ "instancia");
	}
	public void destroy() {	
	}
	public void setidVaga(int idVaga) {
		this.idVaga = idVaga;
	}
	public void setdescVaga(String descVaga) {
		this.descVaga= descVaga;
	}
	public int getidVaga() {
		return this.idVaga;
	}
	public String getdescVaga() {
		return this.descVaga;
	}

}
