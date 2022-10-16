import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		int valor1,valor2;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Ingrese numero");
		valor1 = keyboard.nextInt();
		
		System.out.println("Ingrese numero");
		valor2= keyboard.nextInt();

		if(valor1 == valor2) {
			System.out.println("Los numeros son iguales");
			
		}else {
			System.out.println("Los nuemros sin distintos");
		}
		
	}

}
