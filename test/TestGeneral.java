import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestGeneral {

	@Test
	void test() throws Exception {
		ArrayList<Tarjeta> tarjetas1 = new ArrayList<>();
		ArrayList<Tarjeta> tarjetas2 = new ArrayList<>();
		ArrayList<Tarjeta> tarjetas3 = new ArrayList<>();
		Tarjeta t1 = new Tarjeta("6438-9345-6567", 350.8, 0);
		Tarjeta t2 = new Tarjeta("7443-0662-1123", 670.4, 3);
		Tarjeta t3 = new Tarjeta("1234-5678-9405", 150);
		Tarjeta t4 = new Tarjeta("1000-5000-9900", 250);
		
		tarjetas1.add(t1);
		tarjetas2.add(t2);
		tarjetas2.add(t3);
		tarjetas3.add(t4);
		
		ArrayList<Cuenta> cuentas1 = new ArrayList<>();
		ArrayList<Cuenta> cuentas2 = new ArrayList<>();
		ArrayList<Cuenta> cuentas3 = new ArrayList<>();
		Cuenta c1 = new Cuenta("999-786-444", 4500.0, 900.0, "05/06/2015", tarjetas1);
		Cuenta c2 = new Cuenta("456-027-722", 58000.3, 1200.0, "23/10/2012", tarjetas2);
		Cuenta c3 = new Cuenta("123-005-556", 2324.9, 450.5, "18/02/2017", tarjetas3);
		Cuenta c4 = new Cuenta("000-000-006", 10000, 50000, "18/07/2017");
		
		cuentas1.add(c1);
		cuentas2.add(c2);
		cuentas3.add(c3);
		cuentas3.add(c4);
		
		
		Cliente cl1 = new Cliente ("A1", "B1", "C1", "D1", "E1", 56, cuentas1);
		Cliente cl2 = new Cliente ("A2", "B2", "C2", "D2", "E2", 56, cuentas2);
		Cliente cl3 = new Cliente ("A3", "B3", "C3", "D3", "E3", 56, cuentas3);
		
		
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
	

}
