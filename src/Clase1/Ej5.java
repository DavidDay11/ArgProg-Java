package Clase1;

public class Ej5 {

	public static void main(String[] args) {
		/*papel y lapiz*/
	    /* iguales o superiores a $489.083*/
	    int ingresoMensual=450000;
	    /* Tener 3 o más vehículos con una antigüedad menor a 5 años*/
	    int vehículos=2;
	    int antigüedad1=1;
	    int antigüedad2=4;
	    /*Tener 3 o más inmuebles.*/
	    int inmuebles=2;
	    /*Poseer una embarcación, una aeronave de lujo o ser titular de activos societarios que demuestren capacidad económica plena.*/
	        boolean embarcación=true;
	        boolean aeronave=false;
	        boolean titularActivosSocietarios=false;

	        

	        /*salida
	        //System.out.println("Debe declarar");*/

	        if(ingresoMensual>=489083 && vehículos>=3 && antigüedad1<5 && antigüedad2<5 && inmuebles>=3 && embarcación==true || aeronave==true || titularActivosSocietarios==true)
	        {
	            System.out.println("Usted pertenece al segmento de ingresos altos");
	        }
	        else
	        {
	            System.out.println("Usted No pertenece al segmento de ingresos altos");
	        }
	}


	}


