package modulo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equipo equipo1 = new Equipo("Manchester City", 2023);
		equipo1.agregarJugador(new Jugador("Alan", 17, "Delantero", 100));
		equipo1.agregarJugador(new Jugador("Diego", 26, "Delantero", 85));
		equipo1.agregarJugador(new Jugador("Sofia", 24, "Mediocampista", 78));
		equipo1.agregarJugador(new Jugador("Alejandro", 30, "Defensa", 92));
		equipo1.agregarJugador(new Jugador("Carolina", 29, "Portera", 88));
		equipo1.agregarJugador(new Jugador("Juan", 27, "Delantero", 80));
		equipo1.agregarJugador(new Jugador("Ana", 25, "Mediocampista", 83));
		equipo1.agregarJugador(new Jugador("Luis", 31, "Defensa", 90));
		equipo1.agregarJugador(new Jugador("Valentina", 23, "Mediocampista", 82));
		equipo1.agregarJugador(new Jugador("Andres", 28, "Portero", 89));
		equipo1.agregarJugador(new Jugador("Gabriela", 26, "Delantera", 87));
		System.out.println(equipo1);
		System.out.println(equipo1.cantidadJugadores());
		System.out.println(equipo1.promedioEdad());
		
	}

}
