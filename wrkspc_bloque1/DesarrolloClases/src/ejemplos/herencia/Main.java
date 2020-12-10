package ejemplos.herencia;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		Animal a1=new Animal("Kiko", "Gran danés", new GregorianCalendar(2010,Calendar.FEBRUARY, 21));
		//Animal a2=new Animal();
		System.out.println(a1.toString());
		
		
		
		Mamifero m1=new Mamifero();
		m1.setNombre("Uno");
		m1.setMesesGestacion(23);
		m1.setRaza("Dogo");
		m1.setFechaNacimiento(new GregorianCalendar(2010,Calendar.FEBRUARY, 21));
		System.out.println(m1.getNombre()+" "+ m1.getTipoPiel());
		System.out.println(m1.toString());
		
		Mamifero m2=new Mamifero("pelo",15);
		m2.setFechaNacimiento(new GregorianCalendar(2010,Calendar.FEBRUARY, 21));
		System.out.println(m2.toString());
		
		Mamifero m3=new Mamifero("Kiko2", "Gran danés", new GregorianCalendar(2010,Calendar.FEBRUARY, 12),"pelo",15);
		System.out.println(m3.toString());
		Insecto i1=new Insecto("Kiko2", "Gran danés", new GregorianCalendar(2010,Calendar.FEBRUARY, 12),4);
		System.out.println(i1.toString());
		
		
	}

}
