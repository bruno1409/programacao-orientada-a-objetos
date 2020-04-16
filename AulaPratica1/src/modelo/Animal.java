package modelo;

public class Animal {

	String nome;
	String tipo;
	String raca;

	// Tutor do tipo Cliente
	Cliente tutor;

	public Animal() {
		
	}

	public Animal(String nome, String tipo, String raca, Cliente tutor) {
		this.nome = nome;
		this.tipo = tipo;
		this.raca = raca;
		this.tutor = tutor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Cliente getTutor() {
		return tutor;
	}

	public void setTutor(Cliente tutor) {
		this.tutor = tutor;
	}

}