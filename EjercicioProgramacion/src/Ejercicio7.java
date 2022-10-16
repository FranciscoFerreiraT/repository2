import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		
		int numero,numero2,resultado;
		
		System.out.println("Ingrese numero");
		numero = keyboard.nextInt();
		
		System.out.println("Ingrese numero");
		numero2 = keyboard.nextInt();
		
		resultado = numero%numero2 ;
		
		System.out.println(resultado);
	}

}
