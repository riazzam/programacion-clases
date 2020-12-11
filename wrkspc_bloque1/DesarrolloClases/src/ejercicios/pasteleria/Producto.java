package ejercicios.pasteleria;

public class Producto {
	private int idProducto;
	private String nombreProducto;
	private TipoProducto tipoProducto;
	private float precioVenta;
	private float precioCoste;

	public Producto(int idProducto, String nombreProducto, TipoProducto tipoProducto, float precioVenta,
			float precioCoste) {
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.tipoProducto = tipoProducto;
		this.precioVenta = precioVenta;
		this.precioCoste = precioCoste;
	}

	public Producto() {
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public TipoProducto getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(TipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public float getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}

	public float getPrecioCoste() {
		return precioCoste;
	}

	public void setPrecioCoste(float precioCoste) {
		this.precioCoste = precioCoste;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [idProducto=");
		builder.append(idProducto);
		builder.append(", nombreProducto=");
		builder.append(nombreProducto);
		builder.append(", tipoProducto=");
		builder.append(tipoProducto);
		builder.append(", precioVenta=");
		builder.append(precioVenta);
		builder.append(", precioCoste=");
		builder.append(precioCoste);
		builder.append("]");
		return builder.toString();
	}

}
