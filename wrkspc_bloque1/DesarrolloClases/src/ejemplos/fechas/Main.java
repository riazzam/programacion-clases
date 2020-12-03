package ejemplos.fechas;

import java.util.Scanner;

public class Main {
	static Scanner scan=new Scanner(System.in);

	public static int leerDia(String s) {
		System.out.println("Escribe el " + s + " de la fecha " );
		return scan.nextInt();
	}
	public static void main(String[] args) {
		
	   Fecha f1=new Fecha (16,11,2020);
	   Fecha f2=new Fecha (18,10,2020);
	   Fecha f3=new Fecha (leerDia("dia"),leerDia("mes"), leerDia("año"));
	   f1.escribir();
	   f2.escribir();
	   f3.escribir();
	   
}
}
