import java.util.Scanner;

public class ScannerYBuffer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		
		System.out.print("Introduce un número: ");
		int numero = sc.nextInt();
		
		System.out.println("Tu nombre es: " + nombre + 
				". Tu número es: " + numero);
	}
}
