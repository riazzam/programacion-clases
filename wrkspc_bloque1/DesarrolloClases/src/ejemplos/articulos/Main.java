package ejemplos.articulos;

import java.util.Scanner;

public class Main {
	static Scanner scan=new Scanner(System.in);
	public static void leerDatosArticulo(Articulo a) {
		System.out.println("Dime la descripción del artículo:");
		a.setDescripcion(scan.nextLine());
		System.out.println("Dime la cantidad actual:");
		a.setCantidad(scan.nextInt());
		System.out.println("Dime el stock mínimo:");
		a.setStockMinimo(scan.nextInt());
		
		
	}
	public static void cambiarArticulos(Articulo a) {
		System.out.println("Dime cuántos artículos han entrado de "+ a.getDescripcion());
		a.nuevosArticulos(scan.nextInt());
	}
	public static void main(String[] args) {
		Articulo a1=new Articulo("Mascarillas", 28, 25);
		System.out.println(a1.sobreStock());
		System.out.println(a1.compraMinima());
		
//		Articulo a2=new Articulo();
//		leerDatosArticulo(a2);
//		System.out.println(a1.toString());
//		System.out.println(a2.toString());
//		cambiarArticulos(a2);
//		System.out.println(a2.toString());
//		
		
		
	}

}
