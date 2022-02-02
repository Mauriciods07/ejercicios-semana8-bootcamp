package ciclos;

import java.util.Scanner;

public class DeletreaNombre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿Cuál es tu nombre?: ");
		String name = sc.nextLine();
		
		System.out.println("Mira, voy a deletrearlo");
		System.out.println("Con array\tCon .charAt");
		String[] nameArr = name.split("");
		
		for(int i=0; i<name.length(); i++) {
			System.out.print(nameArr[i]);
			System.out.println("\t\t" + name.charAt(i));
		}

		System.out.println("¿Qué tal? ;)");
	}
	
}
