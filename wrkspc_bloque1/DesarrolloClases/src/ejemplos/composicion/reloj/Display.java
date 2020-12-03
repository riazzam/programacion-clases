package ejemplos.composicion.reloj;
public class Display {
	private String tipo;

	public Display(String tipo) {
		this.tipo = tipo;
	}
	

	public void setDisplayHora(Hora hora) {
		if (this.tipo.equals("analogico")) {
			System.out.println("->" + hora.getHora() + ":" + hora.getMinutos()
					+ ":" + hora.getSegundos() + "<-");
		} else if (this.tipo.equals("digital")) {
			System.out.println("[" + hora.getHora() + ":" + hora.getMinutos()
					+ ":" + hora.getSegundos() + "]");
		}

	}
}
