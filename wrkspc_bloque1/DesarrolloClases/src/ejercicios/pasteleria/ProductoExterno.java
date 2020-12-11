package ejercicios.pasteleria;

public class ProductoExterno extends Producto {
	private int tiempoServicio;

	public ProductoExterno(int idProducto, String nombreProducto, TipoProducto tipoProducto, float precioVenta,
			float precioCoste, int tiempoServicio) {
		super(idProducto, nombreProducto, tipoProducto, precioVenta, precioCoste);
		this.tiempoServicio = tiempoServicio;
	}

	public ProductoExterno() {
		// TODO Auto-generated constructor stub
	}

	public int getTiempoServicio() {
		return tiempoServicio;
	}

	public void setTiempoServicio(int tiempoServicio) {
		this.tiempoServicio = tiempoServicio;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductoExterno [tiempoServicio=");
		builder.append(tiempoServicio);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
