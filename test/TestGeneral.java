import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Clase de tests que comprueban los métodos de ingresar y retirar dinero y los métodos que muestran datos.
 * Combina las clases Tarjeta, Cuenta y Cliente.
 * @author Fernando Martino
 *
 */
class TestGeneral {
	ArrayList<Tarjeta> tarjetas1 = new ArrayList<>();
	ArrayList<Tarjeta> tarjetas2 = new ArrayList<>();
	ArrayList<Tarjeta> tarjetas3 = new ArrayList<>();
	Tarjeta t1 = new Tarjeta("6438-9345-6567", 350.8, 0);
	Tarjeta t2 = new Tarjeta("7443-0662-1123", 670.4, 3);
	Tarjeta t3 = new Tarjeta("1234-5678-9405", 150);
	Tarjeta t4 = new Tarjeta("1000-5000-9900", 250);
	
	
	ArrayList<Cuenta> cuentas1 = new ArrayList<>();
	ArrayList<Cuenta> cuentas2 = new ArrayList<>();
	ArrayList<Cuenta> cuentas3 = new ArrayList<>();
	
	ArrayList<Double> lista1 = new ArrayList<>();
	ArrayList<Double> lista2 = new ArrayList<>();
	ArrayList<Double> lista3 = new ArrayList<>();
	ArrayList<Double> lista4 = new ArrayList<>();
	
	Cuenta c1 = new Cuenta("999-786-444", 4500.0, 900.0, "05/06/2015", lista1, tarjetas1);
	Cuenta c2 = new Cuenta("456-027-722", 58000.3, 1200.0, "23/10/2012", lista2, tarjetas2);
	Cuenta c3 = new Cuenta("123-005-556", 2324.9, 450.5, "18/02/2017", lista3,tarjetas3);
	Cuenta c4 = new Cuenta("000-000-006", 10000, 50000, "18/07/2017", lista4);
	
	
	Cliente cl1 = new Cliente ("A1", "B1", "C1", "D1", "E1", 56, cuentas1);
	Cliente cl2 = new Cliente ("A2", "B2", "C2", "D2", "E2", 56, cuentas2);
	Cliente cl3 = new Cliente ("A3", "B3", "C3", "D3", "E3", 56, cuentas3);
	
	void listaSaldos() {
		lista1.add(4500.0);
		lista2.add(15000.0);
		lista2.add(30000.0);
		lista2.add(58000.3);
		lista3.add(5000.0);
		lista3.add(2324.9);
		lista4.add(10000.0);
	}
	
	void tarjetas() {
		tarjetas1.add(t1);
		tarjetas2.add(t2);
		tarjetas2.add(t3);
		tarjetas3.add(t4);
	}
	
	void cuentas() {
		cuentas1.add(c1);
		cuentas2.add(c2);
		cuentas3.add(c3);
		cuentas3.add(c4);
	}

	@Test
	void testIngresarRetirar() {
		listaSaldos();
		tarjetas();
		cuentas();
		
		cl1.ingresarDinero(340.7, c1);
		Assertions.assertEquals(4840.7, c1.getSaldo());
		
		//No deben cambiar el saldo de la cuenta porque el dinero a ingresar es 0 y negativo.
		cl1.ingresarDinero(0, c1);
		cl1.ingresarDinero(-14, c1);
		Assertions.assertEquals(4840.7, c1.getSaldo());
		
		//No debe cambiar el saldo de la cuenta porque esa cuenta no es de ese usuario.
		cl2.ingresarDinero(300, c4);
		Assertions.assertEquals(10000, c4.getSaldo());
		
		cl2.retirarDinero(1200, c2);
		Assertions.assertEquals(56800.3, c2.getSaldo());
		
		//No debe cambiar el saldo de la cuenta porque el dinero que se quiere sacar supera el limite.
		cl3.retirarDinero(500, c3);
		Assertions.assertEquals(2324.9, c3.getSaldo());
		
		//No debe cambiar el saldo de la cuenta porque esa cuenta no es de ese usuario.
		cl2.retirarDinero(300, c4);
		Assertions.assertEquals(10000, c4.getSaldo());
		
		
		//No deben cambiar el saldo de la cuenta porque el dinero a retirar es 0 y negativo.
		cl1.retirarDinero(0, c1);
		cl1.retirarDinero(-14, c1);
		Assertions.assertEquals(2324.9, c3.getSaldo());
		
		//No debe cambiar el saldo de la cuenta porque no se permite retirar dinero si el saldo se queda a 0 o menos.
		cl3.retirarDinero(30000, c4);
		Assertions.assertEquals(10000, c4.getSaldo());
	}
	
	@Test
	void testUsarTarjeta() {
		listaSaldos();
		tarjetas();
		cuentas();
		
		cl1.pagarConTarjeta(200, t1);
		Assertions.assertEquals(4300, c1.getSaldo());
		Assertions.assertEquals(1, t1.getNumeroUsos());
		
		//Este cliente tiene dos tarjetas para la misma cuenta.
		cl2.pagarConTarjeta(200, t2);
		cl2.pagarConTarjeta(100, t3);
		Assertions.assertEquals(57700.3, c2.getSaldo());
		Assertions.assertEquals(4, t2.getNumeroUsos());
		Assertions.assertEquals(1, t3.getNumeroUsos());
		
		//Este cliente tiene dos cuentas, pero solo tiene una tarjeta en una de las cuentas.
		cl3.pagarConTarjeta(24.9, t4);
		Assertions.assertEquals(2300, c3.getSaldo());
		Assertions.assertEquals(10000, c4.getSaldo());
		Assertions.assertEquals(1, t4.getNumeroUsos());
		
		
		//Esta operacion va no cambia nada porque no es su tarjeta.
		cl1.pagarConTarjeta(200, t4);
		Assertions.assertEquals(4300, c1.getSaldo());
		Assertions.assertEquals(2300, c3.getSaldo());
		Assertions.assertEquals(1, t4.getNumeroUsos());
		
		//Esta operacion va no cambia nada porque supera el limite de la tarjeta.
		cl2.pagarConTarjeta(200, t3);
		Assertions.assertEquals(57700.3, c2.getSaldo());
		Assertions.assertEquals(1, t3.getNumeroUsos());
		
		String textoTarjetaCl1 = "Tarjeta Numero: 6438-9345-6567. Usos de la tarjeta: 1.\n";
		Assertions.assertEquals(textoTarjetaCl1, cl1.verOperacionesConTarjeta());
		String textoTarjetaCl2 = "Tarjeta Numero: 7443-0662-1123. Usos de la tarjeta: 4.\nTarjeta Numero: 1234-5678-9405. Usos de la tarjeta: 1.\n";
		Assertions.assertEquals(textoTarjetaCl2, cl2.verOperacionesConTarjeta());
		String textoTarjetaCl3 = "Tarjeta Numero: 1000-5000-9900. Usos de la tarjeta: 1.\n";
		Assertions.assertEquals(textoTarjetaCl3, cl3.verOperacionesConTarjeta());
		
	}

	@Test
	void TestMostrarDatos() {
		listaSaldos();
		tarjetas();
		cuentas();
		
		String textoCl1 = "USUARIO:\n" + 
				"NIF: D1.\n" + 
				"Nombre: A1. Apellidos: B1. Edad: 56 años.\n" + 
				"Direccion: C1. Telefono: E1.\n" + 
				"CUENTAS BANCARIAS:\n" + 
				"---CUENTA: Numero: 999-786-444.\n" + 
				"---Saldo: 4500.0€.\n" + 
				"---Limite: 900.0€.\n" + 
				"---Fecha de apertura: 05/06/2015.\n" + 
				"---Tarjetas de credito asociadas:\n" + 
				"-----Tarjeta: Numero: 6438-9345-6567. Limite: 350.8€. Numero de usos: 0.";
		Assertions.assertEquals(textoCl1, cl1.verDatosUsuario());
		
		String textoCl2 = "USUARIO:\n" + 
				"NIF: D2.\n" + 
				"Nombre: A2. Apellidos: B2. Edad: 56 años.\n" + 
				"Direccion: C2. Telefono: E2.\n" + 
				"CUENTAS BANCARIAS:\n" + 
				"---CUENTA: Numero: 456-027-722.\n" + 
				"---Saldo: 58000.3€.\n" + 
				"---Limite: 1200.0€.\n" + 
				"---Fecha de apertura: 23/10/2012.\n" + 
				"---Tarjetas de credito asociadas:\n" + 
				"-----Tarjeta: Numero: 7443-0662-1123. Limite: 670.4€. Numero de usos: 3.\n" + 
				"-----Tarjeta: Numero: 1234-5678-9405. Limite: 150.0€. Numero de usos: 0.";
		Assertions.assertEquals(textoCl2, cl2.verDatosUsuario());
		
		String textoCl3 = "USUARIO:\n" + 
				"NIF: D3.\n" + 
				"Nombre: A3. Apellidos: B3. Edad: 56 años.\n" + 
				"Direccion: C3. Telefono: E3.\n" + 
				"CUENTAS BANCARIAS:\n" + 
				"---CUENTA: Numero: 123-005-556.\n" + 
				"---Saldo: 2324.9€.\n" + 
				"---Limite: 450.5€.\n" + 
				"---Fecha de apertura: 18/02/2017.\n" + 
				"---Tarjetas de credito asociadas:\n" + 
				"-----Tarjeta: Numero: 1000-5000-9900. Limite: 250.0€. Numero de usos: 0.\n" + 
				"---CUENTA: Numero: 000-000-006.\n" + 
				"---Saldo: 10000.0€.\n" + 
				"---Limite: 50000.0€.\n" + 
				"---Fecha de apertura: 18/07/2017.\n" + 
				"---Tarjetas de credito asociadas:";
		Assertions.assertEquals(textoCl3, cl3.verDatosUsuario());
	}
	
	@Test
	void TestMostrarDatosSaldoMedio() {
		listaSaldos();
		tarjetas();
		cuentas();
		
		String texto1 = "El saldo medio los últimos 12 meses en la cuenta 999-786-444 es de 4500.0€.\n";
		Assertions.assertEquals(texto1, cl1.verSaldoMedio());
		
		String texto2 = "El saldo medio los últimos 12 meses en la cuenta 456-027-722 es de 34333.433333333334€.\n";
		Assertions.assertEquals(texto2, cl2.verSaldoMedio());
		
		String texto3 = "El saldo medio los últimos 12 meses en la cuenta 123-005-556 es de 3662.45€.\n"
				+ "El saldo medio los últimos 12 meses en la cuenta 000-000-006 es de 10000.0€.\n";
		Assertions.assertEquals(texto3, cl3.verSaldoMedio());
	}

}
