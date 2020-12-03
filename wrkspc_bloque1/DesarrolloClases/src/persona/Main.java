package persona;

public class Main {

	public static void main(String[] args) {
		String palabra="hola";		
		
		Persona p1= new Persona();		
		Persona p2= new Persona();
		Persona p3=new Persona("Maria");
		Persona p4=new Persona("Paco", 23);
		Vivienda v1=new Vivienda();
		v1.escribir();
		
//		Persona p5 = null;
//		p5.escribir();
		
		
		p4.escribir();
		p3.escribir();
		p1.escribir();
		p1.setNombre("Leticia");
		p1.escribir();
		
		p2.escribir();
		p2.setNombre("Ana");
		p2.escribir();
		
		System.out.println(p1.getNombre()+ " "+ p3.getNombre());

	}

}
