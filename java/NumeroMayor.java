import java.util.Scanner;

public class NumeroMayor {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa el primer n�mero: ");
		int numero1 = sc.nextInt();
		
		System.out.print("Ingresa el segundo n�mero: ");
		int numero2 = sc.nextInt();
		
		System.out.print("Ingresa el tercer n�mero: ");
		int numero3 = sc.nextInt();
		
		int mayor = numero1;
		
		if((numero1 == numero2) && (numero1 == numero3)) {
			System.out.println("Los tres n�meros son iguales");
		}
		else {
			if ((numero1 >= numero3) || (numero2 >= numero3)) {
				mayor = numero1 >= numero2 ? numero1 : numero2;
			}
			else {
				mayor = numero3;
			}
			
			System.out.println("El n�mero " + mayor + " es el mayor");			
		}
		
	}
}
