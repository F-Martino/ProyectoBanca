/**
 * Clase que representa a una tarjeta de crédito.
 * Contiene el número de la tarjeta, el límite de retirada y el número de veces que ha sido usada.
 * @author Fernando Martino
 *
 */
public class Tarjeta {
	private String numeroTarjeta;
	private double limite;
	private int numeroUsos;
		
	/**
	 * Constructor de la clase Tarjeta recibiendo el número de tarjeta, el límite de retirada y el número de usos.
	 * @param numeroTarjeta String - Número de tarjeta.
	 * @param limite double - Límite de retirada de la tarjeta.
	 * @param numeroUsos int - Número de veces que la tarjeta se ha usado.
	 */
	public Tarjeta(String numeroTarjeta, double limite, int numeroUsos) {
		this.numeroTarjeta = numeroTarjeta;
		this.limite = limite;
		this.numeroUsos = numeroUsos;
	}
	
	/**
	 * Constructor de la clase Tarjeta recibiendo el número de tarjeta y el límite de retiradas.
	 * El número de usos de la tarjeta será 0.
	 * @param numeroTarjeta String - Número de tarjeta.
	 * @param limite double - Límite de retirada de la tarjeta.
	 */
	public Tarjeta(String numeroTarjeta, double limite) {
		this.numeroTarjeta = numeroTarjeta;
		this.limite = limite;
		this.numeroUsos = 0;
	}

	/**
	 * Método que devuelve el número de tarjeta.
	 * @return numeroTarjeta String - Número de tarjeta.
	 */
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	/**
	 * Método que permite modificar el número de tarjeta.
	 * @param numeroTarjeta String - Nuevo número de tarjeta.
	 */
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	/**
	 * Método que devuelve el límite de retirada de la tarjeta.
	 * @return limite double - Límite de retirada de la tarjeta.
	 */
	public double getLimite() {
		return limite;
	}

	/**
	 * Método que permite modificar el límite de retirada de la tarjeta.
	 * @param limite double - Nuevo límite de retirada.
	 */
	public void setLimite(double limite) {
		this.limite = limite;
	}

	/**
	 * Método que devuelve las veces que se ha usado la tarjeta.
	 * @return numeroUsos int - Número de veces que se ha usado la tarjeta.
	 */
	public int getNumeroUsos() {
		return numeroUsos;
	}

	/**
	 * Método que permite modificar el número de usos de la tarjeta.
	 * @param numeroUsos int - Nuevo número de usos de la tarjeta.
	 */
	public void setNumeroUsos(int numeroUsos) {
		this.numeroUsos = numeroUsos;
	}
	
	/**
	 * Método que aumenta en uno el número de usos de la tarjeta.
	 */
	public void usarTarjeta() {
		this.numeroUsos++;
	}
	
	/**
	 * Método que devuelve un texto con toda la información sobre la tarjeta.
	 * @return informacion String - Texto con la información.
	 */
	public String toString() {
		String texto = "-----Tarjeta: Numero: " + this.numeroTarjeta + ". Limite: " + this.limite + "€. Numero de usos: " + this.numeroUsos + ".";
		return texto;
	}
	
}
