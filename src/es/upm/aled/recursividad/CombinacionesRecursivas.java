package es.upm.aled.recursividad;

import java.util.ArrayList;
import java.util.List;

// Generar todas las combinaciones de un conjunto Ejemplo: {a, b, c} → abc, ab, ac, a, b, c, ...
	// Usa inclusión/exclusión de cada elemento.
public class CombinacionesRecursivas {

	public static void main(String[] args) {
		// Nos creamos un conjunto de 3 letras
		char[] conjunto = {'a','b','c'};
		generarCombinaciones(conjunto);

	}
	public static void generarCombinaciones(char[] conjunto) {
		// Creamos una lista vacía con los resultados a poner posteriormente
		List<String> resultado = new ArrayList<String>();
		// Lamamos inicial que llama al método recursivo para generar todas las combinaciones del conjunto
		backtrack(conjunto, 0, "", resultado);
		
		// Recorremos la lista de las combinaciones generadas y lo imprimimos:
		for (String r : resultado) {
			// Imprime las combinaciones en consola
			System.out.println(r);
		}
	}
	// Creamos la función recursiva:
	public static void backtrack(char[] conjunto, int index, String actual, List<String> resultado) {
		// Caso base: llegamos al final del array
		if (index == conjunto.length) {
			// Agregamos si la combinación NO está vacía
			if (!actual.isEmpty()) {
				resultado.add(actual);	
			}
			return;
		}
		// Paso recursivo
		// Caso 1: excluimos el elemento actual
		// No quiero incluir conjunto[index] en la combinación actual, así que paso al siguiente elemento
		// Es decir, si quito este método recursivo, solo saldría por pantalla la combinación abc
		backtrack(conjunto, index +1, actual, resultado);
		
		// Caso 2: incluimos el elemento actual
		// Sí quiero incluir conjunto[index] en la combinación actual, y luego sigo con el siguiente elemento
		// Es decir, si quito el método recursivo, no saldría en pantalla la combinación abc
		backtrack(conjunto, index + 1, actual + conjunto[index], resultado);
	}
}
