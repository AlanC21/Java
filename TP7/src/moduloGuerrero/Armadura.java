package moduloGuerrero;

public class Armadura {
    private String nombre;
    private double nivelDefensa;
    private double porcentajeDefensa;

    public Armadura(String nombre, double nivelDefensa, double porcentajeDefensa) {
        this.nombre = nombre;
        this.nivelDefensa = nivelDefensa;
        this.porcentajeDefensa = porcentajeDefensa;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNivelDefensa() {
        return nivelDefensa;
    }

    public double getPorcentajeDefensa() {
        return porcentajeDefensa;
    }

    public void setPorcentajeDefensa(double porcentajeDefensa) {
        this.porcentajeDefensa = porcentajeDefensa;
    }
}