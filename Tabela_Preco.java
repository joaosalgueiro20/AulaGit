
public class Tabela_Preco {
	int idTP;
	double Valor;
	int Tempo;    
	
	public Tabela_Preco() {
		
			this.init();
			this.getidTP();
			this.getValor();
			this.getTempo();
		}		
	public void init() {
		System.out.println("Classe"+ this.getClass().getName()+ "instancia");
	}
	public void destroy() {
		
	}
	public void setidTP(int idTP) {
		this.idTP = idTP;

	}
	public void setValor(double Valor) {
		this.Valor= Valor;
	}
	public void setTempo(int Tempo) {
		this.Tempo = Tempo ;
		
		
	}
	public int getidTP() {
		return this.idTP;
	}
	public double getValor() {
		return this.Valor;
	}
	public int getTempo() {
		return Tempo;
		
	}

}
