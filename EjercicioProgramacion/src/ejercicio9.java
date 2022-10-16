import java.util.Scanner;
public class ejercicio9 {

	public static void main(String[] args) {
		String cadena1,cadena2;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Ingrese cadena");
		cadena1 = keyboard.nextLine();
		
		System.out.println("Ingrese cadena");
		cadena2 = keyboard.nextLine();

		if(cadena1.equals(cadena2)) {
			System.out.println("Las cadenas son iguales");
			
		}else {
			System.out.println("Las cadenas son distantas");
		}
		
	}

}