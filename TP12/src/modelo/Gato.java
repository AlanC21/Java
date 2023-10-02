package modelo;

public class Gato extends Animal implements EmisorSonido{

	@Override
	public void emiteSonido() {
		System.out.println("Miau");
		
	}
	

}