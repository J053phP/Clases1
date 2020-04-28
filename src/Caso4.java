import java.util.Scanner;
public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n1 = 0;
		float n2 = 0;
		
		
		System.out.print("Primer numero: ");
		n1 = sc.nextFloat();
		
		System.out.print("Segundo numero: ");
		n2 = sc.nextFloat();
		
		float suma,  resta, producto, division, resto;
		suma = n1+n2;
		resta =n1-n2;
		
		System.out.println("---Resultados---");
		System.out.println("Suma: " + suma);
		System.out.println("Resta: " + resta);

	}

}
