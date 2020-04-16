package principal;

import modelo.Funcionario;
import modelo.Gerente;
import modelo.Supervisor;

public class Principal {

	public void mostraSalarioComComissao(Funcionario f) {
		System.out.println("Salário de " + f.getNome() + " com comissão: " + (f.getSalario() + f.calculaComissao()));
	}

	public static void main(String[] args) {
		Funcionario func = new Funcionario("1", "João", null, null, 1000);
		Supervisor sup = new Supervisor("2", "Antonio", null, null, 1500);
		Gerente ger = new Gerente("3", "Ana", null, null, 3000);
		Principal p = new Principal();

		p.mostraSalarioComComissao(func);
		p.mostraSalarioComComissao(ger);
		p.mostraSalarioComComissao(sup);
	}

}