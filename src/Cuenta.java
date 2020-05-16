import java.util.ArrayList;

/**
 * Clase que guarda los datos de una cuenta.
 * El número de cuenta, saldo, límite de retirada, fecha de apertura y tarjetas asociadas a la cuenta.
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
	 * Constructor de la clase Cuenta, recibiendo como parametros el número de cuenta,
	 * el saldo, el límite de retirada y la fecha de apertura.
	 * Inicializa la lista de tarjetas como una lista vacía.
	 * @param numeroCuenta String - Numero de cuenta.
	 * @param saldo double - Saldo de la cuenta.
	 * @param limite double - Limite de retirada permitido en la cuenta.
	 * @param fechaApertura String - Día en que la cuenta fue creada.
	 */
	public Cuenta(String numeroCuenta, double saldo, double limite, String fechaApertura) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.limite = limite;
		this.fechaApertura = fechaApertura;
		this.tarjetas = new ArrayList<>();
	}
	
	/**
	 * Constructor de la clase Cuenta, recibiendo como parametros el número de cuenta,
	 * el saldo, el límite de retirada, la fecha de apertura y la lista de las tarjetas.
	 * @param numeroCuenta String - Número de cuenta.
	 * @param saldo double - Saldo de la cuenta.
	 * @param limite double - Límite de retirada permitido en la cuenta.
	 * @param fechaApertura String - Día en que la cuenta fue creada.
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
	 * Método que devuelve el número de cuenta.
	 * @return numeroCuenta String - Número de cuenta actual.
	 */
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	/**
	 * Método que permite modificar el número de cuenta.
	 * @param numeroCuenta String - Nuevo número de cuenta.
	 */
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	/**
	 * Método que devuelve el saldo de la cuenta.
	 * @return saldo double - Saldo actual de la cuenta.
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Método que permite modificar el saldo de la cuenta.
	 * @param saldo double - Nuevo saldo de la cuenta.
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Método que devuelve el límite de retirada de la cuenta.
	 * @return limite double - Límite de retirada actual de la cuenta.
	 */
	public double getLimite() {
		return limite;
	}

	/**
	 * Método que permite modificar el límite de retirada de la cuenta.
	 * @param limite double - Nuevo límite de retirada de la cuenta.
	 */
	public void setLimite(double limite) {
		this.limite = limite;
	}

	/**
	 * Método que devuelve la fecha de apertura de la cuenta.
	 * @return fechaApertura String - Fecha de apertura de la cuenta.
	 */
	public String getFechaApertura() {
		return fechaApertura;
	}

	/**
	 * Método que permite modificar la fecha de apertura de la cuenta.
	 * @param fechaApertura String - Nueva fecha de apertura de la cuenta.
	 */
	public void setFechaApertura(String fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	/**
	 * Método que devuelve la lista de tarjetas asociadas a la cuenta.
	 * @return tarjetas ArrayList[Tarjetas] - Lista de las tarjetas.
	 */
	public ArrayList<Tarjeta> getTarjetas() {
		return tarjetas;
	}

	/**
	 * Método que permite modificar la lista de tarjetas asociadas a la cuenta.
	 * @param tarjetas ArrayList[Tarjetas] - Nueva lista de las tarjetas.
	 */
	public void setTarjetas(ArrayList<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}
	
	/**
	 * Método que permite añadir una nueva tarjeta asociada a la cuenta.
	 * @param t Tarjeta - Nueva tarjeta asociada a la cuenta.
	 */
	public void nuevaTarjeta(Tarjeta t) {
		this.tarjetas.add(t);
	}
	
	/**
	 * Método que devuelve un texto con toda la información sobre la cuenta y sobre sus tarjetas asociadas.
	 * @return informacion String - Texto con la información.
	 */
	public String toString() {
		String texto = "---CUENTA: Numero: " + this.numeroCuenta + ".\n---Saldo: " + this.saldo + "€.\n---Limite: " + this.limite + "€.\n---Fecha de apertura: " + this.fechaApertura + ".\n---Tarjetas de credito asociadas:";
		for(Tarjeta i : this.tarjetas) {
			texto += "\n" + i.toString(); 
		}
			
		return texto;
	}
	
}
