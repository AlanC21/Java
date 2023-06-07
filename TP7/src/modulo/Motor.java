package modulo;

public class Motor {
    private String marcaMotor;
    private String numeroMotor;
    private int cilindrada;
    
    public Motor(String marcaMotor, String numeroMotor, int cilindrada) {
        this.marcaMotor = marcaMotor;
        this.numeroMotor = numeroMotor;
        this.cilindrada = cilindrada;
    }
    
    public String getMarcaMotor() {
        return marcaMotor;
    }
    
    public String getNumeroMotor() {
        return numeroMotor;
    }
    
    public int getCilindrada() {
        return cilindrada;
    }
}
