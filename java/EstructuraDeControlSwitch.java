
import java.util.Scanner;

public class EstructuraDeControlSwitch {
	
	// Estructuras de control nos sirve para controlar el flujo de
	// comportamiento de un programa. Para la toma de decisiones
	
	/*
	 * switch(condicion_a_evaluar){
	 * case 'valor':
	 * 		// código a ejecutar
	 * 		break;
	 * ...
	 * case 'n':
	 * 		// código a ejecutar
	 * 		break;
	 * default:
	 * 		// código a ejecutar
	 * }
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("¿Qué día de la semana es?: ");
		String dia = sc.nextLine();
		
		switch(dia.toLowerCase()) {
		case "lunes":
			System.out.println("Ya mero es viernes, toma un café.");
			break;
			
		case "martes":
			System.out.println("Lunes chiquito. Esto está cansado, pero ya casi.");
			break;
			
		case "miercoles":
			System.out.println("Miércoles, pero a qué costo.");
			break;
			
		case "jueves":
			System.out.println("Juebebes de sed peligrosa.");
			break;
			
		case "viernes":
			System.out.println("Viernes de fiesta hasta morir.");
			break;
			
		default:
			System.out.println("Descansito de fin de semana o no escribiste bien jsjs.");
		}
	}
}
