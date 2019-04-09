
public class Veiculo {
	int idVeiculo;
	String Placa;
	String Cor;
	private Modelo mod;
	private Estadia estadia;
	private Men_As_Veic MAV;
	
	public Veiculo(){
		this.init();
		this.getPlaca();
		this.getidVeiculo();
		this.getCor();
		
	}
	
	public void init() {
		System.out.println("Classe"+ this.getClass().getName()+ "instancia");
	}
	public void destroy() {
		
	}
	public void setidVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;

	}
	public void setPlaca(String Placa) {
		this.Placa= Placa;
	}
	public void setCor(String Cor) {
		this.Cor= Cor;
	}
	
	public int getidVeiculo() {
		return this.idVeiculo;
	}
	public String getPlaca() {
		return this.Placa;
	}
	public String getCor() {
		return this.Cor;
	}
}
