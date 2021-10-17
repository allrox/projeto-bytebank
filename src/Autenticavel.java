/**
 * Interface -> Uma classe abstrata com todos os métodos também abstratos
 * Importante: Não pode conter métodos concretos!
 * @author AllRox
 */
public abstract interface Autenticavel {
	
	// Contém apenas as assinaturas dos métodos
	public abstract void setSenha(int senha);
	public abstract boolean autentica(int senha);

}