package modelo;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Ventana extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Mapa mapa;

    public Ventana(Mapa mapa) {
        this.mapa = mapa;
        configurarVentana();
        agregarComponentes();
    }

    private void configurarVentana() {
        setTitle("Juego de Estrategia");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void agregarComponentes() {
        add(new PanelMapa(mapa));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Mapa mapa = new Mapa();
            Ventana ventana = new Ventana(mapa);
            ventana.setVisible(true);
        });
    }
}

class PanelMapa extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Mapa mapa;

    public PanelMapa(Mapa mapa) {
        this.mapa = mapa;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibuja el fondo del mapa
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Dibuja los personajes en el mapa
        List<Personaje> personajes = mapa.getPersonajes();
        for (Personaje personaje : personajes) {
            dibujarPersonaje(g, personaje);
        }
    }

    private void dibujarPersonaje(Graphics g, Personaje personaje) {
        // Dibuja un círculo representando al personaje
        g.setColor(Color.BLUE);
        int radio = 20; // Tamaño del personaje
        int x = (int) personaje.getPosicion().getPosicionX() - radio;
        int y = (int) personaje.getPosicion().getPosicionY() - radio;
        g.fillOval(x, y, 2 * radio, 2 * radio);

        // Dibuja el nombre del personaje
        g.setColor(Color.BLACK);
        g.drawString(personaje.getNombre(), x, y - 5);
    }
}
