import java.security.Timestamp;

public class Estadia {
	int idEstadia;
	Timestamp Inicio;
	Timestamp Termino;
	private Veiculo Placa;
	private Vaga vag;
	private Tabela_Preco tp;
	
	public Estadia(){
		this.init();
		this.getidEstadia();
		this.getInicio();
		this.getTermino();

	}
	
	
	public void init() {
		System.out.println("Classe"+ this.getClass().getName()+ "instancia");
	}
	public void destroy() {
		
	}
	public void setidEstadia(int idEstadia) {
		this.idEstadia = idEstadia;

	}
	public void setInicio(Timestamp Inicio) {
		this.Inicio= Inicio;
	}
	public int getidEstadia() {
		return this.idEstadia;
	}
	public Timestamp getInicio() {
		return this.Inicio;
	}
	private Timestamp getTermino() {
		return this.Termino;
		
	}

}

