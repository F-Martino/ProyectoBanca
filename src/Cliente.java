import java.util.ArrayList;

/**
 * Clase que guarda los datos de un cliente.
 * Sus datos son el nombre, apellidos, dirección, NIF, teléfono, edad y una lista con sus cuentas bancarias.
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
	 * Constructor de la clase Cliente. Recibe el nombre, apellidos, dirección, NIF, teléfono y edad.
	 * La lista de las cuentas bancarias se inicializa vacía.
	 * @param nombre String - Nombre del cliente.
	 * @param apellidos String - Apellidos del cliente.
	 * @param direccion String - Dirección del cliente.
	 * @param nif String - NIF del cliente.
	 * @param telefono String - Número de teléfono del cliente.
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
	 * Constructor de la clase Cliente. Recibe el nombre, apellidos, dirección, NIF, teléfono y edad.
	 * La lista de las cuentas bancarias se inicializa vacía.
	 * @param nombre String - Nombre del cliente.
	 * @param apellidos String - Apellidos del cliente.
	 * @param direccion String - Dirección del cliente.
	 * @param nif String - NIF del cliente.
	 * @param telefono String - Número de teléfono del cliente.
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
	 * Método que devuelve el nombre del cliente.
	 * @return nombre String - Nombre del cliente.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método que permite modificar el nombre del cliente.
	 * @param nombre String - Nuevo nombre del cliente.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método que devuelve los apellidos del cliente.
	 * @return apellidos String - Apellidos del cliente.
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Método que permite modificar los apellidos del cliente.
	 * @param apellidos String - Nuevos apellidos del cliente.
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Método que devuelve la dirección del cliente.
	 * @return direccion String - Dirección del cliente.
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Método que permite modificar la dirección del cliente.
	 * @param direccion String - Nueva dirección del cliente.
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Método que devuelve el NIF del cliente.
	 * @return nif String - NIF del cliente.
	 */
	public String getNif() {
		return nif;
	}

	/**
	 * Método que permite modificar el NIF del cliente.
	 * @param nif String - Nuevo NIF del cliente.
	 */
	public void setNif(String nif) {
		this.nif = nif;
	}

	/**
	 * Método que devuelve el número de teléfono del cliente.
	 * @return telefono String - Número de teléfono del cliente.
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Método que permite modificar el número de teléfono del cliente.
	 * @param telefono String - Nuevo número de teléfono del cliente.
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * Método que devuelve la edad del cliente.
	 * @return edad int - Edad de teléfono del cliente.
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Método que permite modificar la edad del cliente.
	 * @param telefono String - Nueva edad del cliente.
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Método que devuelve la lista de cuentas bancarias del cliente.
	 * @return cuentas ArrayList[Cuenta] - Lista de cuentas bancarias del cliente.
	 */
	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}

	/**
	 * Método que permite modificar la lista de cuentas bancarias del cliente.
	 * @param telefono String - Nueva lista de cuentas bancarias del cliente.
	 */
	public void setCuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	/**
	 * Método que permite añadir una cuenta bancaria nueva a la lista de cuentas del cliente.
	 * @param cuenta Cuenta - Nueva cuenta bancaria.
	 */
	public void nuevaCuenta(Cuenta c) {
		this.cuentas.add(c);
	}

	/**
	 * Método que aumenta el saldo de la cuenta seleccionada.
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
	 * Método que disminuye el saldo de la cuenta seleccionada.
	 * El dinero a retirar no puede ser 0 o negativo.
	 * No se puede retirar dinero de una cuenta que no sea del cliente.
	 * No puede retirarse dinero si el saldo se va a quedar a 0 o negativo.
	 * No se puede retirar más dinero del permitido por el límite de retirada de la cuenta.
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
	 * Método que disminuye el saldo de la cuenta a la que esté asociada la tarjeta y aumenta el número de usos de la tarjeta.
	 * Tiene las mismas restricciones que el método retirarDinero y además no permite usarse si el dinero a retirar supera
	 * el límite de retirada de la tarjeta o si la tarjeta no pertenece al cliente, es decir, no está asociada a alguna
	 * de la cuentas del cliente.
	 * @param dinero double - Dinero que se va a retirar.
	 * @param T Tarjeta - Tarjeta de crédito que se va a usar.
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
	 * Método que devuelve un texto con la información de cuantas veces se ha usado todas las tarjetas del cliente.
	 * @return texto String - Información de las veces que el usuario ha usado sus tarjetas de crédito.
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
	 * Método que devuelve un texto con la información del cliente, sus cuentas bancarias y sus tarjetas de crédito.
	 * @return texto String - Información del cliente.
	 */
	public String verDatosUsuario() {
		String texto = "USUARIO:\nNIF: " + this.nif + ".\nNombre: " + this.nombre + ". Apellidos: " + this.apellidos + ". Edad: " + this.edad + " años.\n";
		texto += "Direccion: " + this.direccion + ". Telefono: " + this.telefono + ".\nCUENTAS BANCARIAS:";
		for(Cuenta i : this.cuentas) {
			texto += "\n" + i.toString();
		}
		
		return texto;
	}
	
	/**
	 * Método que devuelve la información del saldo medio de las cuentas del cliente en los últimos 12 meses.
	 * @return texto String - Información del saldo medio de las cuentas en los últimos 12 meses.
	 */
	public String verSaldoMedio() {
		String texto = "";
		return texto;
	}

}
