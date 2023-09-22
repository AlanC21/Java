package unidad1;

public class Estudiante extends Persona {
    private String curso;
    private int anio;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String misDatos() {
        return super.misDatos() + "\nCurso: " + curso + "\nAnio: " + anio;
    }
}