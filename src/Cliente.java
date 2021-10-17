/**
 * A classe implementa obrigatoriamente 
 * os m�todos concretos para a interface 'Autenticavel'
 * @author AllRox
 */

public class Cliente implements Autenticavel {

	// Composi��o que define a vari�vel para testes de autentica��o
	private MetodoAutenticador autenticador;
	
	public Cliente() {
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
	

}
