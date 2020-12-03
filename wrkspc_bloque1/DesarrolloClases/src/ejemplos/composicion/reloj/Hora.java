package ejemplos.composicion.reloj;
public class Hora {
	private int hh;
	private int mm;
	private int ss;
	
	public Hora(int hh, int mm, int ss) {
		
		this.hh = hh;
		this.mm = mm;
		this.ss=ss;
		
	}
	public int getHora()
	{
		return this.hh;
	}
	public int getMinutos(){
		return this.mm;
	}
	public int getSegundos(){
		return this.ss;
	}
}
