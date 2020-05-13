import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
	}

}
