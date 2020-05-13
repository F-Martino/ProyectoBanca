
public class Tarjeta {
	private String numeroTarjeta;
	private double limite;
	private int numeroUsos;
		
	public Tarjeta(String numeroTarjeta, double limite, int numeroUsos) {
		this.numeroTarjeta = numeroTarjeta;
		this.limite = limite;
		this.numeroUsos = numeroUsos;
	}
	
	public Tarjeta(String numeroTarjeta, double limite) {
		this.numeroTarjeta = numeroTarjeta;
		this.limite = limite;
		this.numeroUsos = 0;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public int getNumeroUsos() {
		return numeroUsos;
	}

	public void setNumeroUsos(int numeroUsos) {
		this.numeroUsos = numeroUsos;
	}
	
	public void usarTarjeta() {
		this.numeroUsos++;
	}
	
	public String toString() {
		String texto = "-----Tarjeta: Numero: " + this.numeroTarjeta + ". Limite: " + this.limite + "€. Numero de usos: " + this.numeroUsos + ".";
		return texto;
	}
	
}
