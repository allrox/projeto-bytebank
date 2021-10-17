
/**
 * Classe abstrata, não é permitido instanciá-la 
 * @author AllRox
 *
 */
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	/**
	 * Método abstrato. Não possui corpo, 
	 * indicando que todas as subclasses precisam reescrevê-lo 	
	 * @return
	 */
	public abstract double getBonificacao();
	
	/**
	 * Getter Nome
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Setter Nome
	 * @return
	 */
	public String getNome() {
		return nome;
	}
	
	/** 
	 * Setter CPF
	 * @param cpf
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	/**
	 * Getter CPF
	 * @return
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * Setter Salário
	 * @param salario
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	/**
	 * Getter Salário
	 * @return
	 */
	public double getSalario() {
		return salario;
	}
		

}
