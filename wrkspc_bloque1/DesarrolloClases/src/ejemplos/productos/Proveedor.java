package ejemplos.productos;

public class Proveedor {
	String nombre;
	int id;
	String contacto;
	
	
	public Proveedor() {
		
	}
	public Proveedor(String nombre, int id, String contacto) {
		
		this.nombre = nombre;
		this.id = id;
		this.contacto = contacto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	
	@Override
	public String toString() {
		return "Proveedor [nombre=" + nombre + ", id=" + id + ", contacto=" + contacto + "]";
	}
	
	
	
}
