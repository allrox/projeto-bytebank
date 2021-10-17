
/**
 * Classe abstrata, n�o � permitido instanci�-la 
 * @author AllRox
 *
 */
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	/**
	 * M�todo abstrato. N�o possui corpo, 
	 * indicando que todas as subclasses precisam reescrev�-lo 	
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
	 * Setter Sal�rio
	 * @param salario
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	/**
	 * Getter Sal�rio
	 * @return
	 */
	public double getSalario() {
		return salario;
	}
		

}
