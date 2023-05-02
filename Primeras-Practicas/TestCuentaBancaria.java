package modulo;

public class TestCuentaBancaria {

	public static void main(String[] args) {
		CuentaBancaria c = new CuentaBancaria();
		c.setTitular("Alan");
		System.out.println("El titular es: "+c.getTitular());
		c.depositar(200000);
		System.out.println(c.extraer(200001) ? "La extraccion es exitosa" : "La extraccion fallo (No tienes sufienciente saldo)");
	}

}
