
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		
		double radio,area,longitud;
		
		System.out.println("Ingrese el radio");
		
		radio = keyboard.nextInt();
		
		area = Math.PI * Math.pow(radio,2);
		System.out.println(area);
		
		longitud= 2 * Math.PI * radio;
		System.out.println(longitud);
	}

}