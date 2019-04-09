
public class Telefone {
	int idFone;
	String numFone;
	private Mensalista nome;
	
	public Telefone(){
		this.init();
		this.getnumFone();
		this.getidFone();
	}
	private void getnumFone() {
		
	}

	public void init() {
		System.out.println("Classe"+ this.getClass().getName()+ "instancia");
	}
	public void destroy() {
		
	}
	public void setIdFone(int idFone) {
		this.idFone = idFone;

	}
	public void setnumFone(String numFone) {
		this.numFone= numFone;
	}
	public int getidFone() {
		return this.idFone;
	}


}
