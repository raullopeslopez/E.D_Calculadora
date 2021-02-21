
	/**
	 * 
	 * Representa la operación de suma, que recibe los parámetros que introduce el usuario, y procede a realizar la operación aritmética
	 * siempre que los parámetros se encuentren dentro del dominio matemático designado a cada tipo de suma. 
	 * 
	 * Por ejemplo: Si en suma2, el usuario introduce operandos que no son de tipo entero, 
	 * pedirá introducir ese tipo de números para poder continuar con la operación.
	 *
	 * @author <b>Raúl Lópes López.</b>
	 * @version 2.0
	 * 
	 */
public class Suma {
	
	/** 
	 * <b>Método 1:</b> Suma de dos números reales, tendrá 2 parámetros de entrada y uno de salida, que será la solución.
	 * 
	 * 
	 * @param num1 
	 * 			Primer número que introduce el usuario, de tipo real (double)
	 * @param num2 
	 * 			Segundo número que introduce el usuario, (double)
	 *
	 * @return <b>sum1</b> 
	 * 			Suma de los parámetros num1 y num2 (double). 
	 * 
	 */
	
	public double sumar1 (double num1, double num2) {
		return num1 + num2;
		
	}

	/** 
	 * <b>Método 2:</b>  Suma de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
	 *
	 * @param num1 
	 * 			Primer número a sumar que introduce el usuario (int)
	 * @param num2 
	 * 			Segundo número a sumar que introduce el usuario (int)
	 *
	 * @return <b>sum2</b> 
	 * 			Suma de los parámetros num1 y num2 (int)
	 * 
	 */

	public int sumar2 (int num1, int num2) {
		return num1 + num2;
	}
	
	/** 
	 * <b>Método 3:</b>  Suma de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la solución.
	 * 
	 * @param num1 
	 * 			Primer número a sumar que introduce el usuario, de tipo real (double)
	 * @param num2 
	 * 			Segundo número a sumar que introduce el usuario, (double)
	 * @param num3 
	 * 			Tercer número a sumar que introduce el usuario, (double)
	 * 
	 * @return <b>sum3</b> 
	 * 			Suma de los parámetros num1, num2 y num3
	 * 
	 */
	
	public double sumar3 (double num1, double num2, double num3) {
		return num1 + num2 + num3;
	}

	/** 
	 * <b>Método 4:</b>  Suma con valor acumulado, tendrá un parámetro de entrada y la clase deberá de guardar el valor acumulado.
	 * 
	 * @param acum 
	 * 			Representa el valor resultante de una suma anterior (double)
	 * @param num1 
	 * 			Representa el número a sumar que introduce el usuario para que se sume al acumulado en memoria (parámetro de entrada) (double)
	 *  
	 * @return <b>sum4</b> 
	 * 			Ejecuta la suma de acum y el parámetro de entrada num1
	 */
	
	public double sumar4 (double acum, double num1) {
		return acum + num1;
	}

	/**
	 * <b>Casos Especiales:</b>
	 * 
	 * Es posible que num1, num2 o num3 tengan el valor 0
	 * Los resultados de los métodos pueden devolver un número negativo si se introducen números negativos
	 * En el método 1, los parámetros num1 y num2 pueden ser constantes, por ejemplo, el número PI
	 * Si en el método 2 y/o en el método 4, el usuario introduce un número no real, el programa ejecutará un mensaje de error por un desbordamiento de variable
	 * 
	 */
	 public void especiales() {
		 return;
	 }
}
