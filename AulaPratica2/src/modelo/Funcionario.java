package modelo;

public class Funcionario {

	protected String matricula;
	protected String nome;
	protected Departamento departamento;
	protected Endereco endereco;
	protected double salario;

	public Funcionario() {
		
	}

	public Funcionario(String matricula, String nome, Departamento departamento, Endereco endereco, double salario) {
		this.matricula = matricula;
		this.nome = nome;
		this.departamento = departamento;
		this.endereco = endereco;
		this.salario = salario;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double calculaComissao() {
		return salario * 0.1;
	}

}