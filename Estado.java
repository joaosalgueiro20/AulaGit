
public class Estado {
	int idEstado;
	String nomeEstado;
	char sigla [];
	
	public Estado(){
		this.init();
		this.getnomeEstado();
		this.getidEstado();
		this.getsigla();
	}
	
	public void init() {
		System.out.println("Classe"+ this.getClass().getName()+ "instancia");
	}
	public void destroy() {
		
	}
	public void setidEstado(int idEstado) {
		this.idEstado = idEstado;

	}
	public void setnomeEstado(String nomeEstado) {
		this.nomeEstado= nomeEstado;
	}
	private void setsigla() {
		this.sigla = new char[2] ;	
	}
	public int getidEstado() {
		return this.idEstado;
	}
	public String getnomeEstado() {
		return this.nomeEstado;
	}
	private char getsigla() {
		return 0;
	}

}
  