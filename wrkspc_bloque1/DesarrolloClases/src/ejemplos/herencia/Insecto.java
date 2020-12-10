package ejemplos.herencia;

import java.util.Calendar;

public class Insecto extends Animal {
	private int numPatas;

	public Insecto(String nombre, String raza, Calendar fechaNacimiento, int numPatas) {
		super(nombre, raza, fechaNacimiento);
		this.numPatas=numPatas;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Insecto [numPatas=");
		builder.append(numPatas);
		builder.append("]");
		return builder.toString();
	}
	
	
}
