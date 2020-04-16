package veiculo;

public class Veiculo {

	// Atributos
	String modeloVeiculo;
	String marcaVeiculo;
	String tipoVeiculo;
	int qtdadeRodas;
	int qtdadePassageiros;

	// Construtor
	public Veiculo() {
		
	}

	// M�todo incluiVeiculo
	void incluiVeiculo(String modelo, String marca, String tipo, int rodas, int passageiros) {
		this.modeloVeiculo = modelo;
		this.marcaVeiculo = marca;
		this.tipoVeiculo = tipo;
		this.qtdadeRodas = rodas;
		this.qtdadePassageiros = passageiros;
	}

	// M�todo mostraVeiculo
	void mostraVeiculo() {
		System.out.println("Modelo: " + this.modeloVeiculo);
		System.out.println("Marca: " + this.marcaVeiculo);
		System.out.println("Tipo: " + this.tipoVeiculo);
		System.out.println("Quantidade de rodas: " + this.qtdadeRodas);
		System.out.println("Quantidade de passageiros: " + this.qtdadePassageiros);
		System.out.println();
	}

}