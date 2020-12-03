package ejemplos.rectangulo;

import java.util.Scanner;

public class Main {
	static Scanner scan=new Scanner(System.in);
	public static int leerDato() {
		System.out.println("inserta el lado:");
		return scan.nextInt();
	}
	
	public static Rectangulo datosRectangulo() {
		Rectangulo r=new Rectangulo();
		r.setLadoA(leerDato());
		r.setLadoB(leerDato());
		return r;
	}
	
	public static int modificaLadoB (Rectangulo r, int s) {
		s+=10;
		r.setLadoB(10);
		return s;
	}
	
	public static void obtenerDatos(Rectangulo r) {
		r.setLadoA(leerDato());
		r.setLadoB(leerDato());
	}
	
	
	public static void main(String[] args) {  
		Rectangulo r7=new Rectangulo();
		obtenerDatos(r7);
		System.out.println(r7.toString());
		System.out.println(" --------------------");

		
		int unValor=12;
		Rectangulo r6=datosRectangulo();
		System.out.println(r6.toString());
		System.out.println("De lado B:"+ modificaLadoB(r6, unValor));
		System.out.println(unValor);
		System.out.println(r6.toString());
		
		System.out.println(" --------------------");
		Rectangulo r1=new Rectangulo(5,5);
		Rectangulo r3=new Rectangulo(leerDato(),leerDato());
		Rectangulo r4=new Rectangulo();
		r4.setLadoA(leerDato());
		r4.setLadoB(leerDato());
		
		//Rectangulo r5=new Rectangulo();
		
		
		System.out.println(r1.toString() +"\nel área es:"+ r1.area());
		System.out.println(r1.pintarRectangulo());
		Rectangulo r2=new Rectangulo();
		r2.setLadoA(12);
		r2.setLadoB(14);
		r2.area();
		System.out.println(r2.toString());
		System.out.println(r2.pintarRectangulo());

		
		

	}

}
