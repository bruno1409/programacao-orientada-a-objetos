package model;

public class Funcionario extends PessoaFisica {

	private int matricula;
	private String cargo;

	public Funcionario(String nome, String endereco, String contato, long cpf, int matricula, String cargo) {
		super(nome, endereco, contato, cpf);
		this.matricula = matricula;
		this.cargo = cargo;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}