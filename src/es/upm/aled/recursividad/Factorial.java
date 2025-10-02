package es.upm.aled.recursividad;

public class Factorial {

	public static void main(String[] args) {
		int resultado = factorial(-1);
		System.out.println(resultado);
		

	}
		public static int factorial(int n) {
		if (n <= 1) { // Caso base
		return 1;
		}
		else {
		return n*factorial(n-1); // Método recursivo
		
		// ¿Qué sucede en la versión recursiva de factorial que tenemos en las 
		// transparencias, si el parámetro es un número negativo?
		
				}
			}
		}