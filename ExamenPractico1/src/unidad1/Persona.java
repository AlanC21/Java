package unidad1;

public class Persona {
    private String apellido;
    private String nombres;
    private int edad;
    private String dni;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String misDatos() {
        return "Apellido: " + apellido + "\nNombres: " + nombres + "\nEdad: " + edad + "\nDNI: " + dni;
    }
}