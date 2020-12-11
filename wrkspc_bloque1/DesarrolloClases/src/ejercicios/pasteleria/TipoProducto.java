package ejercicios.pasteleria;

public class TipoProducto {
	private String nombreTipoProducto;

	public TipoProducto(String nombreTipoProducto) {
		this.nombreTipoProducto = nombreTipoProducto;
	}

	public String getNombreTipoProducto() {
		return nombreTipoProducto;
	}

	public void setNombreTipoProducto(String nombreTipoProducto) {
		this.nombreTipoProducto = nombreTipoProducto;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TipoProducto [nombreTipoProducto=");
		builder.append(nombreTipoProducto);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
