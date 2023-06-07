package modulo;

public class Caballero extends Personaje{
	protected int nivelArmadura;
	public Caballero(String nombre, Posicion posicion) {
		super(nombre, posicion);
		this.vitalidad = 800;
		this.distanciaAtaque = 5;
		this.danioAtaque = 10;
		this.nivelArmadura = 500;
		
	}
	
	@Override
	protected void recibeDanio(int cantidad) {
		if(this.nivelArmadura >= cantidad) { 
			this.nivelArmadura -= cantidad;
		}
		else {
			this.vitalidad -= cantidad - this.nivelArmadura;
			this.nivelArmadura = 0;
		}
	}

	@Override
	public String toString() {
		return "Caballero: " + super.toString() + "nivelArmadura=" + nivelArmadura;
	}
	
}
