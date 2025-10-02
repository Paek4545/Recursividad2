package es.upm.aled.recursividad;

public class TorreHanoi {
	/* EJERCICIO 1 - Tema 2.2
	 * Torres de Hanoi: hay que mover N discos de la torre A a la torre B. Pero 
	debemos mover con las siguientes restricciones: 
		1. Los discos se mueven de forma individual. 
		2. No puede haber un disco mas ancho sobre otro menos estrecho 
		3. Solo podemos mover el disco que se encuentra en la parte mas alta de la torre.
		Diseñar el algoritmo que permita resolver el problema. */
	
	public static void main(String[] args) {
		// Ponemos 3 discos por ejemplo
		int discos = 3;
		hanoi(discos, 'A', 'B', 'C');
	}
	
	// Vamos a necesitar 4 parámetros:
	// n = el número de discos
	// origen = la torre origen (donde partimos)
	// destino = la torre destino (donde queremos mover los discos)
	// torreAuxiliar = la torre auxiliar o intermedia de apoyo (como se ve en el dibujo):
	public static void hanoi(int n, char origen, char destino, char torreAuxiliar) {
		// Caso base (comprobamos si solo queda un disco en la torre y lo movemos directamente a la torre destino)
		if (n == 1) {
			System.out.println("Movemos el disco 1 de " + origen + " a " + destino);
		} else {
			// Movemos todos los discos (menos el último) del origen a la torre auxiliar (paso 1)
			hanoi(n - 1, origen, torreAuxiliar, destino);
			// Movemos el disco n desde la torre origen hasta la torre destino (paso 2)
			System.out.println("Movemos el disco " + n + " desde " + origen + " hasta " + destino);
			// Movemos de nuevo todos los discos (menos el último) desde la torre auxiliar al destino (paso 3)
			hanoi(n-1, torreAuxiliar, destino, origen);
		}
		
	}

}
