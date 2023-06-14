package modelo;

public class Empleado {
	private String nombre;
	private String domicilio;
	private String legajo;
	private String cargo;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String detalle() {
		return "Empleado nombre=" + nombre + ", domicilio=" + domicilio + ", legajo=" + legajo + ", cargo=" + cargo
				+ "";
	}
	
}
