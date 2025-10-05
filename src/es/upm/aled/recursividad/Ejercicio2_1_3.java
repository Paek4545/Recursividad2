package es.upm.aled.recursividad;

public class Ejercicio2_1_3 {
	// EJERCICIO 3: Que valor devuelve ex233(6):
	public static void main(String[] args) {
		System.out.println(ex233(6));
	}
	public static String ex233(int n) { 
		// Caso base
		if (n <= 0) return ""; 
		// Paso recursivo
		return ex233(n-3) + n + ex233(n-2) + n; 
		} 
}
// Valor que devuelve: 311361142246