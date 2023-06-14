package modelo;

public class Jefe extends Empleado {
	private String nombre;
	private String domicilio;
	private String legajo;
	private String departamentoAcargo;
	private int cantidadEmpleados;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String detalle() {
		return "Jefe " + super.detalle() + "departamentoAcargo ="+ departamentoAcargo + ", cantidadEmpleados=" + cantidadEmpleados + "]";
	}
	
}
