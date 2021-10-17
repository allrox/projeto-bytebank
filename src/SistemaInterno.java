
public class SistemaInterno {
	
	private int senha = 2222;
		
	public void autentica(Autenticavel $funcionarioAutenticavel) {
		boolean autenticou = $funcionarioAutenticavel.autentica(this.senha);
		
		if(autenticou) {
			System.out.println("Acesso liberado");
		} else {
			System.out.println("Acesso negado");
		}
	}

}
