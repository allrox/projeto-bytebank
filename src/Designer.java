/**
 * Subclasse de Funcionário
 * @author AllRox
 *
 */
public class Designer extends Funcionario {
	
	@Override
	public double getBonificacao() {
		return this.getSalario()*0.1;
	}	

}
