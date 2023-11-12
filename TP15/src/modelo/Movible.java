package modelo;

public interface Movible {
    void incrementaPos(double valorX, double valorY) throws IncrementoImposibleException;
}
