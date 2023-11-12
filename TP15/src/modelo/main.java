package modelo;

import javax.swing.SwingUtilities;


public class main {
	public static void main(String[] args) {
	    SwingUtilities.invokeLater(() -> {
	        Mapa mapa = new Mapa();

	        // Agrega algunos personajes al mapa (simulación)
	        Guerrero guerrero = new Guerrero("Guerrero1", new Posicion(50, 50));
	        Arquero arquero = new Arquero("Arquero1", new Posicion(100, 100));
	        Mago mago = new Mago("Mago1", new Posicion(150, 150));

	        mapa.agregarPersonaje(guerrero);
	        mapa.agregarPersonaje(arquero);
	        mapa.agregarPersonaje(mago);

	        Ventana ventana = new Ventana(mapa);
	        ventana.setVisible(true);
	    });
	}
}
