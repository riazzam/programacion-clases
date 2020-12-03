package ejercicios.rectangulos;

import java.util.Scanner;

public class Main {
	static Scanner scan =new Scanner (System.in);
	public static int leerValor() {
		System.out.println("Dame un valor:");
		return scan.nextInt();
	}
	
	public static void pintar(Rectangulo r) {
		
	}

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo(leerValor(), leerValor());
		

		System.out.println(r1.toString());
		System.out.println("El área es:" + r1.area());
		Rectangulo r2 = new Rectangulo(leerValor(), leerValor());
		
		System.out.println(r2.area());
		//r2.setLadoA(10);
		System.out.println(r2.area());
		System.out.println(r2.perimetro());
		if (r2.esCuadrado())
			System.out.println("Es cuadrado");
		else
			System.out.println("Es rectángulo");
		System.out.println(r2.toString());
		System.out.println(r2.pintarRectangulo());
	}

}
