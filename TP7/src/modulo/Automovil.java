package modulo;

public class Automovil {
    private String patente;
    private String modelo;
    private Motor motor;
    
    public Automovil(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }
    
    public String getPatente() {
        return patente;
    }
    
    public void setPatente(String patente) {
        this.patente = patente;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getMarcaMotor() {
        return motor.getMarcaMotor();
    }
    
    public String getNumeroMotor() {
        return motor.getNumeroMotor();
    }
    
    public int getCilindrada() {
        return motor.getCilindrada();
    }
}
