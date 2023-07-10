package Modelo;

public class Test {
	public static void main(String[] args) {
		
		Faccion f1 = new Faccion("LADO OSCURO", 0);
		
		Posicion p1 = new Posicion(20, 20);
		
		Faccion f2 =  new Faccion("LADO BLANCO", 0);
		
		Posicion p2 = new Posicion(20, 20);
		
		DestructorEstelar de = new DestructorEstelar("Nave de la Muerte", p1, f1);
		Caza caza = new Caza("Caza de la muerte", p2, f2);
		
		de.atacar(caza);
		System.out.println(caza.getEnergia());
		caza.atacar(de);
		System.out.println(de.getEnergia());
		
		System.out.println(de);
		System.out.println(caza);
	}
}
