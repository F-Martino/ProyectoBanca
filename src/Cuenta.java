import java.util.ArrayList;

/**
 * Clase que guarda los datos de una cuenta.
 * El n�mero de cuenta, saldo, l�mite de retirada, fecha de apertura y tarjetas asociadas a la cuenta.
 * @author Fernando Martino
 *
 */
public class Cuenta {
	private String numeroCuenta;
	private double saldo;
	private double limite;
	private String fechaApertura;
	private ArrayList<Tarjeta> tarjetas;
	
	/**
	 * Constructor de la clase Cuenta, recibiendo como parametros el n�mero de cuenta,
	 * el saldo, el l�mite de retirada y la fecha de apertura.
	 * Inicializa la lista de tarjetas como una lista vac�a.
	 * @param numeroCuenta String - Numero de cuenta.
	 * @param saldo double - Saldo de la cuenta.
	 * @param limite double - Limite de retirada permitido en la cuenta.
	 * @param fechaApertura String - D�a en que la cuenta fue creada.
	 */
	public Cuenta(String numeroCuenta, double saldo, double limite, String fechaApertura) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.limite = limite;
		this.fechaApertura = fechaApertura;
		this.tarjetas = new ArrayList<>();
	}
	
	/**
	 * Constructor de la clase Cuenta, recibiendo como parametros el n�mero de cuenta,
	 * el saldo, el l�mite de retirada, la fecha de apertura y la lista de las tarjetas.
	 * @param numeroCuenta String - N�mero de cuenta.
	 * @param saldo double - Saldo de la cuenta.
	 * @param limite double - L�mite de retirada permitido en la cuenta.
	 * @param fechaApertura String - D�a en que la cuenta fue creada.
	 * @param tarjetas ArrayList[Tarjetas] - Lista con las tarjetas asociadas a la cuenta.
	 */
	public Cuenta(String numeroCuenta, double saldo, double limite, String fechaApertura, ArrayList<Tarjeta> tarjetas) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.limite = limite;
		this.fechaApertura = fechaApertura;
		this.tarjetas = tarjetas;
	}

	/**
	 * M�todo que devuelve el n�mero de cuenta.
	 * @return numeroCuenta String - N�mero de cuenta actual.
	 */
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	/**
	 * M�todo que permite modificar el n�mero de cuenta.
	 * @param numeroCuenta String - Nuevo n�mero de cuenta.
	 */
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	/**
	 * M�todo que devuelve el saldo de la cuenta.
	 * @return saldo double - Saldo actual de la cuenta.
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * M�todo que permite modificar el saldo de la cuenta.
	 * @param saldo double - Nuevo saldo de la cuenta.
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * M�todo que devuelve el l�mite de retirada de la cuenta.
	 * @return saldo double - L�mite de retirada actual de la cuenta.
	 */
	public double getLimite() {
		return limite;
	}

	/**
	 * M�todo que permite modificar el l�mite de retirada de la cuenta.
	 * @param saldo double - Nuevo l�mite de retirada de la cuenta.
	 */
	public void setLimite(double limite) {
		this.limite = limite;
	}

	/**
	 * M�todo que devuelve la fecha de apertura de la cuenta.
	 * @return numeroCuenta String - Fecha de apertura de la cuenta.
	 */
	public String getFechaApertura() {
		return fechaApertura;
	}

	/**
	 * M�todo que permite modificar la fecha de apertura de la cuenta.
	 * @param numeroCuenta String - Nueva fecha de apertura de la cuenta.
	 */
	public void setFechaApertura(String fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	/**
	 * M�todo que devuelve la lista de tarjetas asociadas a la cuenta.
	 * @return tarjetas ArrayList[Tarjetas] - Lista de las tarjetas.
	 */
	public ArrayList<Tarjeta> getTarjetas() {
		return tarjetas;
	}

	/**
	 * M�todo que permite modificar la lista de tarjetas asociadas a la cuenta.
	 * @param tarjetas ArrayList[Tarjetas] - Nueva lista de las tarjetas.
	 */
	public void setTarjetas(ArrayList<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}
	
	/**
	 * M�todo que permite a�adir una nueva tarjeta asociada a la cuenta.
	 * @param tarjeta Tarjeta - Nueva tarjeta asociada a la cuenta.
	 */
	public void nuevaTarjeta(Tarjeta t) {
		this.tarjetas.add(t);
	}
	
	/**
	 * M�todo que devuelve un texto con toda la informaci�n sobre la cuenta y sobre sus tarjetas asociadas.
	 * @return informacion String - Texto con la informaci�n.
	 */
	public String toString() {
		String texto = "---CUENTA: Numero: " + this.numeroCuenta + ".\n---Saldo: " + this.saldo + "�.\n---Limite: " + this.limite + "�.\n---Fecha de apertura: " + this.fechaApertura + ".\n---Tarjetas de credito asociadas:";
		for(Tarjeta i : this.tarjetas) {
			texto += "\n" + i.toString(); 
		}
			
		return texto;
	}
	
}
