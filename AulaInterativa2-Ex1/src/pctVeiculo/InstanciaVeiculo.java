package pctVeiculo;

public class InstanciaVeiculo {

	public static void main(String[] args) {
		Veiculo carro = new Veiculo();
		carro.incluiVeiculo("Peugeot 208", "Peugeot", "Passageiros", 4, 5);
		carro.mostraVeiculo();
		carro.setModeloVeiculo("Peugeot 308");
		System.out.println("Modelo alterado: " + carro.getModeloVeiculo() + "\n");
		carro.mostraVeiculo();
		
		Veiculo moto = new Veiculo();
		moto.incluiVeiculo("Iron 883", "Harley-Davidson", "Passageiros", 2, 2);
		moto.mostraVeiculo();
		
		Veiculo onibus = new Veiculo();
		onibus.incluiVeiculo("9700 Grand L", "Volvo", "Passageiro", 6, 42);
		onibus.mostraVeiculo();
	}

}