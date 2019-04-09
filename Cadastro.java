import javax.swing.JOptionPane;
import java.util.Scanner;
public class Cadastro {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Menu Principal:");
		System.out.println("Escolha");
		System.out.println("1, para Cadastro");
		System.out.println("2, para Sistema");
		System.out.println("0, para Sair");
		int options = 0;
		
		do {
			options = Integer.parseInt(null, options);
			switch(options) {
			case 1:
				System.out.println("Menu Cadastro:");
				System.out.println("Escolha");
				System.out.println("1, para Cadastrar Colaborador");
				System.out.println("2, para Cadastrar Mensalista");
				System.out.println("0, para Voltar ao Menu Principal");
				int opCad = 0;
				switch(opCad) {
				case 1:
					System.out.println("informe nome do Usuario");
					Usuario usuario = new Usuario();
					s.nextLine();
					s = new Scanner(System.in);
					System.out.println("informe a Senha");
					Usuario Senha = new Usuario();
					s.nextLine();
					s = new Scanner(System.in);
					Usuario id;
					usuario.idUsuario++;
				case 2:
					System.out.println("Informe o Nome do Mensalista");
					Mensalista nome = new Mensalista();
					s.nextLine();
					s = new Scanner(System.in);
					System.out.println("Informe o Numero de CPF do Mensalista");
					Mensalista CPF = new Mensalista();
					s.nextLine();
					nome.id++;
					s = new Scanner(System.in);
					System.out.println("Informe o Telefone do Mensalista");
					Telefone num = new Telefone();
					s.nextLine();
					s = new Scanner(System.in);
					num.id++;
					
					
				}opCad = s.nextInt();
					if(opCad <0 || opCad >2) {
						System.out.println("Opção Invalida!");
					}else if(opCad == 0) {
						continue ;
					}
				
					
			 default:
	                JOptionPane.showMessageDialog(null, "Opcao invalida");
			}
		}while(options !=0);
		options = s.nextInt();

		
	}
}
