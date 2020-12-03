package ejemplos.composicion;

public class Persona {
	private String dni;
	private String nombre;
	private String apellido;
	private char genero;
	private Ciudad ciudadNac;
	private Ciudad ciudadRes;
	private Fecha fechaNac;
	
	public Persona(String dni, String nombre, String apellido, char genero, Ciudad ciudadNac, Ciudad ciudadRes,
			Fecha fechaNac) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.ciudadNac = ciudadNac;
		this.ciudadRes = ciudadRes;
		this.fechaNac = fechaNac;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public Ciudad getCiudadNac() {
		return ciudadNac;
	}
	public void setCiudadNac(Ciudad ciudadNac) {
		this.ciudadNac = ciudadNac;
	}
	public Ciudad getCiudadRes() {
		return ciudadRes;
	}
	public void setCiudadRes(Ciudad ciudadRes) {
		this.ciudadRes = ciudadRes;
	}
	public Fecha getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Fecha fechaNac) {
		this.fechaNac = fechaNac;
	}
	

}
