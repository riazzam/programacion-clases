package ejemplos.composicion;

public class Main {

	public static void main(String[] args) {
		Ciudad vCiudad=new Ciudad(1,"Madrid",1);
		Fecha vFecha=new Fecha(12,3,2000);
		Persona vPersona=new Persona("123","Maria","Ferrando",'F',vCiudad,vCiudad,vFecha);
		
		

	}

}
