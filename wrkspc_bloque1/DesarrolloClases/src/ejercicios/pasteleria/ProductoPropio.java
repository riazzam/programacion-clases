package ejercicios.pasteleria;

import java.util.Calendar;

public class ProductoPropio extends Producto {
	private int tiempoPreparacion;
	private Calendar tiempoCaducidad;
	private int tDuracion;
	
	
	public ProductoPropio(int idProducto, String nombreProducto, TipoProducto tipoProducto, float precioVenta,
			float precioCoste, int tiempoPreparacion, Calendar tiempoCaducidad, int tDuracion) {
		super(idProducto, nombreProducto, tipoProducto, precioVenta, precioCoste);
		this.tiempoPreparacion = tiempoPreparacion;
		this.tiempoCaducidad = tiempoCaducidad;
		this.settDuracion(tDuracion);
	}

	public ProductoPropio() {
		super();
	}

	public int getTiempoPreparacion() {
		return tiempoPreparacion;
	}

	public void setTiempoPreparacion(int tiempoPreparacion) {
		this.tiempoPreparacion = tiempoPreparacion;
	}

	public Calendar getTiempoCaducidad() {
		return tiempoCaducidad;
	}

	public void setTiempoCaducidad(Calendar tiempoCaducidad) {
		this.tiempoCaducidad = tiempoCaducidad;
	}
	

	public int gettDuracion() {
		return tDuracion;
	}

	public void settDuracion(int tDuracion) {
		this.tDuracion = tDuracion;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductoPropio [tiempoPreparacion=");
		builder.append(tiempoPreparacion);
		builder.append(", tiempoCaducidad=");
		builder.append(tiempoCaducidad);
		builder.append(", tDuracion=");
		builder.append(tDuracion);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
 
}
