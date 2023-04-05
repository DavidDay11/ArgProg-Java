package Clase3;
/*1. Utilizando solo tipos primitivos, String (solo usar método length), vectores,
iteraciones simples y condicionales, genere una clase por ejercicio que posea los
siguientes métodos:
a. Dado un String y una letra, que cuente la cantidad de apariciones de la letra en
el String
b. Dados 3 números y un orden (ascendente o decreciente) que ordene los
mismos y los retorne en un vector de 3
c. dado un vector de números, y un número X, que sume todos los números > X y
retorne el resultado

 * */

public class Ej1 {

	public static void main(String[] args) {
	
		String texto="hola mundo";
		char letra='o';
		int contador=0;

		for(int i=0;i<texto.length();i++)
		{
			if(texto.charAt(i)==letra)
			{
				contador++;
			}
		}
		System.out.println("La letra '" + letra + "' aparece "+contador+" veces en el texto.");
	}

}
