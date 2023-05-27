package modulo;

public class Persona {
	private String nombre;
	private int edad;
	private String email;
	public Persona(String nombre, int edad, String email) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.email = email;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public boolean sosMayor() {
		return this.getEdad() >= 18;
	}
	public int repeticionesDeLetra(char letra) {
		int aux = 0;
		for(int i = 0; i < this.getNombre().length(); i++) {
			if(String.valueOf(letra).equals(this.getNombre())) {
				aux++;
			}
		}
		return aux;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", email=" + email + "]";
	}
	
}
