public class Empleado extends Persona {
    private double sueldo;

    public Empleado(String nombre, int edad, double sueldo) {
        super(nombre, edad);
        this.sueldo = sueldo;
    }

    public void mostrarSueldo() {
        System.out.println("Sueldo: " + sueldo);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 30, 2500.0);

        empleado1.mostrarInformacion();

        empleado1.mostrarSueldo();

        empleado1.setSueldo(3000.0);

        empleado1.mostrarSueldo();
    }
}