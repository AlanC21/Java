package modulo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motor M1 = new Motor("S_AACCBB_H", 5000, "Nafta");
		Chasis C1 = new Chasis("AB_123", 1000);
		Automovil A1 = new Automovil("Renault", 2023, M1, C1);
		A1.setPrecio(5000);
		System.out.println(A1);
	}	

}
