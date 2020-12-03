package ejemplos.rectangulo;

public class Rectangulo {
	private int ladoA;
	private int ladoB;
	
	public Rectangulo() {		
	}

	public Rectangulo(int ladoA, int ladoB) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}

	public int getLadoA() {
		return ladoA;
	}

	public void setLadoA(int ladoA) {
		this.ladoA = ladoA;
	}

	public int getLadoB() {
		return ladoB;
	}

	public void setLadoB(int ladoB) {
		this.ladoB = ladoB;
	}

	public int area() {
		return this.ladoA*this.ladoB;
	}
	public int perimetro() {
		return (this.ladoA*2)+(this.ladoB*2);
	}
	public boolean esCuadrado() {
		return this.ladoA==this.ladoB;
	}
	public String pintarRectangulo() {
		//StringBuilder s2=new StringBuilder();
		String s="";
		if (this.esCuadrado()) {
			for (int i = 1; i <= this.ladoA; i++) {
				for (int j = 1; j <= this.ladoB; j++) {
					s=s+((j==1||j==this.ladoB)||((i==1)||(i==this.ladoA))?'*':' ');
				}
				s+="\n";
				//s2.append("\n");
			}
		}else {
			for (int i = 1; i <= this.ladoA; i++) {
				for (int j = 1; j <= this.ladoB; j++) {
					s+='+';

				}
				s+="\n";
			}
			
		}
		return s;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rectangulo [ladoA=");
		builder.append(ladoA);
		builder.append(", ladoB=");
		builder.append(ladoB);
		builder.append("]");
		return builder.toString();
	}
	
//	@Override
//	public String toString() {
//		return "Los atributos del rectángulo son:\nladoA=" + ladoA + "\nladoB=" + ladoB ;
//	}

	
	

	
	
	
	
	
	
}
