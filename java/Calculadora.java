import java.util.Scanner;

/*
 * Pedir al usuario 2 números por consola y preguntarle qué desea realizar
 * 1) Suma
 * 2) Resta
 * 3) División
 * 4) Multiplicación
 * 
 * y después, imprimir el resultado
 * */

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el número 1: ");
		int numero1 = sc.nextInt();

		System.out.print("Introduce el número 2: ");
		int numero2 = sc.nextInt();

		System.out.println("\n1) Suma\t2) Resta\t3) Multiplicación\t4) División");
		System.out.println("¿Qué operación deseas hacer?: ");
		int op = sc.nextInt();
		
		switch(op) {
		case 1:
			int suma = numero1 + numero2;
			System.out.println(numero1 + " + " + numero2 + " = " + suma);
			break;
		case 2:
			int resta = numero1 - numero2;
			System.out.println(numero1 + " - " + numero2 + " = " + resta);
			break;
		case 3:
			int multiplicacion = numero1 * numero2;
			System.out.println(numero1 + " * " + numero2 + " = " + multiplicacion);
			break;
		case 4:
			if(numero2 == 0) {
				System.out.println("No se puede dividir entre cero");
			}
			else {
				float division = (float)numero1 / (float)numero2;
				System.out.println(numero1 + " / " + numero2 + " = " + division);				
			}
			break;
		default:
			System.out.println("Escribe una operación del menú");
		}
		
	}
	
}
