package es.upm.aled.recursividad;

public class Factorial {

	public static void main(String[] args) {
		int resultado = factorial(5);
		System.out.println(resultado);
		

	}
		public static int factorial(int n) {
		if (n <= 1) { // Caso base
		return 1;
		}
		else {
		return n*factorial(n-1); // Método recursivo
		// Lo que hace este código es:
		// le pasamos el factorial(5) 
		// = factorial(4)*5
		// = factorial(3)*4*5
		// = factorial(2)*3*4*5
		// = factorail(1)*2*3*4*5
		// = factorial(0)*1*2*3*4*5 = 1 (caso base) * 1 * 2 * 3 * 4 * 5 = 120
		
				}
			}
		}