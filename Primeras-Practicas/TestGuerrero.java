package modulo;

public class TestGuerrero {

	public static void main(String[] args) {
		Guerrero g = new Guerrero();
		g.setNombre("Alan");
		g.setVitalidad(100);
		g.setArmadura(200);
		g.mover(5, 10);
		g.recibeDano(300);
		System.out.println("Nombre: "+g.getNombre()+", Vitalidad: "+g.getVitalidad()+", Armadura: "+g.getArmadura()+", Posicion X e Y: "+g.getX()+" "+g.getY());
	}

}
