
/**
 * M�todo criado para reaproveitamento do c�digo de autentica��o
 * @author AllRox
 *
 */
public class MetodoAutenticador {
	
	//Define a vari�vel para guardar a senha
	private int senha;
	
	/**
	 * Setter Senha
	 * @param senha
	 */
	public void setSenha(int senha) {
		this.senha = senha;
		
	}
	
	/**
	 * M�todo de autentica��o
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
