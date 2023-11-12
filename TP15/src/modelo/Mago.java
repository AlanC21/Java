package modelo;

import java.util.Random;

public class Mago extends Personaje {
    protected int cantidadMagia;

    public Mago(String nombre, Posicion posicion) {
        super(nombre, posicion);
        this.vitalidad = 300;
        this.cantidadMagia = 5000;
        this.danioAtaque = 10;
        this.distanciaAtaque = 5;
    }

    @Override
    public void ataca(Personaje adversario) {
        if (this.cantidadMagia > 0 && this.distancia(adversario) <= this.distanciaAtaque) {
            adversario.recibeDanio(this.danioAtaque);
            this.cantidadMagia -= 500;
        } else if (this.cantidadMagia == 0 && this.distancia(adversario) <= this.distanciaAtaque) {
            adversario.recibeDanio(this.danioAtaque);
        }
    }

    public void recuperarMagia() {
        Random random = new Random();
        int numeroMagia = random.nextInt(10);
        this.cantidadMagia += numeroMagia;
        System.out.println("Medistaste, recuperaste " + numeroMagia + " de magia. Ahora tienes " + this.cantidadMagia + " de magia.");
    }

    public void teletransportarse(Posicion p) {
        this.posicion = p;
        System.out.println("Teletransportacion exitosa!!.");
    }

    public void curar(Personaje companiero) {
        if (cantidadMagia >= 1000) {
            companiero.vitalidad += 100;
            System.out.println("Curaste exitosamente!!.");
        } else {
            System.out.println("No tienes suficiente magia para poder curar");
        }
    }

    @Override
    public void incrementaPos(double valorX, double valorY) {
        // El mago puede teletransportarse a cualquier posición sin lanzar excepciones
        this.posicion.setPosicionXY(valorX, valorY);
    }
    
    @Override
    public String toString() {
        return "Mago: " + super.toString() + "cantidadMagia=" + cantidadMagia;
    }
}
    
