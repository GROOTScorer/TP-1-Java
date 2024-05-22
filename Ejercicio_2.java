public class Ejercicio_2 {
	public static void main(String[] args) {
        for (int i = 50; i <= 100; i++) {
            if (esPrimo(i) == true) {
                System.out.println("primo");
            }
            
            else {
                divisores(i);
                System.out.print("\n");
            }
        }
	}
	
	public static boolean esPrimo(int i) {
		for(int j = 2;j<=i/2;j++) {
			if(i % j == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void divisores(int i) {
		for(int j = 2;j<=i/2;j++) {
			if(i % j == 0) {
				System.out.print(j + " ");
			}
		}
	}
}
