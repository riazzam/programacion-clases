package ejemplos.manejofechas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale loc=Locale.getDefault();
		Date fecha=new Date();
		System.out.println(fecha);
		System.out.println(fecha.getTime());
		System.out.println(fecha.getYear());
		Calendar otraFecha=Calendar.getInstance();
		System.out.println(otraFecha.get(Calendar.YEAR)+" "+ otraFecha.get(Calendar.MONTH));
		System.out.println(otraFecha.getTime());
		System.out.println(otraFecha.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, loc));
		
		Calendar fechaNuestra;
		
		fechaNuestra= new GregorianCalendar(2019,1,45,12,56,34);
		//fechaNuestra.setLenient(false);
		System.out.println(fechaNuestra.getDisplayName(Calendar.MONTH, Calendar.LONG, loc));
		System.out.println(fechaNuestra.getTime());
		
		fechaNuestra.set(Calendar.MONTH, Calendar.APRIL);
		System.out.println(fechaNuestra.getTime());
		fechaNuestra.roll(Calendar.MONTH, 6);
		fechaNuestra=Calendar.getInstance();
		System.out.println(fechaNuestra.getTime());
		System.out.println(fechaNuestra.compareTo(otraFecha));
		
		
		
		

	}

}
