
	/**
	 * 
	 * Representa la operaci�n de suma, que recibe los par�metros que introduce el usuario, y procede a realizar la operaci�n aritm�tica
	 * siempre que los par�metros se encuentren dentro del dominio matem�tico designado a cada tipo de suma. 
	 * 
	 * Por ejemplo: Si en suma2, el usuario introduce operandos que no son de tipo entero, 
	 * pedir� introducir ese tipo de n�meros para poder continuar con la operaci�n.
	 *
	 * @author <b>Ra�l L�pes L�pez.</b>
	 * @version 2.0
	 * 
	 */
public class Suma {
	
	/** 
	 * <b>M�todo 1:</b> Suma de dos n�meros reales, tendr� 2 par�metros de entrada y uno de salida, que ser� la soluci�n.
	 * 
	 * 
	 * @param num1 
	 * 			Primer n�mero que introduce el usuario, de tipo real (double)
	 * @param num2 
	 * 			Segundo n�mero que introduce el usuario, (double)
	 *
	 * @return <b>sum1</b> 
	 * 			Suma de los par�metros num1 y num2 (double). 
	 * 
	 */
	
	public double sumar1 (double num1, double num2) {
		return num1 + num2;
		
	}

	/** 
	 * <b>M�todo 2:</b>  Suma de dos n�meros enteros, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
	 *
	 * @param num1 
	 * 			Primer n�mero a sumar que introduce el usuario (int)
	 * @param num2 
	 * 			Segundo n�mero a sumar que introduce el usuario (int)
	 *
	 * @return <b>sum2</b> 
	 * 			Suma de los par�metros num1 y num2 (int)
	 * 
	 */

	public int sumar2 (int num1, int num2) {
		return num1 + num2;
	}
	
	/** 
	 * <b>M�todo 3:</b>  Suma de tres n�meros reales, tendr� 3 par�metros de entrada y uno de salida que ser� la soluci�n.
	 * 
	 * @param num1 
	 * 			Primer n�mero a sumar que introduce el usuario, de tipo real (double)
	 * @param num2 
	 * 			Segundo n�mero a sumar que introduce el usuario, (double)
	 * @param num3 
	 * 			Tercer n�mero a sumar que introduce el usuario, (double)
	 * 
	 * @return <b>sum3</b> 
	 * 			Suma de los par�metros num1, num2 y num3
	 * 
	 */
	
	public double sumar3 (double num1, double num2, double num3) {
		return num1 + num2 + num3;
	}

	/** 
	 * <b>M�todo 4:</b>  Suma con valor acumulado, tendr� un par�metro de entrada y la clase deber� de guardar el valor acumulado.
	 * 
	 * @param acum 
	 * 			Representa el valor resultante de una suma anterior (double)
	 * @param num1 
	 * 			Representa el n�mero a sumar que introduce el usuario para que se sume al acumulado en memoria (par�metro de entrada) (double)
	 *  
	 * @return <b>sum4</b> 
	 * 			Ejecuta la suma de acum y el par�metro de entrada num1
	 */
	
	public double sumar4 (double acum, double num1) {
		return acum + num1;
	}

	/**
	 * <b>Casos Especiales:</b>
	 * 
	 * Es posible que num1, num2 o num3 tengan el valor 0
	 * Los resultados de los m�todos pueden devolver un n�mero negativo si se introducen n�meros negativos
	 * En el m�todo 1, los par�metros num1 y num2 pueden ser constantes, por ejemplo, el n�mero PI
	 * Si en el m�todo 2 y/o en el m�todo 4, el usuario introduce un n�mero no real, el programa ejecutar� un mensaje de error por un desbordamiento de variable
	 * 
	 */
	 public void especiales() {
		 return;
	 }
}
