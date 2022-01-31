import java.util.Scanner;

public class Triangulo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingresa el primer ángulo: ");
		int angulo1 = sc.nextInt();

		System.out.print("Ingresa el segundo ángulo: ");
		int angulo2 = sc.nextInt();

		System.out.print("Ingresa el tercer ángulo: ");
		int angulo3 = sc.nextInt();
		
		String esTriangulo = (angulo1+angulo2+angulo3 == 180) ? "Sí" : "No";
		
		
		System.out.println(esTriangulo + " es un triángulo");
	}
}
