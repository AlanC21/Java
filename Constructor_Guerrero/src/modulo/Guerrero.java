package modulo;

public class Guerrero {
	private String nombre;
	private double vitalidad;
	private double armadura;
	private double x;
	private double y;
	public Guerrero(String nombre, double x, double y) {
		super();
		this.nombre = nombre;
		this.vitalidad = 500;
		this.armadura = 800;
		this.x = x;
		this.y = y;
	}
	
	public double getVitalidad() {
		return vitalidad;
	}

	public void setVitalidad(double vitalidad) {
		this.vitalidad = vitalidad;
	}

	public double getArmadura() {
		return armadura;
	}

	public void setArmadura(double armadura) {
		this.armadura = armadura;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getNombre() {
		return nombre;
	}

	public void mover(double inc_x, double inc_y) {
		this.x += inc_x;
		this.y += inc_y;
	}
	
	public void recibeDano(double cantidad){

	}
	
	@Override
	public String toString() {
		return "Guerrero [Nombre=" + nombre + ", vitalidad=" + vitalidad + ", armadura=" + armadura + ", x=" + x
				+ ", y=" + y + "]";
	}
}
