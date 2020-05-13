import java.util.ArrayList;

public class Cliente {
	private String nombre, apellidos;
	private String direccion;
	private String nif;
	private String telefono;
	private int edad;
	private ArrayList<Cuenta> cuentas;

	public Cliente(String nombre, String apellidos, String direccion, String nif, String telefono, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.nif = nif;
		this.telefono = telefono;
		this.edad = edad;
		this.cuentas = new ArrayList<>();
	}

	public Cliente(String nombre, String apellidos, String direccion, String nif, String telefono, int edad , ArrayList<Cuenta> cuentas) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.nif = nif;
		this.telefono = telefono;
		this.edad = edad;
		this.cuentas = cuentas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}


	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	public void nuevaCuenta(Cuenta c) {
		this.cuentas.add(c);
	}

	public void ingresarDinero(double dinero, Cuenta c) {
		if(dinero < 1) System.out.println("El dinero a ingresar no puede ser 0 o negativo.");
		else {
			if(!this.cuentas.contains(c)) System.out.println("La cuenta seleccionada no pertenece a este usuario.");
			else
				c.setSaldo(c.getSaldo() + dinero);
		}
	}

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
	
	public String verOperacionesConTarjeta() {
		String texto = "";
		for(Cuenta i : this.cuentas) {
			for(Tarjeta j : i.getTarjetas()) {
				texto += "Tarjeta Numero: " + j.getNumeroTarjeta() + ". Usos de la tarjeta: " + j.getNumeroUsos() + ".\n";
			}
		}
		
		return texto;
	}
	
	public String verDatosUsuario() {
		String texto = "USUARIO:\nNIF: " + this.nif + ".\nNombre: " + this.nombre + ". Apellidos: " + this.apellidos + ". Edad: " + this.edad + " años.\n";
		texto += "Direccion: " + this.direccion + ". Telefono: " + this.telefono + ".\nCUENTAS BANCARIAS:";
		for(Cuenta i : this.cuentas) {
			texto += "\n" + i.toString();
		}
		
		return texto;
	}

}
