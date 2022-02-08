package metodos;

public class Metodos {

	// M�todo es una funci�n
	// atributos de la clase
	int a, b;
	
	public void sumar() {
		int resultado = a + b;
		System.out.println("El resultado de sumar " + a + " m�s " + b + " es " + resultado);
		
	}
	
	public int sumaConRetorno() {
		return a + b;
	}
	
	// argumentos
	// suma(argumentos)
	public int multiplicarConArgumentos(int arg1, double arg2) {
		int c = arg1;
		double d = arg2;
		// hay que castear porque el resultado es double
		return (int) (c * d);
	}
	
	// m�todo est�tico
	public static void imprimirNombre(String nombre) {
		System.out.println("Mi nombre es: " + nombre);
	}
}
