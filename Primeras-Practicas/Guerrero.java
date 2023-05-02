package modulo;

public class Guerrero {
	private String nombre;
	private double vitalidad;
	private double armadura;
	private double x;
	private double y;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	public void mover(double inc_x, double inc_y) {
		x += inc_x;
		y += inc_y;
	}
    public void recibeDano(double cantidad) {
        if (armadura >= cantidad) {
            armadura -= cantidad;
        } else {
            double danoRestante = cantidad - armadura;
            armadura = 0;
            vitalidad -= danoRestante;
        }
    }
}
