package modelo;

public class Entrega {

	private Pedido pedido;
	private Pessoa cliente;

	public Entrega() {
		
	}

	public Entrega(Pedido pedido, Pessoa cliente) {
		this.pedido = pedido;
		this.cliente = cliente;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Pessoa getPessoa() {
		return cliente;
	}

	public void setPessoa(Pessoa cliente) {
		this.cliente = cliente;
	}

	public void emitirNFE(PessoaJuridica pj) {
		
	}

	public void emitirNFE(PessoaFisica pf) {
		
	}

}