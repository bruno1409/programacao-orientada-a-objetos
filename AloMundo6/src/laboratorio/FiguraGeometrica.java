package laboratorio;

public class FiguraGeometrica {

	protected double lado1;
	protected double lado2;

	public FiguraGeometrica() {
		this.lado1 = 0;
		this.lado2 = 0;
	}

	public FiguraGeometrica(double lado1, double lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double calculaArea() {
		return lado1 * lado2;
	}

}