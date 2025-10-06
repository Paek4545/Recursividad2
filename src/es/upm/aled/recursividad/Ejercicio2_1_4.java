package es.upm.aled.recursividad;

public class Ejercicio2_1_4 {
	// EJERCICIO 2_1_4
	public static void main(String[] args) {
	System.out.println(ex235(6));
	

}
	// Que problema tiene la siguiente función recursiva: 
	public static String ex234(int n) { 
	String s = ex234(n-3) + n + ex234(n-2) + n; 
	if (n <= 0) return ""; 
	return s; 
	} 
	// El error está en el if, donde se produce el error java.lang.StackOverflowError. Este error significa
	// que ha ocurrido un desbordamiento de la pila (o una recursión infinita) por lo que el código
	// nunca llega a pararse. Para solucionarlo, el if tendría que ir ANTES del paso recursivo, es decir:
	public static String ex235(int n) { 
		if (n <= 0) return ""; 
String s = ex235(n-3) + n + ex235(n-2) + n; 
		return s; 
	}
		
}
