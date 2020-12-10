package ejemplos.herencia;

import java.util.Calendar;

public class Mamifero extends Animal {
	private String tipoPiel;
	private int mesesGestacion;
	
	
	
	public Mamifero(String nombre, String raza, Calendar fechaNacimiento, String tipoPiel, int mesesGestacion ) {
		super(nombre, raza, fechaNacimiento);
		this.tipoPiel = tipoPiel;
		this.mesesGestacion = mesesGestacion;
		
	}
	public Mamifero(String tipoPiel, int mesesGestacion) {
		super();
		this.tipoPiel = tipoPiel;
		this.mesesGestacion = mesesGestacion;
	}
	public Mamifero() {
		// TODO Auto-generated constructor stub
	}
	public String getTipoPiel() {
		return tipoPiel;
	}
	public void setTipoPiel(String tipoPiel) {
		this.tipoPiel = tipoPiel;
	}
	public int getMesesGestacion() {
		return mesesGestacion;
	}
	public void setMesesGestacion(int mesesGestacion) {
		this.mesesGestacion = mesesGestacion;
	}
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Mamifero [tipoPiel=");
		builder.append(tipoPiel);
		builder.append(", mesesGestacion=");
		builder.append(mesesGestacion);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	

}
