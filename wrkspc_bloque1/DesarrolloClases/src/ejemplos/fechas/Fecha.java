package ejemplos.fechas;

public class Fecha {
 int dia;
 int mes;
 int year;
 
 
 public Fecha(int d, int m, int y) {
	 dia=d;
	 mes=m;
	 year=y;
 }
 
 public void escribir() {
	 System.out.println(dia+ "/"+ mes+ "/"+ year);
 }
}
