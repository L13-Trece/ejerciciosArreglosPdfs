package ejercicioS5hablal;

import java.util.Arrays;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arreglo;
arreglo = new int [6];
String arregloCadena [];
arregloCadena = new String [6];

arreglo [0] = 1;
arreglo [1] = 3;
arreglo [2] = 5;
arreglo [3] = 8;
arreglo [4] = 9;
arreglo [5] = 15;
arregloCadena [0] = "Platano";
arregloCadena [1] = "Manzana";
arregloCadena [2] = "Pera";
arregloCadena [3] = "Durazno";
arregloCadena [4] = "Melon";
arregloCadena [5] = "Sandia";

System.out.println (Arrays.toString(arreglo));
arregloCadena [0] = "Guinda";
System.out.println(Arrays.toString(arregloCadena));

//for(each)

for (int elem : arreglo) {
	System.out.println("El numero en el indice es: "+elem);
}

//por indice

for (int i=0; i < arreglo.length; i++) {
	System.out.println ("El numero en el indice es : "+ arreglo[i]);
}

// Impresion arregloCadena

for (int i=0; i<arregloCadena.length; i++) {
	System.out.println("La fruta con el indice "+i+" es : "+arregloCadena[i]);
}







	}

}
