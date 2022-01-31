import java.util.Scanner;

public class NumeroMayor {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa el primer número: ");
		int numero1 = sc.nextInt();
		
		System.out.print("Ingresa el segundo número: ");
		int numero2 = sc.nextInt();
		
		System.out.print("Ingresa el tercer número: ");
		int numero3 = sc.nextInt();
		
		int mayor = numero1;
		
		if((numero1 == numero2) && (numero1 == numero3)) {
			System.out.println("Los tres números son iguales");
		}
		else {
			if ((numero1 >= numero3) || (numero2 >= numero3)) {
				mayor = numero1 >= numero2 ? numero1 : numero2;
			}
			else {
				mayor = numero3;
			}
			
			System.out.println("El número " + mayor + " es el mayor");			
		}
		
	}
}
