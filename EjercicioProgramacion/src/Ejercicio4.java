import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		
		double lado1,lado2,area;
		
		System.out.println("Ingrese el lado1");
		
		lado1 = keyboard.nextInt();
		
		System.out.println("Ingrese el lado2");
		
		lado2 = keyboard.nextInt();
	
		area = lado1 * lado2;
	
		System.out.println(area);
	}

}

