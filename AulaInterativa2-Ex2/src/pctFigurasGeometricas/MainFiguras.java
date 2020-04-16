package pctFigurasGeometricas;

public class MainFiguras {

	public static void main(String[] args) {
		FiguraTriangulo triangulo = new FiguraTriangulo();
		triangulo.setAltura(10);
		triangulo.setBase(20);
		triangulo.calculaArea(triangulo.getBase(), triangulo.getAltura());
		System.out.println("A área do triângulo é igual a " + triangulo.getArea());

		FiguraRetangulo retangulo = new FiguraRetangulo();
		retangulo.setAltura(10);
		retangulo.setBase(20);
		retangulo.calculaArea(retangulo.getBase(), retangulo.getAltura());
		System.out.println("A área do retângulo é igual a " + retangulo.getArea());
	}

}