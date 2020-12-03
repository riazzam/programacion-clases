package persona;

public class Vivienda {
    String calle;
    String localidad;
    
    public Vivienda() {
    	localidad="Madrid";
    }
    
    public void escribir() {
    	System.out.println(calle+ " "+ localidad);
    }
}
