package principal;

// Importar pacote modelo
import modelo.Cliente;
import modelo.Animal;

public class Principal {

	public static void main(String[] args) {

		// Cria��o de objetos
		Cliente cliente = new Cliente("Joao", "Aqui", "555-1234");
		Animal animal = new Animal("Toto", "Cachorro", "SRD", cliente);

		// Exibir informa��es do animal
		System.out.println("Nome: " + animal.getTutor().getNome() + "\n" + "Animal: " + animal.getNome());
	}

}