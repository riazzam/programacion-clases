package ejemplos.editoriales;

public class Main {

	public static void main(String[] args) {
		Editorial e1=new Editorial(1, "Salamandra",1975);
		Libro l1=new Libro("1A", "Harry Potter", 18,2002,e1);
		System.out.println(l1.getIsbn());
		System.out.println(l1.getEditorial().getNombre());
		System.out.println(l1.toString());
		e1.setCodigo(2);
		System.out.println(l1.toString());
		l1.getEditorial().setCodigo(3);
		System.out.println(l1.toString());
		
		
		Libro l2=new Libro("2A", "Harry Potter", 18,2002,new Editorial(1, "Salamandra",1975));
		l2.getEditorial().setAnio(1980);
		System.out.println(l2.getEditorial().toString());
	}

}
