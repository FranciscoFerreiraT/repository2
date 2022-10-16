import java.util.Scanner;
public class ejercicio12 {

	public static void main(String[] args) {
		int edad;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Ingrese tu edad");
		edad = keyboard.nextInt();
		
		

		if(edad>=18) {
			System.out.println("Puedes tener carnet de conducir");
			
		}else {
			System.out.println("No puedes tener carnet de conducir");
		}
		
	}

}
