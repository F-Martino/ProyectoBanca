import java.util.ArrayList;

/**
 * Clase que guarda los datos de un cliente.
 * Sus datos son el nombre, apellidos, direcci�n, NIF, tel�fono, edad y una lista con sus cuentas bancarias.
 * @author Fernando
 *
 */
public class Cliente {
	private String nombre, apellidos;
	private String direccion;
	private String nif;
	private String telefono;
	private int edad;
	private ArrayList<Cuenta> cuentas;

	/**
	 * Constructor de la clase Cliente. Recibe el nombre, apellidos, direcci�n, NIF, tel�fono y edad.
	 * La lista de las cuentas bancarias se inicializa vac�a.
	 * @param nombre String - Nombre del cliente.
	 * @param apellidos String - Apellidos del cliente.
	 * @param direccion String - Direcci�n del cliente.
	 * @param nif String - NIF del cliente.
	 * @param telefono String - N�mero de tel�fono del cliente.
	 * @param edad int - Edad del cliente.
	 */
	public Cliente(String nombre, String apellidos, String direccion, String nif, String telefono, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.nif = nif;
		this.telefono = telefono;
		this.edad = edad;
		this.cuentas = new ArrayList<>();
	}

	/**
	 * Constructor de la clase Cliente. Recibe el nombre, apellidos, direcci�n, NIF, tel�fono y edad.
	 * La lista de las cuentas bancarias se inicializa vac�a.
	 * @param nombre String - Nombre del cliente.
	 * @param apellidos String - Apellidos del cliente.
	 * @param direccion String - Direcci�n del cliente.
	 * @param nif String - NIF del cliente.
	 * @param telefono String - N�mero de tel�fono del cliente.
	 * @param edad int - Edad del cliente.
	 * @param cuentas ArrayList[Cuenta] - Lista de las cuentas bancarias del cliente.
	 */
	public Cliente(String nombre, String apellidos, String direccion, String nif, String telefono, int edad , ArrayList<Cuenta> cuentas) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.nif = nif;
		this.telefono = telefono;
		this.edad = edad;
		this.cuentas = cuentas;
	}

	/**
	 * M�todo que devuelve el nombre del cliente.
	 * @return nombre String - Nombre del cliente.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * M�todo que permite modificar el nombre del cliente.
	 * @param nombre String - Nuevo nombre del cliente.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * M�todo que devuelve los apellidos del cliente.
	 * @return apellidos String - Apellidos del cliente.
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * M�todo que permite modificar los apellidos del cliente.
	 * @param apellidos String - Nuevos apellidos del cliente.
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * M�todo que devuelve la direcci�n del cliente.
	 * @return direccion String - Direcci�n del cliente.
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * M�todo que permite modificar la direcci�n del cliente.
	 * @param direccion String - Nueva direcci�n del cliente.
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * M�todo que devuelve el NIF del cliente.
	 * @return nif String - NIF del cliente.
	 */
	public String getNif() {
		return nif;
	}

	/**
	 * M�todo que permite modificar el NIF del cliente.
	 * @param nif String - Nuevo NIF del cliente.
	 */
	public void setNif(String nif) {
		this.nif = nif;
	}

	/**
	 * M�todo que devuelve el n�mero de tel�fono del cliente.
	 * @return telefono String - N�mero de tel�fono del cliente.
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * M�todo que permite modificar el n�mero de tel�fono del cliente.
	 * @param telefono String - Nuevo n�mero de tel�fono del cliente.
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * M�todo que devuelve la edad del cliente.
	 * @return edad int - Edad de tel�fono del cliente.
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * M�todo que permite modificar la edad del cliente.
	 * @param edad String - Nueva edad del cliente.
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * M�todo que devuelve la lista de cuentas bancarias del cliente.
	 * @return cuentas ArrayList[Cuenta] - Lista de cuentas bancarias del cliente.
	 */
	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}

	/**
	 * M�todo que permite modificar la lista de cuentas bancarias del cliente.
	 * @param cuentas String - Nueva lista de cuentas bancarias del cliente.
	 */
	public void setCuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	/**
	 * M�todo que permite a�adir una cuenta bancaria nueva a la lista de cuentas del cliente.
	 * @param c Cuenta - Nueva cuenta bancaria.
	 */
	public void nuevaCuenta(Cuenta c) {
		this.cuentas.add(c);
	}

	/**
	 * M�todo que aumenta el saldo de la cuenta seleccionada.
	 * El dinero a ingresar no puede ser 0 o negativo. Y no se puede ingresar dinero en una cuenta que no sea del cliente.
	 * @param dinero double - Dinero a ingresar.
	 * @param c Cuenta - Cuenta bancaria en la que se va a ingresar el dinero.
	 */
	public void ingresarDinero(double dinero, Cuenta c) {
		if(dinero < 1) System.out.println("El dinero a ingresar no puede ser 0 o negativo.");
		else {
			if(!this.cuentas.contains(c)) System.out.println("La cuenta seleccionada no pertenece a este usuario.");
			else
				c.setSaldo(c.getSaldo() + dinero);
		}
	}

	/**
	 * M�todo que disminuye el saldo de la cuenta seleccionada.
	 * El dinero a retirar no puede ser 0 o negativo.
	 * No se puede retirar dinero de una cuenta que no sea del cliente.
	 * No puede retirarse dinero si el saldo se va a quedar a 0 o negativo.
	 * No se puede retirar m�s dinero del permitido por el l�mite de retirada de la cuenta.
	 * @param dinero double - Dinero a retirar.
	 * @param c Cuenta - Cuenta bancaria de la que se va a retirar el dinero.
	 */
	public void retirarDinero(double dinero, Cuenta c) {
		if(dinero < 1) System.out.println("El dinero a retirar no puede ser 0 o negativo.");
		else {
			if(!this.cuentas.contains(c)) System.out.println("La cuenta seleccionada no pertenece a este usuario.");
			else {

				if(dinero >= c.getSaldo()) System.out.println("El saldo no puede quedarse a 0 o negativo.");
				else {
					if(dinero > c.getLimite()) System.out.println("No puede retirarse mas dinero del limite permitido.");
					else
						c.setSaldo(c.getSaldo() - dinero);

				}
			}
		}
	}

	/**
	 * M�todo que disminuye el saldo de la cuenta a la que est� asociada la tarjeta y aumenta el n�mero de usos de la tarjeta.
	 * Tiene las mismas restricciones que el m�todo retirarDinero y adem�s no permite usarse si el dinero a retirar supera
	 * el l�mite de retirada de la tarjeta o si la tarjeta no pertenece al cliente, es decir, no est� asociada a alguna
	 * de la cuentas del cliente.
	 * @param dinero double - Dinero que se va a retirar.
	 * @param T Tarjeta - Tarjeta de cr�dito que se va a usar.
	 */
	public void pagarConTarjeta(double dinero, Tarjeta T) {
		boolean tarjetaValida = false;
		int punteroCuenta = 0;
		int punteroAux = 0;
		for(Cuenta i : this.cuentas) {
			if(i.getTarjetas().contains(T)) {
				tarjetaValida = true;
				punteroCuenta = punteroAux;
			}
			punteroAux++;
		}
		if(!tarjetaValida) System.out.println("La tarjeta seleccionada no pertenece este usuario.");
		else {
			if(dinero > T.getLimite()) System.out.println("El pago supera el limite de la tarjeta.");
			else {
				retirarDinero(dinero, this.cuentas.get(punteroCuenta));
				T.usarTarjeta();
			}
		}
	}
	
	/**
	 * M�todo que devuelve un texto con la informaci�n de cuantas veces se ha usado todas las tarjetas del cliente.
	 * @return texto String - Informaci�n de las veces que el usuario ha usado sus tarjetas de cr�dito.
	 */
	public String verOperacionesConTarjeta() {
		String texto = "";
		for(Cuenta i : this.cuentas) {
			for(Tarjeta j : i.getTarjetas()) {
				texto += "Tarjeta Numero: " + j.getNumeroTarjeta() + ". Usos de la tarjeta: " + j.getNumeroUsos() + ".\n";
			}
		}
		
		return texto;
	}
	
	/**
	 * M�todo que devuelve un texto con la informaci�n del cliente, sus cuentas bancarias y sus tarjetas de cr�dito.
	 * @return texto String - Informaci�n del cliente.
	 */
	public String verDatosUsuario() {
		String texto = "USUARIO:\nNIF: " + this.nif + ".\nNombre: " + this.nombre + ". Apellidos: " + this.apellidos + ". Edad: " + this.edad + " a�os.\n";
		texto += "Direccion: " + this.direccion + ". Telefono: " + this.telefono + ".\nCUENTAS BANCARIAS:";
		for(Cuenta i : this.cuentas) {
			texto += "\n" + i.toString();
		}
		
		return texto;
	}
	
	/**
	 * M�todo que devuelve la informaci�n del saldo medio de las cuentas del cliente en los �ltimos 12 meses.
	 * @return texto String - Informaci�n del saldo medio de las cuentas en los �ltimos 12 meses.
	 */
	public String verSaldoMedio() {
		String texto = "";
		return texto;
	}

}
