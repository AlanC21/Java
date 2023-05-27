package modulo;

public class CuentaBancaria {
	private String titular;
	private double saldo;
	private int cantidadDepositos;
	private int cantidadExtracciones;
	public CuentaBancaria(String titular) {
		super();
		this.titular = titular;
	}
	public String getTitular() {
		return titular;
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
		if(cantidad <= 0) {
			System.out.println("ERROR AL DEPOSITAR. POR FAVOR INGRESE UN VALOR VALIDO");
		}
		else {
			saldo = saldo + cantidad;
			cantidadDepositos++;
		}
	}
	public void extraer(double cantidad) {
		if(cantidad > this.getSaldo()) {
			System.out.println("ERROR AL EXTRAER. POR FAVOR INGRESE UN VALOR VALIDO");
		}
		else {
			saldo = saldo - cantidad;
			cantidadExtracciones++;
		}
	}
	@Override
	public String toString() {
		return "CuentaBancaria [titular=" + titular + ", saldo=" + saldo + ", cantidadDepositos=" + cantidadDepositos
				+ ", cantidadExtracciones=" + cantidadExtracciones + "]";
	}
}
