
public class ControleBonificacao {
	
	// Define a variável para armazenar a soma de bonificações
	private double soma;
	
	// Método que recebe e acumula as bonificações
	public void registra(Funcionario $funcionario) {
		double bonificacao = $funcionario.getBonificacao();
		this.soma += bonificacao;
	}
	
	// Método que exibe a soma
	public double getSoma() {
		return soma;
	}

}
