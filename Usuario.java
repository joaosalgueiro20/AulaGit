
public class Usuario {
	int idUsuario;
	String nomeUsuario;
	String Senha;
	public Usuario(){
		this.init();
		this.getidUsuario();
		this.getnomeUsuario();
		this.getSenha();
	}
	
	
	public void init() {
		System.out.println("Classe"+ this.getClass().getName()+ "instancia");
	}
	public void destroy() {
		
	}
	public void setidUsuario(int idUsuario) {
		this.idUsuario = idUsuario;

	}
	public void setnomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	private void setSenha(String Senha) {
		this.Senha = Senha;
		
	}
	public int getidUsuario() {
		return this.idUsuario;
	}
	public String getnomeUsuario() {
		return this.nomeUsuario;
	}
	private String getSenha() {
		return Senha;
		
	}

}
	

