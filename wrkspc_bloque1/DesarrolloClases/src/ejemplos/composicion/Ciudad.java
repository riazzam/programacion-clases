package ejemplos.composicion;

public class Ciudad {
	private int id;
	private String nombre;
	private int indicativo;
	
	public Ciudad(int id, String nombre, int indicativo) {
		this.id = id;
		this.nombre = nombre;
		this.indicativo = indicativo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIndicativo() {
		return indicativo;
	}
	public void setIndicativo(int indicativo) {
		this.indicativo = indicativo;
	}
	
}
