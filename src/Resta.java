

	/**
	 * Representa la operaci�n de resta, recibe los par�metros que introduce el usuario, y procede a realizar la operaci�n aritm�tica, 
	 * siempre que los par�metros se encuentren dentro del dominio matem�tico designado a cada tipo de resta. 
	 * 
	 * Por ejemplo: Si en resta2, el usuario introduce operandos que no son de tipo entero, 
	 * pedir� introducir ese tipo de n�meros para poder realizar continuar con la operaci�n.
	 * 
	 * @author <b>Carlos Fuentes V�zquez</b>
	 * @version 2.0
	 * 
	 */
public class Resta {

	/** 
	 * <b>M�todo 1:</b>  Resta de dos n�meros reales, tendr� 2 par�metros de entrada y uno de salida, que ser� la soluci�n.
	 *  
	 * @param num1 
	 * 			Primer n�mero a restar que introduce el usuario (double)
	 * @param num2 
	 * 			Segundo n�mero a restar que introduce el usuario (double)
	 *
	 * @return <b>rest1</b> Devuelve la resta de num1 y num2
	 * 		
	 */
	
	public double restar1 (double num1, double num2) {
		return num1 - num2;
	}

	/** 
	 * <b>M�todo 2:</b>  Resta de dos n�meros enteros, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
	 *  
	 * @param num1 
	 * 			Primer n�mero a restar que introduce el usuario (int)
	 * @param num2 
	 * 			Segundo n�mero a restar que introduce el usuario (int)
	 *
	 * @return res2 
	 * 			Devuelve la resta de num1 y num2 (int)
	 * 
	 */
	
	public int restar2 (int num1, int num2) {
		return num1 - num2;
	}

	/** 
	 * <b>M�todo 3:</b>  Resta de tres n�meros reales, tendr� 3 par�metros de entrada y uno de salida que ser� la soluci�n.
	 * 
	 * @param num1 
	 * 			Primer n�mero a restar que introduce el usuario (double)
	 * @param num2 
	 * 			Segundo n�mero que a estar introduce el usuario (double)
	 * @param num3 
	 * 			Tercer n�mero que a restar introduce el usuario (double)
	 *
	 * @return <b>rest3</b> 
	 * 			Devuelve la resta de los par�metros num1, num2 y num3 (double)
	 */
	
	public double restar3 (double num1, double num2, double num3) {
		return num1 - num2 - num3;
	}

	/** 
	 *<b>M�todo 4:</b>  Resta con valor acumulado, tendr� un par�metro de entrada y la clase deber� de guardar el valor acumulado.
	 *  
	 * @param acum 
	 * 			Representa el valor resultante de una resta anterior (double)
	 * @param num1 
	 * 			Representa el n�mero a restar que introduce el usuario para que se reste al acumulado en memoria (double)
	 *
	 * @return <b>rest4</b> 
	 * 			Devuelve la resta de acum y num1 (double)
	 */
	
	public double restar4 (double acum, double num1) {
		return acum + num1;
	}
	
	/**
     * <b>Casos Especiales</b>:
     * 
     * Es posible que num1, num2 o num3 tengan el valor 0
     * Los resultados de los m�todos pueden devolver un n�mero negativo si se introducen  n�meros negativos
     * En el m�todo 1, los par�metros num1 y num2 pueden ser constantes, por ejemplo, el n�mero PI
     * Si en el m�todo 2 y/o en el m�todo 4, el usuario introduce un n�mero no real, el programa ejecutar� un mensaje de error por un desbordamiento de variable
     * 
     */
	
	public void especiales() {
		 return;
	 }

}
