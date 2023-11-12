package modelo;

import java.util.Random;

public class Arquero extends Personaje {
    protected int cantidadFlechas;
    protected double distanciaAtaqueArco;
    protected int danioAtaqueArco;

    public Arquero(String nombre, Posicion posicion) {
        super(nombre, posicion);
        this.vitalidad = 500;
        this.cantidadFlechas = 20;
        this.distanciaAtaqueArco = 100;
        this.danioAtaqueArco = 15;
        this.danioAtaque = 5;
        this.distanciaAtaque = 5;
    }

    @Override
    public void ataca(Personaje adversario) {
        if (this.cantidadFlechas > 0 && this.distancia(adversario) <= this.distanciaAtaqueArco) {
            adversario.recibeDanio(this.danioAtaqueArco);
            this.cantidadFlechas--;
        } else if (this.cantidadFlechas == 0 && this.distancia(adversario) <= this.distanciaAtaque) {
            adversario.recibeDanio(this.danioAtaque);
        }
    }

    public void recuperarFlechas() {
        Random random = new Random();
        int numeroFlechas = random.nextInt(10);
        this.cantidadFlechas += numeroFlechas;
        System.out.println("Agarraste " + numeroFlechas + " flechas. Ahora tienes " + this.cantidadFlechas + " flechas.");
    }

    @Override
    public String toString() {
        return "Arquero: " + super.toString() + "cantidadFlechas=" + cantidadFlechas + ", distanciaAtaqueArco=" + distanciaAtaqueArco
                + ", danioAtaqueArco=" + danioAtaqueArco;
    }
}

