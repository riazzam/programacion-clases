package ejemplos.productos;

public class Main {

	public static void main(String[] args) {
		Producto prod1=new Producto();
		
		prod1.setNombre("mesa");
		prod1.setPrecio(34.56F);
		prod1.setTipoProducto("mueble");
		
		Proveedor prov1=new Proveedor();
		prov1.setContacto("Makro");
		System.out.println(prod1.getNombre()+ prod1.getPrecio());
		System.out.println(prov1.getContacto());
		System.out.println(prod1.toString());
		
		Venta v1=new Venta();
	}

}
