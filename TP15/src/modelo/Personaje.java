package modelo;

public class Personaje implements Movible {
    protected String nombre;
    protected int vitalidad;
    protected Posicion posicion;
    protected double distanciaAtaque;
    protected int danioAtaque;
    private double distanciaMaximaDeDesplazamiento;

    public Personaje(String nombre, Posicion posicion) {
        this.nombre = nombre;
        this.posicion = posicion;

        // Asignar distancia máxima de desplazamiento según el tipo de personaje
        if (this instanceof Guerrero) {
            this.distanciaMaximaDeDesplazamiento = 5;
        } else if (this instanceof Arquero) {
            this.distanciaMaximaDeDesplazamiento = 8;
        } else if (this instanceof Caballero) {
            this.distanciaMaximaDeDesplazamiento = 10;
        } else {
            // Si se añaden más tipos de personajes en el futuro
            this.distanciaMaximaDeDesplazamiento = 0;  // Valor por defecto o manejo adicional
        }
    }

    @Override
    public void incrementaPos(double valorX, double valorY) throws IncrementoImposibleException { 
    	double nuevaDistancia = this.posicion.distancia(new Posicion(this.posicion.getPosicionX() + valorX, this.posicion.getPosicionY() + valorY));

        if (nuevaDistancia > distanciaMaximaDeDesplazamiento) {
        	throw new IncrementoImposibleException(valorX, valorY);
        }

        this.posicion.incrementaPosicion(valorX, valorY);
    }

    public void ataca(Personaje adversario) throws AtaqueImposibleException {
        if (this.distancia(adversario) > this.distanciaAtaque) {
        	throw new AtaqueImposibleException(this, adversario);
        }

        adversario.recibeDanio(this.danioAtaque);
    }

    protected void recibeDanio(int cantidad) {
        this.vitalidad -= cantidad;
    }

    public double distancia(Personaje otro) {
        return this.posicion.distancia(otro.getPosicion());
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public int getVitalidad() {
        return vitalidad;
    }

    public void moverse(Posicion p) {
        this.posicion = p;
    }

    @Override
    public String toString() {
        return "Personaje nombre=" + nombre + ", vitalidad=" + vitalidad + ", posicion=" + posicion
                + ", distanciaAtaque=" + distanciaAtaque + ", danioAtaque=" + danioAtaque + " ";
    }
}