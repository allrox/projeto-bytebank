/**
 * Subclasse de Funcionário
 * @author AllRox
 *
 */
public class EditorVideo extends Funcionario {
	
	@Override
	public double getBonificacao() {
		return this.getSalario()*0.1;
	}	

}
