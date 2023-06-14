package matematica;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FiguraGeometrica Triangulo = new Triangulo();
		FiguraGeometrica Rectangulo = new Rectangulo();
		FiguraGeometrica Circulo = new Circulo();
		FiguraGeometrica Cilindro = new Cilindro();
		
		Rectangulo.dibujar();
		Circulo.dibujar();
		Triangulo.dibujar();
		Cilindro.dibujar();
	}

}
