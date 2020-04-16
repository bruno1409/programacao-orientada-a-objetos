package main;

import model.Departamento;
import model.Funcionario;

public class Main {

	public static void main(String[] args) {
		Departamento departamento = new Departamento("Financeiro", 1);
		Funcionario funcionario = new Funcionario(1, "João", 1234, departamento);
		
		System.out.println("-- Funcionário --\n");
		System.out.println("Matrícula: " + funcionario.getMatricula());
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Ramal: " + funcionario.getRamal());
		System.out.println("Departamento: " + funcionario.getDepartamento().getNome());
	}

}