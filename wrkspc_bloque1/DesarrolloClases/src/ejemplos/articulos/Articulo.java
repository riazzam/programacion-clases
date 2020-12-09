package ejemplos.articulos;

public class Articulo {
	private String descripcion;
	private int cantidad;
	private int stockMinimo;
	
	public Articulo() {
		
	}

	public Articulo(String descripcion, int cantidad, int stockMinimo) {
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.stockMinimo = stockMinimo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}
		


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getStockMinimo() {
		return stockMinimo;
	}

	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}
	public void nuevosArticulos(int cantidad) {
		this.cantidad+=cantidad;
	}
	public boolean  bajoStock() {		
		return this.cantidad>this.stockMinimo;
		}
	public int  compraMinima() {
//		Si la cantidad actual es menor que el stockMinimo, 
//		nos devolverá  la diferencia entre la cantidad actual y 
//		el stock mínimo más un 25% más de cantidad del artículo 
//		(si el stock mínimo es 10 y nuestra cantidad es 5, 
//		devolverá 7,5 que será (10-5)+ (10*25/100))
//		Si no es menor, se comprueba que cantidad supera el 
//		25% más del stock mínimo, es decir si nuestra cantidad 
//		actual es >12,5 no se compra nada, y si es menor, 
//		se compra desde nuestra cantidad hasta 12,5 lo que falte.
//
		int cant=0;
		if (bajoStock()) {
			if (!(this.cantidad> (this.stockMinimo+(this.stockMinimo*25/100)))){
			   cant=(this.stockMinimo+(this.stockMinimo*25/100))-this.cantidad;	
			}
		} else {
			cant=(this.stockMinimo - this.cantidad)+ (this.stockMinimo*25/100);
		}
		return cant;
		}
	public int sobreStock() {
		int porEncima=0;
		if (bajoStock()) porEncima=this.cantidad-this.stockMinimo;	
		return porEncima;
		}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Articulo [descripcion=");
		builder.append(descripcion);
		builder.append(", cantidad=");
		builder.append(cantidad);
		builder.append(", stockMinimo=");
		builder.append(stockMinimo);
		builder.append("]");
		return builder.toString();
	}
	
	

}
