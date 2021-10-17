
public class TesteReferencias {

	public static void main(String[] args) {
		
		// Instanciando um objeto a partir da classe Gerente
		Gerente gerente1 = new Gerente();
		
		// Utilizando setters para popular o objeto
		gerente1.setNome("João");
		gerente1.setSalario(7000.0);
		
		// Instanciando um objeto a partir da classe EditorVideo
		EditorVideo editor1 = new EditorVideo();
		
		// Utilizando setters para popular o objeto
		editor1.setNome("André");
		editor1.setSalario(5000.0);
		
		// Instanciando um objeto a partir da classe Designer
		Designer designer1 = new Designer();
		
		// Utilizando setters para popular o objeto
		designer1.setNome("Maria");
		designer1.setSalario(4800.0);
		
		// Instanciando um objeto acumulador para o valores de bonificação
		ControleBonificacao controle = new ControleBonificacao();
		
		// Registra os salários 
		controle.registra(gerente1);
		System.out.println(gerente1.getNome() + " - R$ " + gerente1.getBonificacao());
		controle.registra(editor1);
		System.out.println(editor1.getNome() + " - R$ " + editor1.getBonificacao());
		controle.registra(designer1);
		System.out.println(designer1.getNome() + " - R$ " + designer1.getBonificacao());
		
		System.out.println("\nTotal em Bônus: R$ " + controle.getSoma());
		
	}

}
