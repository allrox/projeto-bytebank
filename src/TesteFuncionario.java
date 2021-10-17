/**
 * Classe para teste
 * @author AllRox
 *
 */
public class TesteFuncionario {

	public static void main(String[] args) {
		
		// Instanciando um objeto a partir da classe Gerente
		Gerente nico = new Gerente();
		
		// Utilizando setters para popular o objeto
		nico.setNome("Nico Steppat");
		nico.setCpf("223355646-9");
		nico.setSalario(2600.00);

		// Utilizando getters para exibir atributos
		System.out.println("Nome: " + nico.getNome());
		System.out.println("Bonificação: R$ " + nico.getBonificacao());
				
	}

}
