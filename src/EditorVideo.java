/**
 * Subclasse de Funcion�rio
 * @author AllRox
 *
 */
public class EditorVideo extends Funcionario {
	
	@Override
	public double getBonificacao() {
		return this.getSalario()*0.1;
	}	

}
