package es.upm.aled.recursividad;

public class Potencia {

	public static void main(String[] args) {
		int resultado = potencia(2,5);
		System.out.println(resultado);

	}
	public static int potencia(int base, int exponente) {
		// Caso base
		if (exponente == 0) {
			return 1;
		}
		// Método recursivo
		else {
			return base*potencia(base, exponente-1);
		}
	}
}
