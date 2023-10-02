package juego.belico;

abstract class Unidad {
    String equipo;
    int costo;
    int energia;

    public Unidad(String equipo, int costo, int energia) {
        this.equipo = equipo;
        this.costo = costo;
        this.energia = energia;
    }

    public abstract void recibeDano(int cantidad);
}