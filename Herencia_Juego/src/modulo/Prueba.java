package modulo;

public class Prueba {

	public static void main(String[] args) {
		Arquero a = new Arquero("Legolas", new Posicion(10,4));
		Guerrero g = new Guerrero("Jon Snow", new Posicion(12,5));
		Caballero c = new Caballero("Aragron", new Posicion(15,3));
		Mago m = new Mago("Gandalf", new Posicion(13, 5));
		
		System.out.println(a);
		System.out.println(g);
		System.out.println(c);
		System.out.println(m);
		
		a.ataca(c);
		c.ataca(g);
		g.ataca(c);
		m.ataca(a);
		a.moverse(new Posicion(12,6));
		
		System.out.println("-----------");
		
		System.out.println(a);
		System.out.println(g);
		System.out.println(c);
		System.out.println(m);
		
		a.recuperarFlechas();
		m.recuperarMagia();
		m.curar(g);
		m.teletransportarse(new Posicion(20,10));
		
		System.out.println("-----------");
		
		System.out.println(a);
		System.out.println(g);
		System.out.println(c);
		System.out.println(m);
	}

}
