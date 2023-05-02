package modulo;

public class TestPersona {

	public static void main(String[] args) {
		Persona p = new Persona();
		p.setNombre("Alan");
		p.setEdad(17);
		p.setEmail("alancordoba020@gmail.com");
		System.out.println("Nombre: "+p.getNombre()+", Edad: "+p.getEdad());
		System.out.println(p.sosMayor() ? "Sos Mayor" : "Sos Menor");
		System.out.println(p.repeticionesDeLetra('a'));
	}

}
