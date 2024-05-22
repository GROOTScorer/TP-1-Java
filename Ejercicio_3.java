import java.util.Scanner;

public class Ejercicio_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero = 0;
		
		int i = 0;
		
		while(numero <= 100 || (esPrimo(numero) == false )) {
			System.out.print("Ingrese un número: ");
			
			numero = scanner.nextInt();
		}
	}

	public static boolean esPrimo(int numero) {
		int i = 0;
		if(numero <= 1) {
			return false;
		}

		for(i = 2;i<=numero/2;i++) {
			if(numero % i == 0) {
				return false;
			}
		}
		return true;
	}
}