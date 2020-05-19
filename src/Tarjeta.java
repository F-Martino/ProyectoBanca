/**
 * Clase que representa a una tarjeta de cr�dito.
 * Contiene el n�mero de la tarjeta, el l�mite de retirada y el n�mero de veces que ha sido usada.
 * @author Fernando Martino
 *
 */
public class Tarjeta {
	private String numeroTarjeta;
	private double limite;
	private int numeroUsos;
		
	/**
	 * Constructor de la clase Tarjeta recibiendo el n�mero de tarjeta, el l�mite de retirada y el n�mero de usos.
	 * @param numeroTarjeta String - N�mero de tarjeta.
	 * @param limite double - L�mite de retirada de la tarjeta.
	 * @param numeroUsos int - N�mero de veces que la tarjeta se ha usado.
	 */
	public Tarjeta(String numeroTarjeta, double limite, int numeroUsos) {
		this.numeroTarjeta = numeroTarjeta;
		this.limite = limite;
		this.numeroUsos = numeroUsos;
	}
	
	/**
	 * Constructor de la clase Tarjeta recibiendo el n�mero de tarjeta y el l�mite de retiradas.
	 * El n�mero de usos de la tarjeta ser� 0.
	 * @param numeroTarjeta String - N�mero de tarjeta.
	 * @param limite double - L�mite de retirada de la tarjeta.
	 */
	public Tarjeta(String numeroTarjeta, double limite) {
		this.numeroTarjeta = numeroTarjeta;
		this.limite = limite;
		this.numeroUsos = 0;
	}

	/**
	 * M�todo que devuelve el n�mero de tarjeta.
	 * @return numeroTarjeta String - N�mero de tarjeta.
	 */
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	/**
	 * M�todo que permite modificar el n�mero de tarjeta.
	 * @param numeroTarjeta String - Nuevo n�mero de tarjeta.
	 */
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	/**
	 * M�todo que devuelve el l�mite de retirada de la tarjeta.
	 * @return limite double - L�mite de retirada de la tarjeta.
	 */
	public double getLimite() {
		return limite;
	}

	/**
	 * M�todo que permite modificar el l�mite de retirada de la tarjeta.
	 * @param limite double - Nuevo l�mite de retirada.
	 */
	public void setLimite(double limite) {
		this.limite = limite;
	}

	/**
	 * M�todo que devuelve las veces que se ha usado la tarjeta.
	 * @return numeroUsos int - N�mero de veces que se ha usado la tarjeta.
	 */
	public int getNumeroUsos() {
		return numeroUsos;
	}

	/**
	 * M�todo que permite modificar el n�mero de usos de la tarjeta.
	 * @param numeroUsos int - Nuevo n�mero de usos de la tarjeta.
	 */
	public void setNumeroUsos(int numeroUsos) {
		this.numeroUsos = numeroUsos;
	}
	
	/**
	 * M�todo que aumenta en uno el n�mero de usos de la tarjeta.
	 */
	public void usarTarjeta() {
		this.numeroUsos++;
	}
	
	/**
	 * M�todo que devuelve un texto con toda la informaci�n sobre la tarjeta.
	 * @return informacion String - Texto con la informaci�n.
	 */
	public String toString() {
		String texto = "-----Tarjeta: Numero: " + this.numeroTarjeta + ". Limite: " + this.limite + "�. Numero de usos: " + this.numeroUsos + ".";
		return texto;
	}
	
}
