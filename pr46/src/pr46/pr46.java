package pr46;

public class pr46 {

	public static void main(String[] args) {
		
		int contador=0;
		libro libro1 = new libro();
			libro1.titol = "Alicia en el pais de las maravillas";
			libro1.autor = "Lewis Carroll";
			libro1.codiBarres = 89988675;
		libro libro2 = new libro();
			libro2.titol = "La vuelta al mundo en 80 dias";
			libro2.autor = "Julio Verne";
			libro2.codiBarres = 333929947;
			
		System.out.println(libro1.titol);
		System.out.println(libro1.autor);
		System.out.println("");
		System.out.println(libro2.titol);
		System.out.println(libro2.autor);
		
		
		
		
	}

}
