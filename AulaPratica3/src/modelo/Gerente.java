package modelo;

public class Gerente extends Funcionario {

	public Gerente() {
		super();
	}

	public Gerente(String matricula, String nome, Departamento departamento, Endereco endereco, double salario) {
		super(matricula, nome, departamento, endereco, salario);
	}	

	@Override
	public double calculaComissao() {
		return salario * 0.2;
	}

}