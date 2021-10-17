
public class ControleBonificacao {
	
	// Define a vari�vel para armazenar a soma de bonifica��es
	private double soma;
	
	// M�todo que recebe e acumula as bonifica��es
	public void registra(Funcionario $funcionario) {
		double bonificacao = $funcionario.getBonificacao();
		this.soma += bonificacao;
	}
	
	// M�todo que exibe a soma
	public double getSoma() {
		return soma;
	}

}
