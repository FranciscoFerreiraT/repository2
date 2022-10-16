import java.util.Scanner;
public class ejercicio11 {

	public static void main(String[] args) {
		int valor1,valor2,resultado;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Ingrese numero");
		valor1 = keyboard.nextInt();
		valor1 = valor1 +1;
		System.out.println("el nuevo valor es " + valor1);
		
		System.out.println("Ingrese numero");
		valor2= keyboard.nextInt();

	resultado = valor1 * valor2;
	System.out.println("El resultado es " + resultado);
		
	}

}
