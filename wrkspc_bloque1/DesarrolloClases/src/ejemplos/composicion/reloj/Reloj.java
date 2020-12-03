package ejemplos.composicion.reloj;
public class Reloj {
	private Display display;
	private Hora hora;
	
	public Reloj (Hora hora, String tipo){
		Display disp=new Display (tipo);
		this.display=disp;
		this.hora=hora;
	}
	public void start(){
		this.display.setDisplayHora(this.hora);
	}
	
	

}
