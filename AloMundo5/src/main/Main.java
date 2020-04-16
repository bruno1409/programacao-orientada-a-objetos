package main;

import model.Funcionario;

public class Main {

	public static void main(String[] args) {
		Funcionario func = new Funcionario("João", "Santa Felicidade", "joao@aqui", 1234, 12, "Gerente");

		System.out.println("Nome: " + func.getNome());
	}

}