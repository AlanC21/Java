package modelo;

public class Ambulancia extends Vehiculo implements EmisorSonido{

	@Override
	public void emiteSonido() {
		System.out.println("Sirena sonando");
		
	}

}