package ejemplos.editoriales;

public class Editorial {
 private int codigo;
 private String nombre;
 private int anio;
public Editorial(int codigo, String nombre, int anio) {
	this.codigo = codigo;
	this.nombre = nombre;
	this.anio = anio;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getAnio() {
	return anio;
}
public void setAnio(int anio) {
	this.anio = anio;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Editorial [codigo=");
	builder.append(codigo);
	builder.append(", nombre=");
	builder.append(nombre);
	builder.append(", anio=");
	builder.append(anio);
	builder.append("]");
	return builder.toString();
}

 
}
