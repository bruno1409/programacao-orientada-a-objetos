package model;

public class Departamento {
	
	private String nome;
	private int id;

	public Departamento(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}

	public Departamento() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.isEmpty()) {
			System.out.println("O nome está vazio.");
		} else {
			this.nome = nome;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}