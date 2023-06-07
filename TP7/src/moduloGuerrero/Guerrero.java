package moduloGuerrero;

public class Guerrero {
    private String nombre;
    private Posicion posicion;
    private Arma arma;
    private Armadura armadura;
    private double nivelDanio;
    private double nivelDefensa;
    private double vitalidad;

    public Guerrero(String nombre, double x, double y) {
        this.nombre = nombre;
        this.posicion = new Posicion(x, y);
        this.arma = null;
        this.armadura = null;
        this.nivelDanio = 0;
        this.nivelDefensa = 0;
        this.vitalidad = 100;
    }

    public String getNombre() {
        return nombre;
    }

    public double getX() {
        return posicion.getX();
    }

    public double getY() {
        return posicion.getY();
    }

    public void setX(double x) {
        posicion.setX(x);
    }

    public void setY(double y) {
        posicion.setY(y);
    }

    public double mueve(double incrementoX, double incrementoY) {
        double nuevaX = posicion.getX() + incrementoX;
        double nuevaY = posicion.getY() + incrementoY;
        posicion.setX(nuevaX);
        posicion.setY(nuevaY);
        return posicion.getX() + posicion.getY();
    }

    public double getNivelDanio() {
        if (arma != null) {
            return arma.getNivelDanio();
        }
        return nivelDanio;
    }

    public double getNivelDefensa() {
        if (armadura != null) {
            return armadura.getNivelDefensa();
        }
        return nivelDefensa;
    }

    public double getVitalidad() {
        return vitalidad;
    }

    public void equiparArma(Arma arma) {
        this.arma = arma;
    }

    public void equiparArmadura(Armadura armadura) {
        this.armadura = armadura;
    }

    public void recibirDanio(double danio) {
        if (armadura != null) {
            double porcentajeAbsorcion = armadura.getPorcentajeDefensa() / 100.0;
            danio *= (1 - porcentajeAbsorcion);
        }
        vitalidad -= danio;
        if (vitalidad < 0) {
            vitalidad = 0;
        }
    }
}
