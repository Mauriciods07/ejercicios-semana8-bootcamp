package arreglos;

public class Arreglos {

	// Sólo un tipo de dato
	// especificar el tamaño o la cantidad de elementos que va a contener
	
	public static void main(String[] args) {
		// 1 manera
		int numeros[]; // creamos la variable
		numeros = new int[4];
		
		// 2 manera
		String[] nombres = new String[4]; // basado en 0. [0, 1, 2, 3]
		
		//3 manera
		//array literal
		String[] nombreFrutas = new String[] {"Manzana", "Plátano", "Uva", "Pera"};
		
		numeros[0] = 10;
		numeros[1] = 10;
		numeros[2] = 100;
		numeros[3] = 200;
		//numeros[4] = 200; // error ArrayIndexOutOfBoundsException
		
		nombres[0] = "Juan";
		nombres[1] = "Pedro";
		nombres[2] = "Antonio";
		nombres[3] = "Felipe";
		
		System.out.println(numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros);
		
		for(int i=0; i<numeros.length; i++) { // en arrays, length es una propiedad
			System.out.println("Elemento de números: " + numeros[i]); // [0], [1]
			System.out.println("Elemento de nombres: " + nombres[i]);
			System.out.println("------------------------");
		}
	}
}
