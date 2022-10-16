import java.util.Scanner;
public class ejercicio10 {

	public static void main(String[] args) {
		int valor1,valor2,valor3;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Ingrese numero 1 ");
		valor1 = keyboard.nextInt();
		
		System.out.println("Ingrese numero 2 ");
		valor2= keyboard.nextInt();
		
		System.out.println("Ingrese numero 3 ");
		valor3= keyboard.nextInt();

		if(valor1 == valor2 || valor1 == valor3 || valor2 == valor3) {
			System.out.println("Hay numeros iguales");
			
		}else{
			System.out.println("Los nuemros son distintos");
		}
		
	}

}
