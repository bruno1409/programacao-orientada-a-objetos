package pctEmpregado;

public class TestePagamento {

	public static void main(String[] args) {

		Salario sal = new Salario("Jo�o", "123456789", 0, 2500.00);
		System.out.println("--- Rendimento Mensalista ---");
		System.out.println("Nome: " + sal.getNome());
		System.out.println("N�mero do documento: " + sal.getNrDocto());
		System.out.println("Sal�rio mensal: " + sal.getSalarioMensal());
		sal.rendimentos();
		System.out.println("Rendimentos: " + sal.getRendimento());
		System.out.println();

		Horario hor = new Horario("Jo�o", "123456789", 0, 30.00, 12.00);

		System.out.println("--- Rendimento Horistas ---");
		System.out.println("Nome: " + hor.getNome());
		System.out.println("N�mero do documento: " + hor.getNrDocto());
		System.out.println("Valor hora: " + hor.getSalario());
		System.out.println("N�mero de horas trabalhadas: " + hor.getHoras());
		hor.rendimentos();
		System.out.println("Rendimentos: " + hor.getRendimento());
		System.out.println();

		Comissao com = new Comissao("Jo�o", "123456789", 0, 20000.00, 0.45);

		System.out.println("--- Rendimento Comissionado ---");
		System.out.println("Nome: " + com.getNome());
		System.out.println("N�mero do documento: " + com.getNrDocto());
		System.out.println("Vendas brutas: " + com.getVendaBruta());
		System.out.println("Taxa de comiss�o: " + com.getTaxaComissao());
		com.rendimentos();
		System.out.println("Rendimentos: " + com.getRendimento());
		System.out.println();

	}

}