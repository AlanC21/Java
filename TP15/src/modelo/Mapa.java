package modelo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Mapa {
    private List<Personaje> personajes;

    public Mapa() {
        this.personajes = new ArrayList<>();
    }

    public void mueve(Personaje personaje, double valorX, double valorY) {
        try {
            personaje.incrementaPos(valorX, valorY);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Incremento imposible: " + e.getMessage());
        }
    }

    public void ataca(Personaje atacante, Personaje atacado) {
        try {
            atacante.ataca(atacado);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al atacar: " + e.getMessage());
        }
    }
    
    public List<Personaje> getPersonajes() {
        return new ArrayList<>(personajes);
    }

    public void agregarPersonaje(Personaje personaje) {
        personajes.add(personaje);
    }
}


