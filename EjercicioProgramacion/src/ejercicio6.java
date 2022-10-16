import java.util.Scanner;
public class ejercicio6 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String nombre,localidad,gusto;
		
		System.out.println("Ingrese el Nombre");
		
		nombre = keyboard.nextLine();
		
		System.out.println("Ingrese el locaclidad");
		
		localidad = keyboard.nextLine();
		
		System.out.println("Ingrese el gusto");
		
		gusto = keyboard.nextLine();
		
		System.out.println("Hola, mi nombre es " + nombre + " soy de " + localidad + " y me gusta el " + gusto);

	}

}
