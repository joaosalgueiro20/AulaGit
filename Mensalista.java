
public class Mensalista {
	int idMen;
	String NomeMen;
	String CPF;
	public Mensalista(){
		this.init();
		this.getNomeMen();
		this.getidMen();
		this.getCPF();
	}
	
	
	public void init() {
		System.out.println("Classe"+ this.getClass().getName()+ "instancia");
	}
	public void destroy() {
		
	}
	public void setidMen(int idMen) {
		this.idMen = idMen;

	}
	public void setNomeMen(String NomeMen) {
		this.NomeMen= NomeMen;
	}
	private void setCPF(String CPF) {
		this.CPF = CPF ;
	}
	public int getidMen() {
		return this.idMen;
	}
	public String getNomeMen() {
		return this.NomeMen;
	}
	private String getCPF() {
		return CPF;
		
	}

}

