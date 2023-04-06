package Clase3;

import java.util.Arrays;

public class ej1B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 3;
		int num2 = 1;
		int num3 = 2;
		boolean ascendente = false;

		int[] numeros = {num1, num2, num3};
		Arrays.sort(numeros);
		if (!ascendente) {
		    int temp = numeros[0];
		    numeros[0] = numeros[2];
		    numeros[2] = temp;
		}
		System.out.println("Los números ordenados son: " + Arrays.toString(numeros));
}
}

