import java.util.Scanner;

public class EstructuraDeControlIf {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu edad: ");
		int edad = sc.nextInt();
		
		if(edad >= 18 && edad < 100) {
			System.out.println("Eres mayor de edad");
		}
		else if (edad > 0 && edad < 18){
			System.out.println("Eres menor de edad");
		}
		else {
			System.out.println("Introduce una edad válida");
		}
	}
}
