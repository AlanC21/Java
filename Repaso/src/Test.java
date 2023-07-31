public class Test {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 30);
        System.out.println("Información de la Persona:");
        persona1.mostrarInformacion();
        System.out.println();

        Empleado empleado1 = new Empleado("María", 25, 3000.0);
        System.out.println("Información del Empleado:");
        empleado1.mostrarInformacion();
        empleado1.mostrarSueldo();
    }
}
