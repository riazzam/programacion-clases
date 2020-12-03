package persona;

public class Persona {
	String nombre;
	int edad;
	
	public Persona() {
		edad=34;
	}
		
	public Persona(String s) {
		nombre=s;
	}
	
	public Persona(String s, int e) {
		nombre=s;
		edad=e;
	}
		
	public void escribir() {
		System.out.println(nombre + " " + edad);
	}
	public void setNombre(String s) {
		nombre=s;
	}
	public String getNombre() {
		return nombre;
	}
	
	

}
