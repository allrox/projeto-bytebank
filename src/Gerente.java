
/**
 * A classe Gerente extende a classe 
 * funcionário e implementa a interface autenticável
 * @author AllRox
 */
public class Gerente extends Funcionario implements Autenticavel {
	
	// Composição que define a variável para testes de autenticação
	private MetodoAutenticador autenticador;
	
	public Gerente() {
		this.autenticador = new MetodoAutenticador();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);	
	}
	
	@Override
	public double getBonificacao() {
		return this.getSalario()*0.2;
	}
}
