package modulo;

public class TestAutomovil {
    public static void main(String[] args) {
        Motor motor = new Motor("MarcaMotor123", "NumeroMotor456", 2000);
        
        Automovil automovil = new Automovil("ABC123", "Modelo1", motor);
        
        System.out.println("Patente del automóvil: " + automovil.getPatente());
        System.out.println("Modelo del automóvil: " + automovil.getModelo());
        System.out.println("Marca del motor del automóvil: " + automovil.getMarcaMotor());
        System.out.println("Número del motor del automóvil: " + automovil.getNumeroMotor());
        System.out.println("Cilindrada del motor del automóvil: " + automovil.getCilindrada());
    }
}

