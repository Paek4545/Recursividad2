package es.upm.aled.recursividad;

public class Ejercicio2_1_5 {
// EJERCICIO 2_1_5
	public static void main(String[] args) {
		System.out.println(misterio(2,25));
		System.out.println(misterio(3,11));

	}
//	Considerar la siguiente función recursiva: 
		public static int misterio(int a, int b) { 
		if (b == 0)     return 0; 
		if (b % 2 == 0) return misterio(a+a, b/2); 
		return misterio(a+a, b/2) + a; 
		} 
		/* Que devuelve misterio(2,25)?, y misterio(3,11)?. Que nos devuelve 
		misterio(a,b)? Que devuelve si remplazamos a+a por a*a? */
}
	// misterio(2, 25) devuelve 50
	// misterio(3, 11) devuelve 33
	// Para entender el código, es necesario entender primero lo que hace el paso recursivo. En este caso:
	// Cuando b es par, no suma nada, solo duplica a y divide b por 2.
	// Cuando b es impar, además de eso, suma a
// Por tanto, podemos decir que misterio(a, b) calcula a * b usando duplicaciones y divisiones sucesivas.
	/* Sería algo así el algoritmo: 
	 Suponemos que al dividir entre 2, redondea hacia abajo.
	misterio(2,25)
	= misterio(4,12) + 2     (25 impar)
	= misterio(8,6) + 2
	= misterio(16,3) + 2		(3 impar)
	= misterio(32,1) + 16 + 2	(1 impar)
	= misterio(64,0) + 32 + 16 + 2
	= 0 (caso base) + 32 + 16 + 2 = 50 
	
	Para misterio(3,11) tenemos por tanto que:
	misterio(3,11)
	= misterio(6,5) + 3
	= misterio(12, 2) + 6 + 3
	= misterio(24, 1) + 6 + 3
	= misterio(48, 0) + 24 + 6 + 3
	= 0 (caso base) + 24 + 6 + 3 = 33
	
	Si reemplazamos a+a por a*a ya no devuelve una multiplicación sino una potencia
	*/

	

