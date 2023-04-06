package Clase3;

import java.util.Scanner;

public class ej2 {

	 public static void main(String[] args) {
	        
	        Scanner sn = new Scanner(System.in);
	        sn.useDelimiter("\n");
	        
	        String abecedario = "abcdefghijklmnñopqrstuvwxyz";

	        System.out.println("Dame una frase");
	        String frase = sn.next();
	        int desplazamiento=1;
	        
	        String texto = codificar(abecedario, frase,desplazamiento);
	        System.out.println("Texto codificado: " + texto);
	        
	        texto = descodificar(abecedario, texto,desplazamiento);
	        System.out.println("Texto descodificado: " + texto);
	        
	    }
	    
	    public static String codificar(String abecedario, String texto,int desplazamiento){
	        String textoCodificado = "";
	        
	        texto = texto.toLowerCase();
	        
	        char caracter;
	        for (int i = 0; i < texto.length(); i++) {
	            caracter = texto.charAt(i);
	            
	            int pos = abecedario.indexOf(caracter);
	         
	            if(pos == -1){
	                textoCodificado += caracter;
	            }else{
	                textoCodificado += abecedario.charAt( (pos + desplazamiento) % abecedario.length() );//por si el desplazamiento es mayor a la proxima posicion de la letra
	            }
	            
	        }
	        
	        return textoCodificado;
	    }
	    
	    public static String descodificar(String abecedario, String texto,int desplazamiento){
	        String textoDescodificado = "";
	        
	        texto = texto.toLowerCase();
	        
	        char caracter;
	        for (int i = 0; i < texto.length(); i++) {
	            caracter = texto.charAt(i);
	            
	            int pos = abecedario.indexOf(caracter);
	         
	            if(pos == -1){
	                textoDescodificado += caracter;
	            }else{
	                if(pos - desplazamiento < 0){
	                    textoDescodificado += abecedario.charAt( abecedario.length() + (pos - desplazamiento) );
	                }else{
	                    textoDescodificado += abecedario.charAt( (pos - desplazamiento) % abecedario.length() );//por si el desplazamiento es mayor a la proxima posicion de la letra
	                }
	            }
	            
	        }
	        
	        return textoDescodificado;
	    }
}
