//solicitar el total de una compra por consola.
		// si la cuenta es de menos de 1000
		// si la cuenta es de 1001 - 4999 10%
		// si la cuenta es de 5001 a 9999 20%
		// si la compra es de 10000 o más 30%

import java.util.Scanner;

public class Compra {
	
	public static void main(String[] args) {
		
		System.out.print("Introduzca el total de la compra: ");
		Scanner sc = new Scanner(System.in);
		float cuenta = sc.nextFloat();
		float descuento = 0f;
		
		if (cuenta > 1000 && cuenta < 5000) {
			descuento = cuenta*0.1f;
		}
		else if (cuenta > 5000 && cuenta < 10000) {
			descuento = cuenta*0.2f;
		}
		else if (cuenta > 10000) {
			descuento = cuenta*0.3f;
		}
		
		float total = cuenta - descuento;
		
		if (descuento == 0) {
			System.out.println("No hay descuento, la compra es de " + cuenta);
		}
		else {
			System.out.println("El descuento es de " + descuento + " y el total es de " + total);
		}
	}
}
