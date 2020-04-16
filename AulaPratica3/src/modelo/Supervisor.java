package modelo;

public class Supervisor extends Funcionario {

	public Supervisor() {
		super();
	}

	public Supervisor(String matricula, String nome, Departamento departamento, Endereco endereco, double salario) {
		super(matricula, nome, departamento, endereco, salario);
	}

	@Override
	public double calculaComissao() {
		return salario * 0.15;
	}

}