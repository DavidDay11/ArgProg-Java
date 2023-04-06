package Clase3;

public class ej1c {

	public static void main(String[] args) {
		int[] numeros = {2, 5, 1, 8, 3, 9};
		int x = 4;
		int suma = 0;

		for (int i = 0; i < numeros.length; i++) {
		    if (numeros[i] > x) {
		        suma += numeros[i];
		    }
		}

		System.out.println("La suma de los números mayores a " + x + " es " + suma);


	}

}
