package modulo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaBancaria B1 = new CuentaBancaria("Alan");
		B1.depositar(5000);
		System.out.println(B1);
		B1.extraer(5000);
		System.out.println(B1);
	}

}
