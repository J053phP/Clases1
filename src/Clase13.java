import java.util.Scanner;
public class Clase13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		String nombre = sc.nextLine();
		
		System.out.print("Ingrese apellido: ");
		String apellido = sc.nextLine();
		
		System.out.println("--Resultados--");
		System.out.println("Nombres y apellidos: " + nombre + " " + apellido);
		
		

	}

}
