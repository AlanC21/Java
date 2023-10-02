package juego.belico;

class Edificio extends Unidad implements IPosicionable, IConstruible, IHostil, IMovible {
    private int x;
    private int y;
    private int tiempoConstruccion;

    public Edificio(String equipo, int costo, int energia, int x, int y, int tiempoConstruccion) {
        super(equipo, costo, energia);
        this.x = x;
        this.y = y;
        this.tiempoConstruccion = tiempoConstruccion;
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
    public int getTiempoConstruccion() {
        return tiempoConstruccion;
    }

    @Override
    public void recibeDano(int cantidad) {
        // Lógica para el daño recibido por el edificio
    }

    @Override
    public void atacar(Unidad adversario) {
        // Lógica para atacar a una unidad
    }

    @Override
    public void mover(int x, int y) {
        // Lógica para mover el edificio a una nueva posición
    }
}