package ejemplos.editoriales;

public class Libro {
	private String isbn;
	private String titulo;
	private int precio;
	private int anio;
	private Editorial editorial;
	
	public Libro(String isbn, String titulo, int precio, int anio, Editorial editorial) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.precio = precio;
		this.anio = anio;
		this.editorial = editorial;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libro [isbn=");
		builder.append(isbn);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", anio=");
		builder.append(anio);
		builder.append(", editorial=");
		builder.append(editorial);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	

}
