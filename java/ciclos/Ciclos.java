package ciclos;

public class Ciclos {

	public static void main(String[] args) {
		// while
		
		int control = 0;
		
		while(control < 10) {
			System.out.println("Control = " + control);
			control++;
		}
		
		// do while
		control = 0;
		do {
			// código a ejecutar
			System.out.println("Control = " + control);
			// modificador de la variable control
			control++;
		} while(control < 3);
		
		// for
		for(int i=0; i<3; i++) {
			System.out.println("Control = " + i);
		}
		
		// break & continue
		for(int i=0; i<10; i++) {
			if(i%2 == 0) { // sólo se muestra cuando el valor de i sea número par
				System.out.println("Control = " + i);
				break; // termina el ciclo
				// sólo deja que se ejecuta una vez lo que está antes
			}
		}

		for(int i=0; i<10; i++) {
			if(i%2 == 0) { // sólo se muestra cuando el valor de i sea número par

				continue;
			}
			System.out.println("Control = " + i);
		}
		
	}
}
