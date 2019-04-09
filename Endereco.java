
public class Endereco {
	int idCEP;
	String nomeEndereco;
	String Logradouro;
	int Num;
	String Complemento;
	private Cidade cid;
	private Mensalista men;
	
	public Endereco() {
		this.init();
		this.getnomeEndereco();
		this.getidCEP();
		this.getLogradouro();
		this.Num();
		this.getComplemento();
	}
	
	public void init() {
		System.out.println("Classe"+ this.getClass().getName()+ "instancia");
	}
	public void destroy() {
		
	}
	public void setnomeEndereco(String nomeEndereco) {
		this.nomeEndereco = nomeEndereco;
	}
	
	public void setidCEP(int idCEP) {
		this.idCEP= idCEP;
	}
	public void setLogradouro(String Logradouro) {
		this.Logradouro = Logradouro ;	
	}
	public void setNum(int Num) {
		this.Num = Num;
	}
	public void setComplemento(String Complemento) {
		this.Complemento = Complemento;
	}
	public String getnomeEndereco() {
		return this.nomeEndereco;
	}
	public int getidCEP() {
		return this.idCEP;
	}
	public String getLogradouro() {
		return this.Logradouro ;
	}
	public int Num() {
		return this.Num;
	}
	public String getComplemento() {
		return this.Complemento;
	}
}
