package unidad1;

public class Profesor extends Persona {
    private int cantH;
    private int antig;

    public int getCantH() {
        return cantH;
    }

    public void setCantH(int cantH) {
        this.cantH = cantH;
    }

    public int getAntig() {
        return antig;
    }

    public void setAntig(int antig) {
        this.antig = antig;
    }

    @Override
    public String misDatos() {
        return super.misDatos() + "\nCantidad de Horas: " + cantH + "\nAntiguedad: " + antig;
    }
}