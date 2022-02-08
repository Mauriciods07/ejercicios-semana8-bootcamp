package metodos;

public class PruebaMetodos {

	public static void main(String[] args) {
		Metodos metodo = new Metodos();
		
		metodo.a = 10;
		metodo.b = 26;
		
		metodo.sumar(); // invocamos el m�todo void
		
		//este tipo de m�todos, se pueden almacenar dentro de una variable
		int resultadoSuma = metodo.sumaConRetorno();
		System.out.println(resultadoSuma - 10); // m�todo con retorno
		
		// m�todo con argumentos
		double multiplicacion = metodo.multiplicarConArgumentos(40, 20.5);
		System.out.println("El resultado de la multiplicaci�n es " + multiplicacion);
	}
}
