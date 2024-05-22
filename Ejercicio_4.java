public class Ejercicio_4 {
	public static void main(String[] args) {
		String[] nombres = {"Esteban", "Miguel", "Marcos", "Juana", "Dante", "María"};		// Se crea un array con distintos nombres
		
		for(String nombre : nombres) { 		// Se usa el for-each para que cada nombre en el array sea asignado a la variable 'nombre'
			System.out.println(nombre);		// Se imprime cada elemento del array por cada iteración
		}
	}
}
