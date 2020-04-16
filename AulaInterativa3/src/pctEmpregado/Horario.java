package pctEmpregado;

public class Horario extends Empregado {

	private double salario;
	private double horas;

	public Horario(String nome, String nrDocto, double rendimento, double salario, double horas) {
		super(nome, nrDocto, rendimento);

		if (salario <= 0.0) {
			throw new IllegalArgumentException("O salário por hora deve ser maior que 0.");
		} else {
			this.salario = salario;
		}

		if (horas <= 0.0) {
			throw new IllegalArgumentException("Número de horas não pode ser menor que 0.");
		} else {
			this.horas = horas;
		}

	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {

		if (salario <= 0.0) {
			throw new IllegalArgumentException("O salário por hora deve ser maior que 0.");
		} else {
			this.salario = salario;
		}

	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {

		if (horas <= 0.0) {
			throw new IllegalArgumentException("Número de horas não pode ser menor que 0.");
		} else {
			this.horas = horas;
		}

	}

	public double rendimentos() {

		if (getHoras() <= 160.0) {
			setRendimento(getSalario() * getHoras());
		} else {
			setRendimento(160 * getSalario() + (getHoras() - 160) * getSalario() * 1.5);
		}

		return getRendimento();
	}

}