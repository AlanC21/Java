package modulo;

public class CuentaBancaria {
	private String titular;
	private double saldo;
	int cantidadDepositos;
	int cantidadExtracciones;
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public int getCantidadDepositos() {
		return cantidadDepositos;
	}
	public int getCantidadExtracciones() {
		return cantidadExtracciones;
	}
	public void depositar(double cantidad) {
		this.saldo += cantidad;
		System.out.println("Tu saldo es de: "+getSaldo());
	}
	public boolean extraer(double cantidad) {
		boolean flag = false;
		if(getSaldo() >= cantidad) {
			flag = true;
		}
		return flag;
	}
}
