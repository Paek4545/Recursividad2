package es.upm.aled.recursividad;

public class NumerosBinarios {
	// Números binarios de longitud N
	// Ejemplo: para n = 3 → 000, 001, 010, 011, 100, 101, 110, 111
	public static void main(String[] args) {
		// Nos creamos la longitud del binario: 
		int n = 3;
		// Llamos al método sin ningún número para que vaya rellenando el método
		generarBinarios(n, "");
		

	}
	// Método recursivo
	public static void generarBinarios(int n, String actual) {
		// Caso base -> En caso de que la cadena llegue a rellenarse, imprimimos todo por pantalla
		if (actual.length() == n) {
			System.out.println(actual);
			return;
		}
		// Paso recursivo
		// Agregamos 0 o 1 hasta completar la longitud de la cadena
		generarBinarios(n, actual + "0");
		generarBinarios(n, actual + "1");
		// Estamos creando 2 caminos: 
		// 0 --> 00 o 01 o bien: 1 -> 10 o 11
		// Ahora bien, cada uno de estas 4 opciones tienen otras 2 opciones (en caso de que sea de longitud 3):
		// Binarios que comienzan en 0:
		// 00 --> 000 o 001
		// 01 --> 010 o 011
		// Binarios que comienzan en 1:
		// 10 --> 100 o 101
		// 11 --> 110 o 111
	}
}
