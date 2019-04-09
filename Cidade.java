
public class Cidade {
	int idCidade;
	String nomeCidade;
	private Estado e1;
	
	public Cidade() {
		this.init();
		this.getidCidade();
		this.getnomeCidade();
	}
	public void init() {
		System.out.println("Classe"+ this.getClass().getName()+ "instancia");
	}
	public void destroy() {
		
	}
	public void setidCidade(int idCidade) {
		this.idCidade = idCidade;

	}
	public void setnomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}
	public int getidCidade() {
		return this.idCidade;
	}
	public String getnomeCidade() {
		return this.nomeCidade;
	}
	
}