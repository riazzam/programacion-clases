package ejercicios.pasteleria;

import java.util.Calendar;

public class Main {
	public static Calendar tiempoCaduca (ProductoPropio varProd) {
		Calendar fechaHoy= Calendar.getInstance();
		fechaHoy.add(Calendar.HOUR, varProd.gettDuracion());
		return fechaHoy;
	}

	public static void main(String[] args) {
		ProductoPropio pp1=new ProductoPropio();
		TipoProducto tp1=new TipoProducto("Roscón");
		Calendar fechaC=Calendar.getInstance();
		fechaC.add(Calendar.HOUR, 24);
		ProductoPropio pRoscon= new ProductoPropio(1,"Roscón de nata", tp1,20.0F,15.0F,120,fechaC,24);
		ProductoExterno pMiel=new ProductoExterno(2,"Miel de Grazalema", tp1,12.0F,8.0F,12);
		System.out.println(pRoscon.toString()); 
		System.out.println(pMiel.toString());
		
		Calendar fechaCaducidad=tiempoCaduca(pRoscon);
		System.out.println(fechaCaducidad.get(Calendar.YEAR)+ "--"+ (fechaCaducidad.get(Calendar.MONTH)+1)+ "--"+ fechaCaducidad.get(Calendar.DATE));
		


	}

}
