
/**
 * A classe Administrador extende a classe 
 * funcionário e implementa a interface autenticável
 * @author AllRox
 */
public class Administrador extends Funcionario implements Autenticavel {

	// Composição que define a variável para testes de autenticação
	private MetodoAutenticador autenticador;
	
	public Administrador() {
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
		return 50;
	}

}
