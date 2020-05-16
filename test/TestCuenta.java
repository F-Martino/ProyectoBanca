import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Clase de tests que comprueban los constructores, getters y setters de la clase Cuenta.
 * @author Fernando
 *
 */
class TestCuenta {

	@Test
	void testCuenta() {
		Cuenta c1 = new Cuenta("999-786-444", 4500.0, 900.0, "05/06/2015");
		Cuenta c2 = new Cuenta("456-027-722", 58000.3, 1200.0, "23/10/2012");
		Cuenta c3 = new Cuenta("123-005-556", 2324.9, 450.5, "18/02/2017");
		
		Assertions.assertEquals("999-786-444", c1.getNumeroCuenta());
		Assertions.assertEquals(58000.3, c2.getSaldo());
		Assertions.assertEquals(450.5, c3.getLimite());
		Assertions.assertEquals("05/06/2015", c1.getFechaApertura());
		
		c2.setNumeroCuenta("456-127-722");
		c3.setSaldo(3672.89);
		c1.setLimite(915.0);
		c2.setFechaApertura("24/10/2012");
		
		Assertions.assertEquals("456-127-722", c2.getNumeroCuenta());
		Assertions.assertEquals(3672.89, c3.getSaldo());
		Assertions.assertEquals(915.0, c1.getLimite());
		Assertions.assertEquals("24/10/2012", c2.getFechaApertura());
	
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
		
		Cuenta c4 = new Cuenta("000-000-006", 10000, 500, "18/07/2017", tarjetas1);
		c3.setTarjetas(tarjetas2);
		c1.nuevaTarjeta(t4);
		
		Assertions.assertEquals(tarjetas1, c4.getTarjetas());
		Assertions.assertEquals(tarjetas2, c3.getTarjetas());
		Assertions.assertEquals(tarjetas3, c1.getTarjetas());
	}

}
