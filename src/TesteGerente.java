
public class TesteGerente {

	public static void main(String[] args) {
					
		// Instanciando um objeto a partir da classe Gerente
		Gerente gerente1 = new Gerente();
		
		// Utilizando setters para popular o objeto
		gerente1.setNome("Jo�o da Silva");
		gerente1.setCpf("235.568.413-00");
		gerente1.setSalario(5000.0);
		
		// Utilizando getters para exibir atributos
		System.out.println("Nome: " + gerente1.getNome());
		System.out.println("CPF: " + gerente1.getCpf());
		System.out.println("Sal�rio: R$ " + gerente1.getSalario());
		System.out.println("Bonifica��o: R$ " + gerente1.getBonificacao());
		
		// Criando vari�vel local e a fun��o para exibir a remunera��o total
		double remuneracaoTotal = (gerente1.getSalario())+(gerente1.getBonificacao());
		System.out.println("\n------------------------------");
		System.out.println("Remunera��o Total : R$" + remuneracaoTotal);

	}

}
