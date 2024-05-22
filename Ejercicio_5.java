import java.util.Scanner;

public class Ejercicio_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese el primer número: ");
		int numero1 = scanner.nextInt();
		
		System.out.print("Ingrese el segundo número: ");
		int numero2 = scanner.nextInt();
		
		System.out.println("Estas son las opciones de cálculo: ");
		System.out.println("1 para suma");
		System.out.println("2 para resta");
		System.out.println("3 para multiplicación");
		System.out.println("4 para división");
		
		System.out.print("Ingrese una opción: ");
		
		int respuesta = scanner.nextInt();
		
		int numeroFinal;
		
		switch(respuesta) {
			case 1:
				numeroFinal = numero1 + numero2;
				
				System.out.println("El resultado da " + numeroFinal);
				break;
			
			case 2:
				numeroFinal = numero1 - numero2;
				
				System.out.println("El resultado da " + numeroFinal);
				break;
			
			case 3:
				numeroFinal = numero1 * numero2;
				
				System.out.println("El resultado da " + numeroFinal);
				break;
				
			case 4:
				if(numero1 % numero2 != 0) {
					System.out.println("El resultado da " + (float) numero1 / (float) numero2);
				}
				
				else {
					numeroFinal = numero1 / numero2;
					
					System.out.println("El resultado da " + numeroFinal);
				}
				break;
				
			default:
				System.out.println("Valor inválido");
		}
	}

}
