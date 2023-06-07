package moduloGuerrero;

public class TestGuerrero {
    public static void main(String[] args) {
        Posicion posicionInicial = new Posicion(0, 0);


        Arma arma = new Arma("Espada", 10, 20);
        Armadura armadura = new Armadura("Escudo", 50, 30);


        Guerrero guerrero = new Guerrero("Guerrero 1", posicionInicial.getX(), posicionInicial.getY());
        guerrero.equiparArma(arma);
        guerrero.equiparArmadura(armadura);

        System.out.println("Nombre: " + guerrero.getNombre());
        System.out.println("Posición: (" + guerrero.getX() + ", " + guerrero.getY() + ")");
        System.out.println("Nivel de daño: " + guerrero.getNivelDanio());
        System.out.println("Nivel de defensa: " + guerrero.getNivelDefensa());
        System.out.println("Vitalidad: " + guerrero.getVitalidad());

        double incrementoX = 5;
        double incrementoY = 3;
        guerrero.mueve(incrementoX, incrementoY);

        System.out.println("Nueva posición: (" + guerrero.getX() + ", " + guerrero.getY() + ")");

        double danioRecibido = 15;
        guerrero.recibirDanio(danioRecibido);

        System.out.println("Vitalidad después de recibir daño: " + guerrero.getVitalidad());
    }
}