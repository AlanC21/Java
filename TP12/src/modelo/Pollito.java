package modelo;

public class Pollito extends Animal implements EmisorSonido{

	@Override
	public void emiteSonido() {
		System.out.println("Pio pio");
		
	}
	

}