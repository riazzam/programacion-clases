package ejemplos.composicion.reloj;
public class Main {

	
	public static void main(String[] args) {
		Hora vHora=new Hora (10,20,30);
		Reloj vMiRelojA =new Reloj (vHora, "analogico");
		Reloj vMiRelojD =new Reloj (vHora, "digital");
		vMiRelojA.start();
		vMiRelojD.start();

	}

}
