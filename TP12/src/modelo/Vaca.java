package modelo;

public class Vaca extends Animal implements EmisorSonido{

	@Override
	public void emiteSonido() {
		System.out.println("Muu");
		
	}
	

}