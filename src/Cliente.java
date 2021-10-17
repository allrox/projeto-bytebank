/**
 * A classe implementa obrigatoriamente 
 * os métodos concretos para a interface 'Autenticavel'
 * @author AllRox
 */

public class Cliente implements Autenticavel {

	// Composição que define a variável para testes de autenticação
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
