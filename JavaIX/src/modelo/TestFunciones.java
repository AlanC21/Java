package modelo;

public class TestFunciones {

	public static void main(String[] args) {
		
		Funciones funciones = new Funciones(1, 500, 1, 5);
		funciones.multiplos();
        
        funciones.pares();

        funciones.impares();
      
        funciones.fibonacci();
		
	}

}