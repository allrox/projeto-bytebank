
/**
 * Método criado para reaproveitamento do código de autenticação
 * @author AllRox
 *
 */
public class MetodoAutenticador {
	
	//Define a variável para guardar a senha
	private int senha;
	
	/**
	 * Setter Senha
	 * @param senha
	 */
	public void setSenha(int senha) {
		this.senha = senha;
		
	}
	
	/**
	 * Método de autenticação
	 * @param senha
	 * @return
	 */
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else { 
		return false;
		}
	}

}
