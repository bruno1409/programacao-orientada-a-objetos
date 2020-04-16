package pctVeiculo;

public class Veiculo {

	private String modeloVeiculo;
	private String marcaVeiculo;
	private String tipoVeiculo;
	private int qtdadeRodas;
	private int qtdadePassageiros;

	public Veiculo() {

	}

	public void incluiVeiculo(String modelo, String marca, String tipo, int rodas, int passageiros) {
		this.modeloVeiculo = modelo;
		this.marcaVeiculo = marca;
		this.tipoVeiculo = tipo;
		this.qtdadeRodas = rodas;
		this.qtdadePassageiros = passageiros;
	}

	public void mostraVeiculo() {
		System.out.println("-- Veículo --\n");
		System.out.println("Modelo: " + this.modeloVeiculo);
		System.out.println("Marca: " + this.marcaVeiculo);
		System.out.println("Tipo: " + this.tipoVeiculo);
		System.out.println("Rodas: " + this.qtdadeRodas);
		System.out.println("Passageiros: " + this.qtdadePassageiros);
		System.out.println();
	}

	public String getModeloVeiculo() {
		return modeloVeiculo;
	}

	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}

	public String getMarcaVeiculo() {
		return marcaVeiculo;
	}

	public void setMarcaVeiculo(String marcaVeiculo) {
		this.marcaVeiculo = marcaVeiculo;
	}

	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public int getQtdadeRodas() {
		return qtdadeRodas;
	}

	public void setQtdadeRodas(int qtdadeRodas) {
		this.qtdadeRodas = qtdadeRodas;
	}

	public int getQtdadePassageiros() {
		return qtdadePassageiros;
	}

	public void setQtdadePassageiros(int qtdadePassageiros) {
		this.qtdadePassageiros = qtdadePassageiros;
	}

}