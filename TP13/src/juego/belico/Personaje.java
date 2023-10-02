package juego.belico;

class Personaje extends Unidad implements IPosicionable, IMovible {
    private int x;
    private int y;

    public Personaje(String equipo, int costo, int energia, int x, int y) {
        super(equipo, costo, energia);
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void recibeDano(int cantidad) {
        // Lógica para el daño recibido por el personaje
    }

    @Override
    public void mover(int x, int y) {
        // Lógica para mover el personaje a una nueva posición
    }
}