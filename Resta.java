	/**
	 * ENTORNOS DE DESARROLLO
	 * Actividad 1. Tarea en equipo (4 personas). Generaci�n de documentaci�n
	 * Clase 2 - Resta 
	 * @author Cristian Fern�ndez
	 * @version 1.0
	 * @since 05/02/2021
	 */

public class Resta {

	/**
	 * Declaro varios valores para hacer las operaciones de resta,
	 * 3 valores reales y 2 enteros, y resultado como valor de la soluci�n.
	 */
	private double a, b, c, resultado;
	private int  d, e, acumulado;
	
	/**
	 * Declaro el constructor sin nada, vac�o.
	 */
	public Resta() {
		super();
	}

	/**
	 * Declaro el constructor con todos los valores.
	 * @param a es un n�mero real.
	 * @param b es un n�mero real.
	 * @param c es un n�mero real.
	 * @param d es un n�mero entero.
	 * @param e es un n�mero entero.
	 */
	public Resta(double a, double b, double c, int d, int e) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
	}
	
	public int getAcumulado() {
		return acumulado;
	}

	/**
	 *  M�todo para restar n�meros reales.
	 *  
	 *  Recibe 2 par�metros de entrada y 1 de salida que ser� el resultado.
	 *  
	 *  Casos especiales:
	 *  Si uno de los datos es 0, el resultado ser�a igual al otro valor.
	 *  Si uno de los datos introducido es negativo, dar�a error y el resultado ser�a -888.
	 *  
	 *  @param a n�mero real y primer par�metro de la resta.
	 *  @param b n�mero real y segundo par�metro de la resta.
	 *  
	 *  @return resultado
	 */
	public double restaReales() {
		if (a > 0 && b > 0)
			resultado = a - b;
		else {
			System.out.println("Error, dato introducido negativo");
			return -888;
		}
		return resultado;
	}

	/**
	 *  M�todo para restar n�meros enteros.
	 *  
	 *  Recibe 2 par�metros de entrada y 1 de salida que ser� el resultado.
	 *  
	 *  Casos especiales:
	 *  Si uno de los datos es 0, el resultado ser�a igual al otro valor.
	 *  Si uno de los datos introducido es negativo, dar�a error y el resultado ser�a -888.
	 *  
	 *  @param d n�mero entero y primer par�metro de la resta.
	 *  @param e n�mero entero y segundo par�metro de la resta.
	 *  
	 *  @return resultado
	 */
	public double restaEnteros() {
		if (d > 0 && e > 0)
			resultado = d - e;
		else {
			System.out.println("Error, dato introducido negativo");
			return -888;
		}
		return resultado;
	}

	/**
	 *  M�todo para restar tres n�meros reales.
	 *  
	 *  Recibe 3 par�metros de entrada y 1 de salida que ser� el resultado.
	 *  
	 *  Casos especiales:
	 *  Si uno de los datos es 0, el resultado ser�a igual a la resta de los otros dos valores.
	 *  Si uno de los datos introducido es negativo, dar�a error y el resultado ser�a -888.
	 *  
	 *  @param a n�mero real y primer par�metro de la resta.
	 *  @param b n�mero real y segundo par�metro de la resta.
	 *  @param c n�mero real y tercer par�metro de la resta.
	 *  
	 *  @return resultado
	 */
	public double restaTres() {
		if (a > 0 && b > 0 && c > 0)
			resultado = a - b - c;
		else {
			System.out.println("Error, dato introducido negativo");
			return -888;
		}
		return resultado;
	}

	/**
	 *  M�todo para restar n�mero acumulado.
	 *  
	 *  Recibe 1 par�metro de entrada y acumula el valor despues de restar.
	 *  
	 *  Casos especiales:
	 *  Si el dato introducido es 0, el valor no cambiar�a.
	 *  Si el dato introducido es negativo, se sumar�a en vez de restarse.
	 *  
	 *  @param acumulado n�mero entero, valor donde se va acumulando el resultado.
	 *  @param num1 n�mero entero, valor que se pasa para que le vaya restando a acumulado.
	 */
	public void restaAcumulado(int num1) {
		acumulado = acumulado - num1;
	}

	
	
	

}