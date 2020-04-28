import java.util.Scanner;
public class Clase14 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
		
		System.out.print("Ingrese numero: ");
		int numero = sc.nextInt();
		
		int sumatoria;
		sumatoria= (numero *(numero+1))/2;
		
		
		System.out.println("---Resultados---");
		System.out.println("La sumatoria de " + numero + " es: "+ sumatoria );
		
		
	}

}
