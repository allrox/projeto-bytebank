
/**
 * A classe Administrador extende a classe 
 * funcion�rio e implementa a interface autentic�vel
 * @author AllRox
 */
public class Administrador extends Funcionario implements Autenticavel {

	// Composi��o que define a vari�vel para testes de autentica��o
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
