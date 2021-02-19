	

	/**
	 * Representa la operaci�n producto, recibe los par�metros que introduce el usuario, y procede a realizar la operaci�n aritm�tica, 
	 * siempre que los par�metros se encuentren dentro del dominio matem�tico designado a cada tipo de producto. 
	 * 
	 * Por ejemplo: Si en producto2, el usuario introduce operandos que no son de tipo entero, 
	 * pedir� introducir ese tipo de n�meros para poder realizar continuar con la operaci�n.
	 *
	 * @author <b>M�nica de la Puebla Pascual</b>
	 * @version 2.0
	 * 
	 */

public class Multiplicacion {
	
	/** 
	 * <b>M�todo 1:</b> Producto de dos n�meros reales, tendr� 2 par�metros de entrada y uno de salida, que ser� la soluci�n. 
	 * 
	 * @param num1 
	 * 			Primer n�mero que introduce el usuario (double)
	 * @param num2 
	 * 			Segundo n�mero que introduce el usuario (double)
	 * 
	 * @return <b>product1</b> 
	 * 			Devuelve el producto de num1 y num2 (double)
	 * 
	 */
	public double multiplicar1 (double num1, double num2) {
		return num1 * num2;
	}

	/** 
	 * <b>M�todo 2:</b> Producto de dos n�meros enteros, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n. 
	 * 
	 * @param num1 
	 * 			Primer n�mero a multiplicar que introduce el usuario (int)
	 * @param num2 
	 * 			Segundo n�mero a multiplicar que introduce el usuario (int)
	 *
	 * @return <b>product2</b>  
	 * 			Devuelve el producto de num1 y num2 (int)
	 * 
	 */
	
	public int multiplicar2 (int num1, int num2) {
		return num1 * num2;
	}

	/** 
	 * <b>M�todo 3:</b> Producto de tres n�meros reales, tendr� 3 par�metros de entrada y uno de salida que ser� la soluci�n. 
	 * 
	 * @param num1 
	 * 			Primer n�mero a multiplicar que introduce el usuario (double)
	 * @param num2 
	 * 			Segundo n�mero a multiplicar que introduce el usuario (double)
	 * @param num3 
	 * 			Tercer n�mero a multiplicar que introduce el usuario (double)
	 *
	 * @return <b>product3</b>  
	 * 			Devuelve el producto de los par�metros num1, num2 y num3 (double)
	 * 
	 */
	
	public double multiplicar3 (double num1, double num2, double num3) {
		return num1 * num2 * num3;
	}
	
	/** 
	 * <b>M�todo 4:</b> Potencia, tendr� dos par�metros de entrada (base y exponente) y uno de salida que ser� la soluci�n. 
	 * 
	 * @param num1 
	 * 			Primer n�mero a multiplicar que introduce el usuario, que act�a como el valor de la base (es num1)
	 * @param num2  
	 * 			Segundo n�mero a multiplicar que introduce el usuario, que act�a como el valor del exponente (es num2)
	 *
	 * @return <b>potencia</b> 
	 * 			Devuelve el producto de num1 por s� mismo tantas veces como indique el num2
	 * 
	 */
	
	public double multiplicar4 (double num1, double num2) {
		return num1 * num2;
	}
	
	/**
     * <b>Casos Especiales:</b>
     * 
     *  Es posible que num1, num2 o num3 tengan el valor 0
     * 
     *  En caso de no poder declarar n�meros de valores negativos, si los dos fuesen negativos, se anular�an entre ellos,
     *  es decir, (-*- = +), simplemente podr�an declararse los n�meros sin el valor negativo porque, por ejemplo, (([-2]*[-2]) = (2*2)), cuyo resultado es 4.
     *  
     *  Si uno de ellos fuese negativo, podr�amos hacer la multiplicaci�n con los positivos, teniendo en cuenta al final que el resultado ser�a el obtenido pero con signo negativo
     *
     *  Si el resultado de la potencia es muy grande, se puede producir desbordamiento y saldr� un mensaje de error
     * 
     */
	
	public void especiales() {
		 return;
	 }
}
