import java.util.ArrayList;

public class Cuenta {
	private String numeroCuenta;
	private double saldo;
	private double limite;
	private String fechaApertura;
	private ArrayList<Tarjeta> tarjetas;
	
	public Cuenta(String numeroCuenta, double saldo, double limite, String fechaApertura) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.limite = limite;
		this.fechaApertura = fechaApertura;
		this.tarjetas = new ArrayList<>();
	}
	
	public Cuenta(String numeroCuenta, double saldo, double limite, String fechaApertura, ArrayList<Tarjeta> tarjetas) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.limite = limite;
		this.fechaApertura = fechaApertura;
		this.tarjetas = tarjetas;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(String fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public ArrayList<Tarjeta> getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(ArrayList<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}
	
	public void nuevaTarjeta(Tarjeta t) {
		this.tarjetas.add(t);
	}
	
	public String toString() {
		String texto = "---CUENTA: Numero: " + this.numeroCuenta + ".\n---Saldo: " + this.saldo + "€.\n---Limite: " + this.limite + "€.\n---Fecha de apertura: " + this.fechaApertura + ".\n---Tarjetas de credito asociadas:";
		for(Tarjeta i : this.tarjetas) {
			texto += "\n" + i.toString(); 
		}
			
		return texto;
	}
	
}
