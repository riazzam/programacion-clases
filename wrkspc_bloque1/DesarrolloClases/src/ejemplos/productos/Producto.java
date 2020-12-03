package ejemplos.productos;

public class Producto {
	private String nombre;
	private String tipoProducto;
	private float precio;
	
	public Producto() {
		
	}
	public Producto(String nombre, String tipoProducto, float precio) {
		this.nombre=nombre;
		this.tipoProducto=tipoProducto;
		this.precio=precio;
	}
	
	public void setNombre(String nuevoNombre) {
		this.nombre=nuevoNombre;
	}
	public void setTipoProducto(String nuevoProducto) {
		this.tipoProducto=nuevoProducto;
	}
	public void setPrecio(float precio) {
		this.precio=precio;

	}
	public String getNombre() {
		return this.nombre;
	}
	public String getTipoProducto() {
		return this.tipoProducto;
	}
	public float getPrecio() {
		return this.precio;
	}
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", tipoProducto=" + tipoProducto + ", precio=" + precio + "]";
	}
	
	
}
