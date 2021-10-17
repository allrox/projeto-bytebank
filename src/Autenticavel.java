/**
 * Interface -> Uma classe abstrata com todos os m�todos tamb�m abstratos
 * Importante: N�o pode conter m�todos concretos!
 * @author AllRox
 */
public abstract interface Autenticavel {
	
	// Cont�m apenas as assinaturas dos m�todos
	public abstract void setSenha(int senha);
	public abstract boolean autentica(int senha);

}