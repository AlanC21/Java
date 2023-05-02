package modulo;

public class Persona {
	private String nombre;
	private int edad;
	private String email;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean sosMayor() {
		boolean flag = false;
		if(getEdad() >= 18) {
			flag = true;
		}
		return flag;
	}
	public int repeticionesDeLetra(char letra) {
	    int cont = 0;
	    for (int i = 0; i < getNombre().length(); i++) {
	        if (nombre.charAt(i) == letra) {
	            cont++;
	        }
	    }
	    return cont;
	}
}
