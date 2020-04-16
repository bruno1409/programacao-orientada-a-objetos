package laboratorio;

public class AloMundo2 {

	String mensagem;

	public AloMundo2(String mensagem) {
		this.mensagem = mensagem;		
	}

	public AloMundo2() {
		this.mensagem = "Alo Mundo!";
	}

	String getMensagem() {
		return mensagem;
	}

	void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public static void main(String[] args) {
		AloMundo2 aloMundo = new AloMundo2();
		System.out.println("" + aloMundo.getMensagem());
		aloMundo.setMensagem("Um novo alo mundo!");
		System.out.println("" + aloMundo.getMensagem());
	}

}