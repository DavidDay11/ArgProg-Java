package Clase1;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int numA=3;
        int numB=24;

        System.out.println("desea mostrar los numeros pares?");
        System.out.println("(S) / (N)");
        String rta=sc.next();

        if(rta.equals("S") || rta.equals("s"))
        {
           while (numA<=numB)
        {
            if(numA%2==0)
            {
                System.out.println(numA+" Es Par");
            }
            
            numA++;
        }
        }
        else{
            while (numA<=numB)
        {
            if(numA%2!=0)
            {
                System.out.println(numA+" Es Impar");
            }
            
            numA++;
        }
        }
	}

}
