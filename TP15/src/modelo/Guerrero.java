package modelo;

public class Guerrero extends Personaje {
    public Guerrero(String nombre, Posicion posicion) {
        super(nombre, posicion);
        this.vitalidad = 500;
        this.distanciaAtaque = 10;
        this.danioAtaque = 10;
    }

    @Override
    public String toString() {
        return "Guerrero: " + super.toString();
    }
}

