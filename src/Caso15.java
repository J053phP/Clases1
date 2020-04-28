import java.util.Scanner;

public class Caso15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresar cantidad: ");
		int cantidad = sc.nextInt();
		
		System.out.println("Ingresar precio: ");
		float precio = sc.nextFloat();
		
		float imp_s, imp_d, imp_e;
		imp_s = cantidad * precio;
		imp_d = (float) (imp_s / 3.24);
		imp_e = (float) (imp_s / 3.75);
		
		System.out.println("--Resultados--");
		System.out.println("Importe en soles: "+imp_s);
		System.out.println("Importe en dolares: "+imp_d);
		System.out.println("Importe en euros: "+imp_e);
		
		
		

	}

}
