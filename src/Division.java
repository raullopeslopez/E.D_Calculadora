

	/**
	 * Representa la operaci�n de divisi�n; �sta recibe los par�metros que introduce el usuario, y procede a realizar la operaci�n aritm�tica
	 * siempre que los par�metros, se encuentren dentro del dominio matem�tico designado a cada tipo de divisi�n. 
	 * 
	 * 
	 * @author <b>Adri�n Nuevo P�rez</b>
	 * @version 2.0
	 * 
	 */

public class Division {

	/** 
	 * <b>M�todo 1:</b> Divisi�n de dos n�meros reales, tendr� 2 par�metros de entrada y uno de salida, que ser� la soluci�n. 
	 * 
	 * @param num1
	 * 			Primer n�mero que introduce el usuario: es dividendo (double)
	 * @param num2
	 * 		    Segundo n�mero que introduce el usuario: es el divisor (double)
	 * 
	 * @return <b>div1</b>
	 * 			Resultado del cociente de num1 entre num2 (double)
	 * 
	 */

	public double dividir1 (double num1, double num2) {
		return num1 / num2;
	}

	
	/** 
	 * <b>M�todo 2:</b> Divisi�n de dos n�meros enteros (los reales incluye a los enteros, pero los enternos son valores cuyos elementos de su conjunto n�merico
	 * contiene los n�meros naturales), dicha operaci�n tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n. 
	 * 
	 * @param num1 
	 * 			Primer n�mero que introduce el usuario: es dividendo (int)
	 * @param num2 
	 * 			Segundo n�mero que introduce el usuario: es el divisor (int)
	 * 
	 * @return <b>div2</b>
	 * 			Resultado del cociente de num1 entre num2 (int)
	 */

	public int dividir2 (int num1, int num2) {
		return num1 / num2;
	}
	
	/**
	 * <b>M�todo 3:</b> Inverso de un n�mero real, tendr� un par�metro de entrada y uno de salida que ser� la soluci�n.
	 * 
	 * @param num1
	 * 			N�mero que introduce el usuario (double)
	 * 
	 * 
	 * @return <b>div3</b>
	 * 			Resultado es 1 y se obtiene de num1 = num1 (-1) (double)
	 */

	public double multiplicar3 (double num1) {
		return num1;
	}
	
	/**
	 * <b>M�todo 4:</b> Ra�z de un n�mero, tendr� un par�metro de entrada y uno de salida que ser� la soluci�n
	 * 
	 * @param num1
	 * 			N�mero que introduce el usuario (double)
	 * 
	 * @return <b>div4</b>
	 * 			Devolver� el resultado de Math.sqrt(num1). (double)
	 * 
	 */
		
	public double dividir4 (double num1) {
		return  Math.sqrt(num1);
	}
	
	/**
	 * <b>Casos especiales:</b>
	 * 
	 * Si num1 o num2 = 0, obtendr�mos una excepci�n de valor aritm�tico, pues el resultado es igual a infinito. 
	 * 
	 * En caso de no poder declarar n�meros de valores negativos, si los dos fuesen negativos, se anular�an entre ellos,
	 * es decir, (-/- = +), simplemente podr�an declararse los n�meros sin el valor negativo porque, por ejemplo, (([-2]/[-2]) = (2/2)), cuyo resultado es 1.
	 * 
	 * Lo primero, para obtener n�meros decimales en el resultado, hay que declararlos con variables double y utilizar n�meros d�cimales en dichas variables,
	 * debido a que, si no se declaran de la siguiente forma, Java utiliza un m�todo de redondeo y lo as�gna al valor real m�s cercano. 
	 * 
     * En el caso de la ra�z, la ra�z de un n�mero negativo no tiene soluci�n real, porque no existe un n�mero 
     * ni positivo ni negativo que al ser multiplicado por s� 
     * mismo d� resultado negativo.
	 *
	 */
	    
	public void especiales() {
		 return;
	 }
}
