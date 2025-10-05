package es.upm.aled.recursividad;

public class Ejercicios2_1 {
	// EJERCICIO 2: Dado el siguiente método, cual será su salida estándar, si ejecutamos 
	//ex232(6):
	public static void main(String[] args) {
		
	ex232(6);
	}
	public static void ex232(int n) { 
		// Caso base
		if (n <= 0) return; 
		System.out.println(n); 
		// Paso recursivo
		ex232(n-2); 
		ex232(n-3); 
		System.out.println(n); 
		} 
}
// Explicación de la recursividad: 
// Paso 1: ex232(6) --> Imprime 6 --> Llama a ex232(4) y ex232(3)--> Imprime 6 de nuevo
// Paso 2: ex232(4) --> Imprime 4 --> Llama a ex232(2) y ex232(1) --> Imprime 4 de nuevo
// Paso 3: ex232(2) --> Imprime 2 --> Llama a ex232(0) y ex232(-1) --> No imprime nada (caso base)
// Paso 4: ex232(1) --> Imprime 1 --> ex232(-1) y ex232(-2) --> No imprimen nada (caso base)

// Su salida es:
/*4
2
2
1
1
4
3
1
1
3
6
*/