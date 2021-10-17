
public class TesteAcesso {

	public static void main(String[] args) {

		// Instanciando novo objeto a partir da classe SistemaInterno
		SistemaInterno sistema = new SistemaInterno();

		// Instanciando novo objeto a partir da classe Gerente
		Gerente gerente1 = new Gerente();
		gerente1.setSenha(2122);
		
		// Instanciando novo objeto a partir da classe Administrador
		Administrador adm1 = new Administrador();
		adm1.setSenha(2222);
		
		// Instanciando novo objeto a partir da classe Cliente
		Cliente cliente = new Cliente();
		cliente.setSenha(2222);
		
		// Exibindo os dados do teste
		System.out.println("Tentativa de login do Gerente");
		sistema.autentica(gerente1);
		System.out.println("\nTentativa de login do Administrador");
		sistema.autentica(adm1);
		System.out.println("\nTentativa de login do Cliente");
		sistema.autentica(cliente);
	}

}
