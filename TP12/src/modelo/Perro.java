package modelo;

public class Perro extends Animal implements EmisorSonido{

	@Override
	public void emiteSonido() {
		System.out.println("Guau");
		
	}
	

}