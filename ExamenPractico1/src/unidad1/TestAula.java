package unidad1;

public class TestAula {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setApellido("Gomez");
        estudiante1.setNombres("Juan");
        estudiante1.setEdad(20);
        estudiante1.setDni("12345678");
        estudiante1.setCurso("Matematicas");
        estudiante1.setAnio(2);

        Estudiante estudiante2 = new Estudiante();
        estudiante2.setApellido("Lopez");
        estudiante2.setNombres("María");
        estudiante2.setEdad(22);
        estudiante2.setDni("87654321");
        estudiante2.setCurso("Historia");
        estudiante2.setAnio(3);

        Estudiante estudiante3 = new Estudiante();
        estudiante3.setApellido("Rodriguez");
        estudiante3.setNombres("Carlos");
        estudiante3.setEdad(19);
        estudiante3.setDni("98765432");
        estudiante3.setCurso("Biologia");
        estudiante3.setAnio(1);

        Profesor profesor1 = new Profesor();
        profesor1.setApellido("Perez");
        profesor1.setNombres("Laura");
        profesor1.setEdad(35);
        profesor1.setDni("34567890");
        profesor1.setCantH(20);
        profesor1.setAntig(5);

        System.out.println("Datos del estudiante 1:\n" + estudiante1.misDatos());
        System.out.println("\nDatos del estudiante 2:\n" + estudiante2.misDatos());
        System.out.println("\nDatos del estudiante 3:\n" + estudiante3.misDatos());
        System.out.println("\nDatos del profesor 1:\n" + profesor1.misDatos());
    }
}